package in.codebuffdev.hb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
    private static SessionFactory sessionFactory;

    static {
        //load the configuration to the Configuration object
        // Create a configuration object
        Configuration configuration = new Configuration();

        // Configure the database connection
        configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        configuration.setProperty("hibernate.connection.username", "root");
        configuration.setProperty("hibernate.connection.password", "root");
        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate_db?useSSL=false");

        //configure sql viewing
        configuration.setProperty("hibernate.show_sql", "true");
        configuration.setProperty("hibernate.format_sql", "true");

        //configure the SessionFactory
        configuration.setProperty("hibernate.hbm2ddl.auto", "validate");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

        // mapping classes
        configuration.addResource("map/entity/account/Account.hbm.xml");

        //build SessionFactory
        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void closeSessionFactory() {
        sessionFactory.close();
    }
}
