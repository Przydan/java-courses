package pl.przydan.AOP_app._8_around_advice.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pl.przydan.AOP_app._8_around_advice.entity.Account;

import java.util.List;
import java.util.logging.Logger;

@Aspect
@Order(0)
@Component
public class AppLoggingAspect {

    private Logger logger = Logger.getLogger(AppLoggingAspect.class.getName());

    @Around("execution(* pl.przydan.AOP_app._8_around_advice.service.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint proJoinPoint) throws Throwable {
        // print out method we are advising on
        logger.info("===>>> Executing @Around on metod"
                + proJoinPoint.getSignature().toShortString());
        //get begin timestamp
        long begin = System.currentTimeMillis();
        // let's execute method
        Object result = proJoinPoint.proceed();
        //get end timestamp
        long end = System.currentTimeMillis();
        // compare duration and display
        long duration = end - begin;
        logger.info("===>>> Duration: " + duration / 1000.0 + " seconds");

        return result;
    }

    @After("execution(* pl.przydan.AOP_app._8_around_advice.DAO.AccountDAO.*(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint joinPoint) {
        logger.info("===>>> Executing @After (finally) on metod"
                + joinPoint.getSignature().toShortString());
    }

    @AfterThrowing(
            pointcut = "execution(* pl.przydan.AOP_app._8_around_advice.DAO.AccountDAO.*(..))",
            throwing = "exception"
    )
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable exception) {
        // print with method we are advising on
        logger.info("===>>> Executing @AfterThrowing on method: "
                + joinPoint.getSignature().toShortString());
        // log the exception
        logger.info(">>> result is: " + exception);

    }

    @AfterReturning(
            pointcut = "execution(*  pl.przydan.AOP_app._8_around_advice.DAO.AccountDAO.findAllAccounts(..))",
            returning = "result"
    )
    public void afterRetuningFindAllAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
        // print with method we are advising on
        logger.info("===>>> Executing @AfterReturning on method: "
                + joinPoint.getSignature().toShortString());
        // print out the result of the method call
        logger.info(">>> result is: " + result);

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

    @Before("pl.przydan.AOP_app._8_around_advice.aspect.AopExpressions.forDaoPackageNoGettersSetters()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        logger.info("===>>>> Executing @Before advice");

        // display the method signature
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("Method; " + signature);

        // display the method arguments
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            logger.info("Arg: " + arg);

            // downcast and print Account specified stuff
            if (arg instanceof Account) {
                Account account = (Account) arg;

                logger.info("account name: " + account.getName());
                logger.info("account level: " + account.getLevel());
            }
        }
    }
}
