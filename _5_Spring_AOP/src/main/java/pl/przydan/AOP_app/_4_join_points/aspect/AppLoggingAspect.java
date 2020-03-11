package pl.przydan.AOP_app._4_join_points.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pl.przydan.AOP_app._4_join_points.entity.Account;

@Aspect
@Order(0)
@Component
public class AppLoggingAspect {
    // this id where we add all of our related advices for logging

    @Before("pl.przydan.AOP_app._4_join_points.aspect.AopExpressions.forDaoPackageNoGettersSetters()")
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
