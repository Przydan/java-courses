package pl.przydan.AOP_app._7_after_finally.DAO;

import lombok.Data;
import org.springframework.stereotype.Component;
import pl.przydan.AOP_app._7_after_finally.entity.Account;

import java.util.Arrays;
import java.util.List;

@Component
@Data
public class AccountDAO {

    private String name;
    private String serviceCode;

    public List<Account> findAllAccounts(boolean tripWire) {
        //simulate exception
        if (tripWire) {
            throw new RuntimeException(">> error!");
        }

        return Arrays.asList(
                new Account("BRONZE", "Luka"),
                new Account("SILVER", "Martin"),
                new Account("PLATINUM", "Lucy"),
                new Account("GOLD", "Marko"));
    }

    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }
}
