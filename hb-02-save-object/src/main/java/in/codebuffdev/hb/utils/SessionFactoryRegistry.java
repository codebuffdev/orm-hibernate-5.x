package in.codebuffdev.hb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
    private static SessionFactory sessionFactory = null;
    static{
        Configuration configuration = new Configuration();
        Configuration configure = configuration.configure();
        sessionFactory = configure.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void closeSessionFactory(){
        sessionFactory.close();
    }
}
