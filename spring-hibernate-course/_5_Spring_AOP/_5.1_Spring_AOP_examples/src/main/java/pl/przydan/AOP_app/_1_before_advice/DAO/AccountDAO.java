package pl.przydan.AOP_app._1_before_advice.DAO;

import org.springframework.stereotype.Component;
import pl.przydan.AOP_app._1_before_advice.entity.Account;

@Component
public class AccountDAO {

    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }
}
