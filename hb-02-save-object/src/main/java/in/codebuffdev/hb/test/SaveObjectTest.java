package in.codebuffdev.hb.test;

import in.codebuffdev.hb.dao.AccountDao;
import in.codebuffdev.hb.entity.Account;
import in.codebuffdev.hb.utils.SessionFactoryRegistry;
import org.hibernate.SessionFactory;

import java.io.Serializable;

public class SaveObjectTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryRegistry.getSessionFactory();

        Account account = new Account();
        account.setAccountNo(2);
        account.setAccountHolderName("raj");
        account.setAccountType("saving");
        account.setMobileNo("9988112233");
        account.setEmailAddress("raj@gmail.com");
        account.setBalance(10000);

        AccountDao accountDao = new AccountDao();
        Serializable serializable = accountDao.addAccount(account, sessionFactory);
        System.out.println("Account saved with id = " + serializable);

    }
}
