package pl.przydan.AOP_app._5_after_returning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pl.przydan.AOP_app._5_after_returning.entity.Account;

import java.util.List;

@Aspect
@Order(0)
@Component
public class AppLoggingAspect {
    // this id where we add all of our related advices for logging

    @AfterReturning(
            pointcut = "execution(*  pl.przydan.AOP_app._5_after_returning.DAO.AccountDAO.findAllAccounts(..))",
            returning = "result"
    )
    public void afterRetuningFindAllAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
        // print with method we are advising on
        System.out.println("\n===>>> Executing @AfterReturning on method: "
                + joinPoint.getSignature().toShortString());
        // print out the result of the method call
        System.out.println("\n>>> result is: " + result);

        // let's post-process the data ... let's modify
        convertAccountNamesToUpperCase(result);
    }

    private List<Account> convertAccountNamesToUpperCase(List<Account> result) {
        result.forEach(account -> {
            String s = account.getName().trim().toUpperCase();
            account.setName(s);
        });
        return result;
    }

    @Before("pl.przydan.AOP_app._5_after_returning.aspect.AopExpressions.forDaoPackageNoGettersSetters()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("\n===>>>> Executing @Before advice");

        // display the method signature
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method; " + signature);

        // display the method arguments
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            System.out.println("Arg: " + arg);

            // downcast and print Account specified stuff
            if (arg instanceof Account) {
                Account account = (Account) arg;

                System.out.println("account name: " + account.getName());
                System.out.println("account level: " + account.getLevel());
            }
        }
    }
}
