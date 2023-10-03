package in.codebuffdev.hb.test;

import in.codebuffdev.hb.entity.Account;
import in.codebuffdev.hb.utils.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class GetObjectByPKTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryRegistry.getSessionFactory();
        Session session = sessionFactory.openSession();
        Account account = (Account) session.get(Account.class, 2);
        System.out.println("account = " + account);
    }
}
