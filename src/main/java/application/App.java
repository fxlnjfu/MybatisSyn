package application;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import Util.ObjectUtil;
import mybatis.mapper.FieldSynInfoMapper;
import mybatis.mapper.MerBaseInfoMapper;
import mybatis.mapper.MerBaseInfoSynMapper;
import mybatis.mapper.MerTransInfoMapper;
import mybatis.mapper.MerTransInfoSynMapper;
import mybatis.mapper.TableSynInfoMapper;
import mybatis.mapper.UsrInfoMapper;
import mybatis.mapper.UsrInfoSynMapper;
import mybatis.model.FieldSynInfo;
import mybatis.model.FieldSynInfoExample;
import mybatis.model.MerBaseInfo;
import mybatis.model.MerBaseInfoExample;
import mybatis.model.MerBaseInfoSyn;
import mybatis.model.MerBaseInfoSynExample;
import mybatis.model.MerTransInfo;
import mybatis.model.MerTransInfoExample;
import mybatis.model.MerTransInfoSyn;
import mybatis.model.MerTransInfoSynExample;
import mybatis.model.TableSynInfo;
import mybatis.model.TableSynInfoExample;
import mybatis.model.UsrInfo;
import mybatis.model.UsrInfoExample;
import mybatis.model.UsrInfoSyn;
import mybatis.model.UsrInfoSynExample;

public class App 
{
	private SqlSession session;
	private Logger logger;
	
	public static void main( String[] args ) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
    {
    	App app = new App();
    	
    	app.initApp();
    	
		app.doBiz();
		
    }

	public void initApp() throws IOException {
		//利用数据库连接池 POOLED 使用默认的连接池参数（active：10，idle：5）
    	String resource = "config/mybatis-configuration.xml";
    	InputStream inputStream = Resources.getResourceAsStream(resource);
    	SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		session = sessionFactory.openSession();
		logger = Logger.getLogger(App.class);
	}
	
	public void doBiz() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//查询同步表,查找有效状态为“1”的数据
		TableSynInfoMapper tableSynInfoMapper = session.getMapper(TableSynInfoMapper.class);
		TableSynInfoExample tableSynInfoExample = new TableSynInfoExample();
		tableSynInfoExample.createCriteria().andTableStatEqualTo("1");
		List<TableSynInfo> tableSynInfos = tableSynInfoMapper.selectByExample(tableSynInfoExample);
		
		if (tableSynInfos.size() == 0) {
			logger.info("同步表中没有配置数据，请配置数据");
			return;
		}
		
		for (TableSynInfo tableSynInfo : tableSynInfos) {
			logger.info("开始同步表：" + tableSynInfo.getTableName());
			
			//查询字段表，根据表名，查询所有有效状态为“1”的记录
			FieldSynInfoMapper fieldSynInfoMapper = session.getMapper(FieldSynInfoMapper.class);
			FieldSynInfoExample fieldSynInfoExample = new FieldSynInfoExample();
			fieldSynInfoExample.createCriteria().andTableStatEqualTo("1").andTableNameEqualTo(tableSynInfo.getTableName());
			
			List<FieldSynInfo> fieldSynInfos = fieldSynInfoMapper.selectByExample(fieldSynInfoExample);
			
			if (fieldSynInfos.size() == 0) {
				logger.info("同步字段中没有配置数据，请配置数据");
			}
			
			for (FieldSynInfo fieldSynInfo : fieldSynInfos) {
				logger.info("开始同步表：" + fieldSynInfo.getTableName() + "表字段：" + fieldSynInfo.getFieldName() +
							"字段值：" + fieldSynInfo.getFieldValue());
				if (fieldSynInfo.getTableName().equals("mer_base_info")) {
					doBizMerBaseInfo(fieldSynInfo);
				} else if (fieldSynInfo.getTableName().equals("mer_trans_info")) {
					doBizMerTransInfo(fieldSynInfo);
				} else if (fieldSynInfo.getTableName().equals("usr_info")) {
					doBizUsrInfo(fieldSynInfo);
				}
				
			}
		}
		
		session.commit();
		
