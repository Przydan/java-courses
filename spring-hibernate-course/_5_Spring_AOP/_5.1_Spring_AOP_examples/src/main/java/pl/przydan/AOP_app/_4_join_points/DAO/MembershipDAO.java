package pl.przydan.AOP_app._4_join_points.DAO;

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
