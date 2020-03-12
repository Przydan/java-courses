package pl.przydan.AOP_app._1_before_advice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.przydan.AOP_app._1_before_advice.DAO.AccountDAO;
import pl.przydan.AOP_app._1_before_advice.DAO.MembershipDAO;
import pl.przydan.AOP_app._1_before_advice.config.AppConfig;
import pl.przydan.AOP_app._1_before_advice.entity.Account;

public class AOP_app {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from sprig container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        Account account = new Account();

        // call the business method
        accountDAO.addAccount(account, true);
        accountDAO.doWork();

        membershipDAO.addAccount();
        membershipDAO.goToSleep();

        // close the context
        context.close();
    }
}
