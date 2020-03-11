package pl.przydan.AOP_app._4_join_points;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.przydan.AOP_app._4_join_points.DAO.AccountDAO;
import pl.przydan.AOP_app._4_join_points.DAO.MembershipDAO;
import pl.przydan.AOP_app._4_join_points.config.AppConfig;
import pl.przydan.AOP_app._4_join_points.entity.Account;

public class AOP_app_join_points {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from sprig container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        Account account = new Account("high", "test");

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
