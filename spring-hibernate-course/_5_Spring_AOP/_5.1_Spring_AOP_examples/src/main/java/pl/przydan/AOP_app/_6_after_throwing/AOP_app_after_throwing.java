package pl.przydan.AOP_app._6_after_throwing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.przydan.AOP_app._6_after_throwing.DAO.AccountDAO;
import pl.przydan.AOP_app._6_after_throwing.config.AppConfig;
import pl.przydan.AOP_app._6_after_throwing.entity.Account;

import java.util.List;

public class AOP_app_after_throwing {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from sprig container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        // call method to find the accounts
        List<Account> allAccounts = null;
        try {
            boolean tripWire = true;
            allAccounts = accountDAO.findAllAccounts(tripWire);
        } catch (Exception ex) {
            System.out.println("\n\nMain program ... caught exception: " + ex);
        }

        // display the accounts
        System.out.println("->> Accounts: null ");
//        allAccounts.forEach(System.out :: println);

        // close the context
        context.close();
    }
}
