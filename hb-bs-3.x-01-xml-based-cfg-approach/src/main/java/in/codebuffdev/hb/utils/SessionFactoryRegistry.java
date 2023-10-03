package in.codebuffdev.hb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
    private static SessionFactory sessionFactory;

    static {
        // default load the hibernate.cfg1.xml file from the classpath
        //Configuration configuration= new Configuration().configure();

        // default load the hibernate.cfg1.xml file from the classpath (custom cfg file, so we can create multiple Configuration classes)
        Configuration configuration= new Configuration().configure("hibernate.cfg1.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void closeSessionFactory() {
        sessionFactory.close();
    }
}
