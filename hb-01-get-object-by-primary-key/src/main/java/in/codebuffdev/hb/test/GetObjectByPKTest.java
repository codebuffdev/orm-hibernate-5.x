package in.codebuffdev.hb.test;

import in.codebuffdev.hb.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class GetObjectByPKTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Account account = session.get(Account.class, 1);
        System.out.println("account = " + account);
    }
}
