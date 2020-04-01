package pl.przydan.AOP_app._7_after_finally.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pl.przydan.AOP_app._7_after_finally.entity.Account;

import java.util.List;

@Aspect
@Order(0)
@Component
public class AppLoggingAspect {
    // this id where we add all of our related advices for logging

    @After("execution(* pl.przydan.AOP_app._7_after_finally.DAO.AccountDAO.*(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint joinPoint) {
        System.out.println("\n===>>> Executing @After (finally) on metod"
                + joinPoint.getSignature().toShortString());
    }

    @AfterThrowing(
            pointcut = "execution(* pl.przydan.AOP_app._7_after_finally.DAO.AccountDAO.*(..))",
            throwing = "exception"
    )
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable exception) {
        // print with method we are advising on
        System.out.println("\n===>>> Executing @AfterThrowing on method: "
                + joinPoint.getSignature().toShortString());
        // log the exception
        System.out.println("\n>>> result is: " + exception);

    }

    @AfterReturning(
            pointcut = "execution(*  pl.przydan.AOP_app._7_after_finally.DAO.AccountDAO.findAllAccounts(..))",
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

    @Before("pl.przydan.AOP_app._7_after_finally.aspect.AopExpressions.forDaoPackageNoGettersSetters()")
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
