package application;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import business.BusinessProcess;

/**
 * @Description: oracle数据库表同步，两个数据源
 * @author xiaoliang.fan
 * @date: 2018年11月29日 上午11:03:47
 * @version: v1.0.0
 */
public class App 
{
	/**
	 * 源数据
	 */
	private SqlSession sessionSource;
	/**
	 * 目标数据
	 */
	private SqlSession sessionTarget;
	
	/**
	 * 源数据源
	 */
	private final String dataSource = "dataSourceA";
	/**
	 * 目标数据源
	 */
	private final String dataTarget = "dataSourceB";
	
	/**
	 * 日志
	 */
	private Logger logger;
	
	public static void main( String[] args ) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InterruptedException
    {
    	App app = new App();
    	
    	app.initApp();
    	
		app.processApp();
		
		app.afterApp();
		
    }

	/**   
	 * @Description: 数据源初始化，日志初始化      
	 * @author: xiaoliang.fan
	 * @date: 2018年11月29日 上午11:02:49
	 */
	public void initApp() throws IOException {
		logger = Logger.getLogger(App.class);
		logger.info("资源初始化开始");
		
		//利用数据库连接池 POOLED
    	String resource = "config/mybatis-configuration.xml";
    	InputStream inputStream = Resources.getResourceAsStream(resource);
    	SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream, dataSource);
    	sessionSource = sessionFactory.openSession();
		
    	//必须再读一次，否则会报stream is closed
    	inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory2 = new SqlSessionFactoryBuilder().build(inputStream, dataTarget);
		sessionTarget = sessionFactory2.openSession();
	}
	
	/**   
	 * @Description: 业务处理函数，查询两者表：同步表和字段表      
	 * @author: xiaoliang.fan
	 * @throws InterruptedException 
	 * @date: 2018年11月29日 上午11:03:12
	 */
	public void processApp() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InterruptedException {
		logger.info("同步开始");
		
		BusinessProcess businessProcess = new BusinessProcess();
		businessProcess.doBiz(sessionSource, sessionTarget);
		
		//提交事务
		sessionSource.commit();
		sessionTarget.commit();
	}
    
    void afterApp() {
    	//关闭session
    	sessionSource.close();
    	sessionTarget.close();
    	
    	logger.info("同步结束!");
    }

}
