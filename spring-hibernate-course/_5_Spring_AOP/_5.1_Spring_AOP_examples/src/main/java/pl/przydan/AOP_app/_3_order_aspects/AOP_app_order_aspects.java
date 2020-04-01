package pl.przydan.AOP_app._3_order_aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.przydan.AOP_app._3_order_aspects.DAO.AccountDAO;
import pl.przydan.AOP_app._3_order_aspects.DAO.MembershipDAO;
import pl.przydan.AOP_app._3_order_aspects.config.AppConfig;
import pl.przydan.AOP_app._3_order_aspects.entity.Account;

public class AOP_app_order_aspects {
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

        accountDAO.setName("test");
        System.out.println(accountDAO.getName());

        accountDAO.doWork();

        membershipDAO.addAccount();
        membershipDAO.goToSleep();

        // close the context
        context.close();
    }
}