		logger.info("同步结束!");
	}
    
    void doBizMerBaseInfo(FieldSynInfo fieldSynInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	//根据商户号到mer_base_info表中去找
    	MerBaseInfoMapper merBaseInfoMapper = session.getMapper(MerBaseInfoMapper.class);
		MerBaseInfoExample merBaseInfoExample = new MerBaseInfoExample();
		
		String merId = fieldSynInfo.getFieldValue();
		merBaseInfoExample.createCriteria().andMerIdEqualTo(merId);
		List<MerBaseInfo> merBaseInfos = merBaseInfoMapper.selectByExample(merBaseInfoExample);
		if (merBaseInfos.size() == 0) {
			logger.info("未在mer_base_info表中找到商户号:" + merId);
			
			return;
		}
		
		//根据商户号到mer_base_info_syn表中去找
		MerBaseInfoSynMapper merBaseInfoSynMapper = session.getMapper(MerBaseInfoSynMapper.class);
		MerBaseInfoSynExample merBaseInfoSynExample = new MerBaseInfoSynExample();
		merBaseInfoSynExample.createCriteria().andMerIdEqualTo(merId);
		List<MerBaseInfoSyn> merBaseInfoSyns = merBaseInfoSynMapper.selectByExample(merBaseInfoSynExample);
		
		if (merBaseInfoSyns.size() == 0) {
			logger.info("未在mer_base_info_syn中找到数据，需要插入数据库");
			MerBaseInfoSyn merBaseInfoSyn = new MerBaseInfoSyn();
			ObjectUtil.copy(merBaseInfos.get(0), merBaseInfoSyn);
			merBaseInfoSynMapper.insert(merBaseInfoSyn);
		} else {
			logger.info("在mer_base_info_syn中找到数据，判断两条记录否相等，不等则更新");
			if (false == ObjectUtil.compareAndAssign(merBaseInfos.get(0), merBaseInfoSyns.get(0))) {
				logger.info("两者不相等");
				MerBaseInfoSynExample example = new MerBaseInfoSynExample();
				example.createCriteria().andMerIdEqualTo(merId);
				
				//需要调用set才会更新，已经在compareAndAssign中通过反射调用了set函数
				merBaseInfoSynMapper.updateByExampleSelective(merBaseInfoSyns.get(0), example);
			} else {
				logger.info("两者相等，无需更新");
			};
		}
    }
    
    void doBizMerTransInfo(FieldSynInfo fieldSynInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//根据商户号到mer_trans_info表中去找
		MerTransInfoMapper merTransInfoMapper = session.getMapper(MerTransInfoMapper.class);
		MerTransInfoExample merTransInfoExample = new MerTransInfoExample();
		
		String merId = fieldSynInfo.getFieldValue();
		merTransInfoExample.createCriteria().andMerIdEqualTo(merId);
		List<MerTransInfo> merTransInfos = merTransInfoMapper.selectByExample(merTransInfoExample);
		if (merTransInfos.size() == 0) {
			logger.info("未在mer_trans_info表中找到商户号:" + merId);
			
			return;
		} 
		
		//根据商户号到mer_trans_info_syn表中去找
		MerTransInfoSynMapper merTransInfoSynMapper = session.getMapper(MerTransInfoSynMapper.class);
		MerTransInfoSynExample merTransInfoSynExample = new MerTransInfoSynExample();
		merTransInfoSynExample.createCriteria().andMerIdEqualTo(merId);
		List<MerTransInfoSyn> merTransInfoSyns = merTransInfoSynMapper.selectByExample(merTransInfoSynExample);
		
		if (merTransInfoSyns.size() == 0) {
			logger.info("未在mer_trans_info_syn中找到数据，需要插入数据库");
			MerTransInfoSyn merTransInfoSyn = new MerTransInfoSyn();
			ObjectUtil.copy(merTransInfos.get(0), merTransInfoSyn);
			merTransInfoSynMapper.insert(merTransInfoSyn);
		} else {
			logger.info("在mer_trans_info_syn中找到数据，判断两条记录否相等，不等则更新");
			if (false == ObjectUtil.compareAndAssign(merTransInfos.get(0), merTransInfoSyns.get(0))) {
				logger.info("两者不相等");
				MerTransInfoSynExample example = new MerTransInfoSynExample();
				example.createCriteria().andMerIdEqualTo(merId);
				
				//需要调用set才会更新，已经在compareAndAssign中通过反射调用了set函数
				merTransInfoSynMapper.updateByExampleSelective(merTransInfoSyns.get(0), example);
			} else {
				logger.info("两者相等，无需更新");
			};	
		}
    }
    
    void doBizUsrInfo(FieldSynInfo fieldSynInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	//根据客户号到usr_info中去找
    	//TODO 根据手机号到usr_info中去找
		UsrInfoMapper usrInfoMapper = session.getMapper(UsrInfoMapper.class);
		UsrInfoExample usrInfoExample = new UsrInfoExample();
		
		String custId = fieldSynInfo.getFieldValue();
		usrInfoExample.createCriteria().andCustIdEqualTo(custId);
		List<UsrInfo> usrInfos = usrInfoMapper.selectByExample(usrInfoExample);
		if (usrInfos.size() == 0) {
			logger.info("未在usr_info表中找到客户号：" + custId);
			
			return;
		}
		
		//根据客户号到usr_info_syn表中去找
		UsrInfoSynMapper usrInfoSynMapper = session.getMapper(UsrInfoSynMapper.class);
		UsrInfoSynExample usrInfoSynExample = new UsrInfoSynExample();
		usrInfoSynExample.createCriteria().andCustIdEqualTo(custId);
		List<UsrInfoSyn> usrInfoSyns = usrInfoSynMapper.selectByExample(usrInfoSynExample);
		
		if (usrInfoSyns.size() == 0) {
			logger.info("未在usr_info_syn中找到数据，需要插入数据库");
			UsrInfoSyn usrInfoSyn = new UsrInfoSyn();
			ObjectUtil.copy(usrInfos.get(0), usrInfoSyn);
			usrInfoSynMapper.insert(usrInfoSyn);
		} else {
			logger.info("在usr_info_syn中找到数据，判断两条记录是否相等，不等则更新");
			if (false == ObjectUtil.compareAndAssign(usrInfos.get(0), usrInfoSyns.get(0))) {
				logger.info("两者不相等");
				UsrInfoSynExample example = new UsrInfoSynExample();
				example.createCriteria().andCustIdEqualTo(custId);
				//需要调用set才会更新，已经在compareAndAssign中通过反射调用了set函数
				usrInfoSynMapper.updateByExample(usrInfoSyns.get(0), example);
			} else {
				logger.info("两者相等，无需更新");
			}
		}
    }

}