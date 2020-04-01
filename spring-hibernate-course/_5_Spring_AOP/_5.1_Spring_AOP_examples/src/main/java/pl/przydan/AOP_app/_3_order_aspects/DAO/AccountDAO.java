package pl.przydan.AOP_app._3_order_aspects.DAO;

import lombok.Data;
import org.springframework.stereotype.Component;
import pl.przydan.AOP_app._3_order_aspects.entity.Account;

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
