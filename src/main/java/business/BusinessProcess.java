/**
 * 汇付天下
 */
package business;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import Util.ObjectUtil;
import mybatis.mapper.FieldSynInfoMapper;
import mybatis.mapper.MerBaseInfoMapper;
import mybatis.mapper.MerBaseInfoSynMapper;
import mybatis.mapper.MerFeeModeMapper;
import mybatis.mapper.MerFeeModeSynMapper;
import mybatis.mapper.MerTransInfoMapper;
import mybatis.mapper.MerTransInfoSynMapper;
import mybatis.mapper.RecvAcctInfoMapper;
import mybatis.mapper.RecvAcctInfoSynMapper;
import mybatis.mapper.TableSynInfoMapper;
import mybatis.mapper.UsrInfoMapper;
import mybatis.mapper.UsrInfoSynMapper;
import mybatis.model.FieldSynInfo;
import mybatis.model.FieldSynInfoExample;
import mybatis.model.MerBaseInfo;
import mybatis.model.MerBaseInfoExample;
import mybatis.model.MerBaseInfoSyn;
import mybatis.model.MerBaseInfoSynExample;
import mybatis.model.MerFeeMode;
import mybatis.model.MerFeeModeExample;
import mybatis.model.MerFeeModeSyn;
import mybatis.model.MerFeeModeSynExample;
import mybatis.model.MerTransInfo;
import mybatis.model.MerTransInfoExample;
import mybatis.model.MerTransInfoSyn;
import mybatis.model.MerTransInfoSynExample;
import mybatis.model.RecvAcctInfo;
import mybatis.model.RecvAcctInfoExample;
import mybatis.model.RecvAcctInfoSyn;
import mybatis.model.RecvAcctInfoSynExample;
import mybatis.model.TableSynInfo;
import mybatis.model.TableSynInfoExample;
import mybatis.model.UsrInfo;
import mybatis.model.UsrInfoExample;
import mybatis.model.UsrInfoSyn;
import mybatis.model.UsrInfoSynExample;

/**
 * @Description: 业务处理类
 * @author xiaoliang.fan
 * @date: 2018年11月30日 上午10:29:16
 * @version: v1.0.0
 */
public class BusinessProcess {
	
	private Logger logger = Logger.getLogger(BusinessProcess.class);
	
	public void doBiz(SqlSession sessionSource, SqlSession sessionTarget) throws InterruptedException {
		//查询同步表,查找有效状态为“1”的数据
		TableSynInfoMapper tableSynInfoMapper = sessionTarget.getMapper(TableSynInfoMapper.class);
		TableSynInfoExample tableSynInfoExample = new TableSynInfoExample();
		tableSynInfoExample.createCriteria().andTableStatEqualTo("1");
		List<TableSynInfo> tableSynInfos = tableSynInfoMapper.selectByExample(tableSynInfoExample);
		
		if (tableSynInfos.size() == 0) {
			logger.info("同步表中没有配置需要同步的表名，请配置表名");
			return;
		}
		
		List<Thread> threads = new ArrayList<Thread>();
		
		for (TableSynInfo tableSynInfo : tableSynInfos) {
			logger.info("为同步表"+tableSynInfo.getTableName() + "创建一个线程");
			
			Thread workThread = new Thread(new WorkHandler(tableSynInfo, sessionSource, sessionTarget));
			workThread.setName("SyncThread-" + tableSynInfo.getTableName());
			workThread.start();
			
			threads.add(workThread);
		}
		
		//让所有的线程都处理结束
		for (Thread thread : threads) {
			thread.join();
		}
	}
	
	/**
     * @Description: 线程类
     * @author xiaoliang.fan
     * @date: 2018年11月30日 上午10:16:23
     * @version: v1.0.0
     */
    public final class WorkHandler implements Runnable {

    	private TableSynInfo tableSynInfo;
    	private SqlSession sessionSource;
    	private SqlSession sessionTarget;
    	
    	private Logger logger = Logger.getLogger(WorkHandler.class);
    	
