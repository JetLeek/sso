package top.leeklong.config;/**
 * Created by pc on 2017/6/16.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 数据库的相关配置
 *
 * @author lee
 * @create 2017-06-16 9:16
 **/
@Configuration
@EnableTransactionManagement
public class DataBaseConnection {
    @Value("${db.url}")
    private String DB_URL;

    @Value("${db.username}")
    private String DB_USERNAME;

    @Value("${db.password}")
    private String DB_PASSWORD;

    @Value("${db.driver}")
    private String DB_DRIVER;

    @Value("${hibernate.hbm2ddl.auto}")
    private String HIBERNATE_HBM2DDL_AUTO;

    @Value("${hibernate.show_sql}")
    private String HIBERNATE_SHOW_SQL;

    @Value("${hibernate.dialect}")
    private String  HIBERNATE_DIALECT;

    @Value("${entitymanager.packagesToScan}")
    private String ENTITYMANAGER_PACKAGESTOSCAN;

    /**
     * 配置数据源
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DB_DRIVER);
        dataSource.setUrl(DB_URL);
        dataSource.setUsername(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        return dataSource;
    }

    /**
     * 配置回话工厂
     * @return
     */
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGESTOSCAN);//设置包扫描
        Properties properties = new Properties();//设置hibernate的属性
        properties.put("hibernate.hbm2ddl.auto",HIBERNATE_HBM2DDL_AUTO);
        properties.put("hibernate.dialect",HIBERNATE_DIALECT);
        properties.put("hibernate.show_sql",HIBERNATE_SHOW_SQL);
        sessionFactoryBean.setHibernateProperties(properties);
        return sessionFactoryBean;
    }

    @Bean
    public HibernateTransactionManager hibernateTransactionManager(){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

    public String getDB_URL() {
        return DB_URL;
    }

    public void setDB_URL(String DB_URL) {
        this.DB_URL = DB_URL;
    }

    public String getDB_USERNAME() {
        return DB_USERNAME;
    }

    public void setDB_USERNAME(String DB_USERNAME) {
        this.DB_USERNAME = DB_USERNAME;
    }

    public String getDB_PASSWORD() {
        return DB_PASSWORD;
    }

    public void setDB_PASSWORD(String DB_PASSWORD) {
        this.DB_PASSWORD = DB_PASSWORD;
    }

    public String getDB_DRIVER() {
        return DB_DRIVER;
    }

    public void setDB_DRIVER(String DB_DRIVER) {
        this.DB_DRIVER = DB_DRIVER;
    }

    public String getHIBERNATE_HBM2DDL_AUTO() {
        return HIBERNATE_HBM2DDL_AUTO;
    }

    public void setHIBERNATE_HBM2DDL_AUTO(String HIBERNATE_HBM2DDL_AUTO) {
        this.HIBERNATE_HBM2DDL_AUTO = HIBERNATE_HBM2DDL_AUTO;
    }

    public String getHIBERNATE_SHOW_SQL() {
        return HIBERNATE_SHOW_SQL;
    }

    public void setHIBERNATE_SHOW_SQL(String HIBERNATE_SHOW_SQL) {
        this.HIBERNATE_SHOW_SQL = HIBERNATE_SHOW_SQL;
    }

    public String getHIBERNATE_DIALECT() {
        return HIBERNATE_DIALECT;
    }

    public void setHIBERNATE_DIALECT(String HIBERNATE_DIALECT) {
        this.HIBERNATE_DIALECT = HIBERNATE_DIALECT;
    }

    public String getENTITYMANAGER_PACKAGESTOSCAN() {
        return ENTITYMANAGER_PACKAGESTOSCAN;
    }

    public void setENTITYMANAGER_PACKAGESTOSCAN(String ENTITYMANAGER_PACKAGESTOSCAN) {
        this.ENTITYMANAGER_PACKAGESTOSCAN = ENTITYMANAGER_PACKAGESTOSCAN;
    }
}
