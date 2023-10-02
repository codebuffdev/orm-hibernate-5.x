package in.codebuffdev.hb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
    private static SessionFactory sessionFactory;

    static {
        Configuration configuration= new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void closeSessionFactory() {
        sessionFactory.close();
    }
}
