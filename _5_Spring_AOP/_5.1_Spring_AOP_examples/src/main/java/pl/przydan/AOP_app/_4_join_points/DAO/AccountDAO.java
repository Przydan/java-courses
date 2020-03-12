package pl.przydan.AOP_app._4_join_points.DAO;

import lombok.Data;
import org.springframework.stereotype.Component;
import pl.przydan.AOP_app._4_join_points.entity.Account;

@Component
@Data
public class AccountDAO {

    private String name;
    private String serviceCode;

    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }
}
