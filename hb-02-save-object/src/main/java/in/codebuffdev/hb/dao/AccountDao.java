package in.codebuffdev.hb.dao;

import in.codebuffdev.hb.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;

public class AccountDao {
    public Serializable addAccount(Account account, SessionFactory sessionFactory){
        boolean success = false;
        Session session = null;
        Transaction transaction = null;
        Serializable savedId = null;
        try{
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            savedId = session.save(account);
            success = true;
        }finally {
            if (transaction != null) {
                if(success){
                    transaction.commit();
                }else{
                    transaction.rollback();
                }
            }
            if (session != null) {
                session.close();
            }
        }
        return savedId;
    }
}