    	public void run() {
    		
            try {
            	//开始同步    
    			launchSyncData();
    		} catch (IllegalAccessException e) {
    			e.printStackTrace();
    		} catch (IllegalArgumentException e) {
    			e.printStackTrace();
    		} catch (InvocationTargetException e) {
    			e.printStackTrace();
    		} catch (NoSuchMethodException e) {
    			e.printStackTrace();
    		} catch (SecurityException e) {
    			e.printStackTrace();
    		}
    	}
    	
    	public WorkHandler(TableSynInfo tableSynInfo, SqlSession sessionSource, SqlSession sessionTarget) {
    		this.tableSynInfo = tableSynInfo;
    		this.sessionSource = sessionSource;
    		this.sessionTarget = sessionTarget;
    	}

    	void launchSyncData() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    		logger.info("开始同步表：" + Thread.currentThread().getName());
    		
    		//查询字段表，根据表名，查询所有有效状态为“1”的记录
    		FieldSynInfoMapper fieldSynInfoMapper = sessionTarget.getMapper(FieldSynInfoMapper.class);
    		FieldSynInfoExample fieldSynInfoExample = new FieldSynInfoExample();
    		fieldSynInfoExample.createCriteria().andTableStatEqualTo("1").andTableNameEqualTo(tableSynInfo.getTableName());
    		
    		List<FieldSynInfo> fieldSynInfos = fieldSynInfoMapper.selectByExample(fieldSynInfoExample);
    		
    		if (fieldSynInfos.size() == 0) {
    			logger.info("表名：" + tableSynInfo.getTableName() + "所对应的同步字段表中没有配置数据，请配置数据");
    		}
    		
