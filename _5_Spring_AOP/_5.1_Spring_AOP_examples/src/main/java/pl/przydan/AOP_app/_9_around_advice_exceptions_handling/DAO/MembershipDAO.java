package pl.przydan.AOP_app._9_around_advice_exceptions_handling.DAO;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
    }

    public void goToSleep() {
        System.out.println(getClass() + ": goToSleep()");
    }

}
