package pl.przydan.AOP_app._5_after_returning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.przydan.AOP_app._5_after_returning.DAO.AccountDAO;
import pl.przydan.AOP_app._5_after_returning.DAO.MembershipDAO;
import pl.przydan.AOP_app._5_after_returning.config.AppConfig;
import pl.przydan.AOP_app._5_after_returning.entity.Account;

import java.util.List;

public class AOP_app_after_returning {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from sprig container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        // call method to find the accounts
        List<Account> allAccounts = accountDAO.findAllAccounts();

        // display the accounts
        System.out.println("->> Accounts: ");
        allAccounts.forEach(System.out :: println);

        // close the context
        context.close();
    }
}