    		for (FieldSynInfo fieldSynInfo : fieldSynInfos) {
    			logger.info("开始同步表：" + fieldSynInfo.getTableName() + "表字段：" + fieldSynInfo.getFieldName() +
    						"字段值：" + fieldSynInfo.getFieldValue());
    			if (fieldSynInfo.getTableName().equals("mer_base_info")) {
    				doBizMerBaseInfo(fieldSynInfo, sessionSource, sessionTarget);
    			} else if (fieldSynInfo.getTableName().equals("mer_trans_info")) {
    				doBizMerTransInfo(fieldSynInfo, sessionSource, sessionTarget);
    			} else if (fieldSynInfo.getTableName().equals("usr_info")) {
    				doBizUsrInfo(fieldSynInfo, sessionSource, sessionTarget);
    			} else if (fieldSynInfo.getTableName().equals("mer_fee_mode")) {
					doBizMerFeeMode(fieldSynInfo, sessionSource, sessionTarget);
				} else if (fieldSynInfo.getTableName().equals("recv_acct_info")) {
					doBizRecvAcctInfo(fieldSynInfo, sessionSource, sessionTarget);
				}
    			
    		}
    	}
    }
    
	/**   
     * @Description: MerBaseInfo表同步     
     * @author: xiaoliang.fan
     * @date: 2018年11月29日 上午11:04:00
     */
    public void doBizMerBaseInfo(FieldSynInfo fieldSynInfo, SqlSession sessionSource, SqlSession sessionTarget) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	//根据商户号到mer_base_info表（数据源头）中去找
    	MerBaseInfoMapper merBaseInfoMapper = sessionSource.getMapper(MerBaseInfoMapper.class);
		MerBaseInfoExample merBaseInfoExample = new MerBaseInfoExample();
		
		String merId = fieldSynInfo.getFieldValue();
		merBaseInfoExample.createCriteria().andMerIdEqualTo(merId);
		List<MerBaseInfo> merBaseInfos = merBaseInfoMapper.selectByExample(merBaseInfoExample);
		if (merBaseInfos.size() == 0) {
			logger.info("未在mer_base_info表中找到商户号:" + merId);
			
			return;
		}
		
		//根据商户号到mer_base_info_syn(数据目标)表中去找
		MerBaseInfoSynMapper merBaseInfoSynMapper = sessionTarget.getMapper(MerBaseInfoSynMapper.class);
		MerBaseInfoSynExample merBaseInfoSynExample = new MerBaseInfoSynExample();
		merBaseInfoSynExample.createCriteria().andMerIdEqualTo(merId);
		List<MerBaseInfoSyn> merBaseInfoSyns = merBaseInfoSynMapper.selectByExample(merBaseInfoSynExample);
		
		if (merBaseInfoSyns.size() == 0) {
			logger.info("未在mer_base_info_syn中找到商户号:" + merId + ",需要插入数据库");
			MerBaseInfoSyn merBaseInfoSyn = new MerBaseInfoSyn();
			ObjectUtil.copy(merBaseInfos.get(0), merBaseInfoSyn);
			merBaseInfoSynMapper.insert(merBaseInfoSyn);
		} else {
			if (false == ObjectUtil.compareAndAssign(merBaseInfos.get(0), merBaseInfoSyns.get(0))) {
				logger.info("在mer_base_info_syn中找到商户号：" + merId + ",两者不相等,更新数据库");
				MerBaseInfoSynExample example = new MerBaseInfoSynExample();
				example.createCriteria().andMerIdEqualTo(merId);
				
				//需要调用set才会更新，已经在compareAndAssign中通过反射调用了set函数
				merBaseInfoSynMapper.updateByExampleSelective(merBaseInfoSyns.get(0), example);
			} else {
				logger.info("在mer_base_info_syn中找到商户号：" + merId + "，两者相等，无需更新");
			};
		}
    }
    
    /**   
     * @Description:  MerTransInfo表同步     
     * @author: xiaoliang.fan
     * @date: 2018年11月29日 上午11:04:34
     */
    public void doBizMerTransInfo(FieldSynInfo fieldSynInfo, SqlSession sessionSource, SqlSession sessionTarget) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//根据商户号到mer_trans_info表（数据源）中去找
		MerTransInfoMapper merTransInfoMapper = sessionSource.getMapper(MerTransInfoMapper.class);
		MerTransInfoExample merTransInfoExample = new MerTransInfoExample();
		
		String merId = fieldSynInfo.getFieldValue();
		merTransInfoExample.createCriteria().andMerIdEqualTo(merId);
		List<MerTransInfo> merTransInfos = merTransInfoMapper.selectByExample(merTransInfoExample);
		if (merTransInfos.size() == 0) {
			logger.info("未在mer_trans_info表中找到商户号:" + merId);
			
			return;
		} 
		
		//根据商户号到mer_trans_info_syn(数据目标)表中去找
		MerTransInfoSynMapper merTransInfoSynMapper = sessionTarget.getMapper(MerTransInfoSynMapper.class);
		MerTransInfoSynExample merTransInfoSynExample = new MerTransInfoSynExample();
		merTransInfoSynExample.createCriteria().andMerIdEqualTo(merId);
		List<MerTransInfoSyn> merTransInfoSyns = merTransInfoSynMapper.selectByExample(merTransInfoSynExample);
		
		if (merTransInfoSyns.size() == 0) {
			logger.info("未在mer_trans_info_syn中找到商户号：" + merId + "，需要插入数据库");
			MerTransInfoSyn merTransInfoSyn = new MerTransInfoSyn();
			ObjectUtil.copy(merTransInfos.get(0), merTransInfoSyn);
			merTransInfoSynMapper.insert(merTransInfoSyn);
		} else {
			if (false == ObjectUtil.compareAndAssign(merTransInfos.get(0), merTransInfoSyns.get(0))) {
				logger.info("在mer_trans_info_syn中找到商户号：" + merId + ",两者不相等,更新数据库");
				MerTransInfoSynExample example = new MerTransInfoSynExample();
				example.createCriteria().andMerIdEqualTo(merId);
				
				//需要调用set才会更新，已经在compareAndAssign中通过反射调用了set函数
				merTransInfoSynMapper.updateByExampleSelective(merTransInfoSyns.get(0), example);
			} else {
				logger.info("在mer_trans_info_syn中找到商户号：" + merId + "，两者相等，无需更新");
			};	
		}
    }
    
    /**   
     * @Description: UsrInfo表同步      
     * @author: xiaoliang.fan
     * @date: 2018年11月29日 上午11:05:22
     */
    public void doBizUsrInfo(FieldSynInfo fieldSynInfo, SqlSession sessionSource, SqlSession sessionTarget) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	//根据客户号到usr_info(数据源)中去找
    	//TODO 根据手机号到usr_info中去找
		UsrInfoMapper usrInfoMapper = sessionSource.getMapper(UsrInfoMapper.class);
		UsrInfoExample usrInfoExample = new UsrInfoExample();
		
		String custId = fieldSynInfo.getFieldValue();
		usrInfoExample.createCriteria().andCustIdEqualTo(custId);
		List<UsrInfo> usrInfos = usrInfoMapper.selectByExample(usrInfoExample);
		if (usrInfos.size() == 0) {
			logger.info("未在usr_info表中找到客户号：" + custId);
			
			return;
		}
		
		//根据客户号到usr_info_syn表(数据目标)中去找
		UsrInfoSynMapper usrInfoSynMapper = sessionTarget.getMapper(UsrInfoSynMapper.class);
		UsrInfoSynExample usrInfoSynExample = new UsrInfoSynExample();
		usrInfoSynExample.createCriteria().andCustIdEqualTo(custId);
		List<UsrInfoSyn> usrInfoSyns = usrInfoSynMapper.selectByExample(usrInfoSynExample);
		
		if (usrInfoSyns.size() == 0) {
			logger.info("未在usr_info_syn中找到客户号：" + custId + "，需要插入数据库");
			UsrInfoSyn usrInfoSyn = new UsrInfoSyn();
			ObjectUtil.copy(usrInfos.get(0), usrInfoSyn);
			usrInfoSynMapper.insert(usrInfoSyn);
		} else {
			if (false == ObjectUtil.compareAndAssign(usrInfos.get(0), usrInfoSyns.get(0))) {
				logger.info("在usr_info_syn中找到客户号：" + custId + ",两者不相等,更新数据库");
				UsrInfoSynExample example = new UsrInfoSynExample();
				example.createCriteria().andCustIdEqualTo(custId);
				//需要调用set才会更新，已经在compareAndAssign中通过反射调用了set函数
				usrInfoSynMapper.updateByExample(usrInfoSyns.get(0), example);
			} else {
				logger.info("在usr_info_syn中找到客户号：" + custId + "两者相等，无需更新");
			}
		}
    }
    
    public void doBizMerFeeMode(FieldSynInfo fieldSynInfo, SqlSession sessionSource, SqlSession sessionTarget) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	//根据mer_id和trans_type到mer_fee_mode(源数据库)去找
		
		MerFeeModeMapper merFeeModeMapper = sessionSource.getMapper(MerFeeModeMapper.class);
		MerFeeModeExample merFeeModeExample = new MerFeeModeExample();
		
		String[] reString = fieldSynInfo.getFieldValue().split("\\|");
		String mer_id = reString[0];
		String trans_type = reString[1];
		merFeeModeExample.createCriteria().andMerIdEqualTo(mer_id).andTransTypeEqualTo(trans_type);
		List<MerFeeMode> merFeeModes = merFeeModeMapper.selectByExample(merFeeModeExample);
		if (merFeeModes.size() == 0) {
			logger.info("未在mer_fee_mode表中找到mer_id:" + mer_id + "交易类型：" + trans_type);
			
			return;
		}
		
		//根据mer_id和trans_type到mer_fee_mode_syn(目标数据库)去找
		MerFeeModeSynMapper merFeeModeSynMapper = sessionTarget.getMapper(MerFeeModeSynMapper.class);
		MerFeeModeSynExample merFeeModeSynExample = new MerFeeModeSynExample();
		merFeeModeSynExample.createCriteria().andMerIdEqualTo(mer_id).andTransTypeEqualTo(trans_type);
		List<MerFeeModeSyn> merFeeModeSyns = merFeeModeSynMapper.selectByExample(merFeeModeSynExample);
		
		if (merFeeModeSyns.size() == 0) {
			logger.info("未在mer_fee_mode_syn中找到mer_id:" + mer_id + "交易类型：" + trans_type + "，需要输入数据库");
			MerFeeModeSyn merFeeModeSyn = new MerFeeModeSyn();
			ObjectUtil.copy(merFeeModes.get(0), merFeeModeSyn);
			merFeeModeSynMapper.insert(merFeeModeSyn);
		} else {
			if (false == ObjectUtil.compareAndAssign(merFeeModes.get(0), merFeeModeSyns.get(0))) {
				logger.info("在mer_fee_mode_syn中找到mer_id:" + mer_id + "交易类型：" + trans_type + "两者不相等,更新数据库");
				MerFeeModeSynExample example = new MerFeeModeSynExample();
				example.createCriteria().andMerIdEqualTo(mer_id).andTransTypeEqualTo(trans_type);
				//需要调用set才会更新，已经在compareAndAssign中通过反射调用了set函数
				merFeeModeSynMapper.updateByExample(merFeeModeSyns.get(0), example);
			} else {
				logger.info("在mer_fee_mode_syn中找到mer_id:" + mer_id + "交易类型：" + trans_type + "，两者相等，无需更新");
			}
		}
    }
    
    public void doBizRecvAcctInfo(FieldSynInfo fieldSynInfo, SqlSession sessionSource, SqlSession sessionTarget) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	//根据mer_id和mer_usr_id到recv_acct_info(源数据库)去找
		RecvAcctInfoMapper recvAcctInfoMapper = sessionSource.getMapper(RecvAcctInfoMapper.class);
		RecvAcctInfoExample recvAcctInfoExample = new RecvAcctInfoExample();
		
		String[] reString = fieldSynInfo.getFieldValue().split("\\|");
		String mer_id = reString[0];
		String mer_usr_id = reString[1];
		recvAcctInfoExample.createCriteria().andMerUsrIdEqualTo(mer_usr_id).andMerIdEqualTo(mer_id);
		List<RecvAcctInfo> recvAcctInfos = recvAcctInfoMapper.selectByExample(recvAcctInfoExample);
		if (recvAcctInfos.size() == 0) {
			logger.info("未在recv_acct_info表中找到mer_id:" + mer_id + "商户用户号：" + mer_usr_id);
			
			return;
		}
		
		//根据mer_id和mer_usr_id到recv_acct_info_syn(目标数据库)去找
		RecvAcctInfoSynMapper recvAcctInfoSynMapper = sessionTarget.getMapper(RecvAcctInfoSynMapper.class);
		RecvAcctInfoSynExample recvAcctInfoSynExample = new RecvAcctInfoSynExample();
		recvAcctInfoSynExample.createCriteria().andMerIdEqualTo(mer_id).andMerUsrIdEqualTo(mer_usr_id);
		List<RecvAcctInfoSyn> recvAcctInfoSyns = recvAcctInfoSynMapper.selectByExample(recvAcctInfoSynExample);
		
		if (recvAcctInfoSyns.size() == 0) {
			logger.info("未在recv_acct_info_syn中找到找到mer_id:" + mer_id + "商户用户号：" + mer_usr_id + "，需要插入数据库");
			RecvAcctInfoSyn recvAcctInfoSyn = new RecvAcctInfoSyn();
			ObjectUtil.copy(recvAcctInfos.get(0), recvAcctInfoSyn);
			recvAcctInfoSynMapper.insert(recvAcctInfoSyn);
		} else {
			if (false == ObjectUtil.compareAndAssign(recvAcctInfos.get(0), recvAcctInfoSyns.get(0))) {
				logger.info("在recv_acct_info_syn中找到找到mer_id:" + mer_id + "商户用户号：" + mer_usr_id + ",两者不相等,更新数据库");
				RecvAcctInfoSynExample example = new RecvAcctInfoSynExample();
				example.createCriteria().andMerIdEqualTo(mer_id).andMerUsrIdEqualTo(mer_usr_id);
				//需要调用set才会更新，已经在compareAndAssign中通过反射调用了set函数
				recvAcctInfoSynMapper.updateByExample(recvAcctInfoSyns.get(0), example);
			} else {
				logger.info("在recv_acct_info_syn中找到找到mer_id:" + mer_id + "商户用户号：" + mer_usr_id + ",两者相等，无需更新");
			}
		}
    }
}
