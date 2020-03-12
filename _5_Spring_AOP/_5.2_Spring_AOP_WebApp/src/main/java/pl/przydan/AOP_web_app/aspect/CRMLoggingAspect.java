package pl.przydan.AOP_web_app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pl.przydan.AOP_web_app.entity.Customer;

import java.util.List;
import java.util.logging.Logger;

@Aspect
@Order(-1)
@Component
public class CRMLoggingAspect {

    // setup logger
    Logger logger = Logger.getLogger(CRMLoggingAspect.class.getName());

    // setup pointcut declaration
    @Pointcut("execution(* pl.przydan.AOP_web_app.controller.*.*(..))")
    private void forControllerPackage() {
    }

    @Pointcut("execution(* pl.przydan.AOP_web_app.service.*.*(..))")
    private void forServicePackage() {
    }

    @Pointcut("execution(* pl.przydan.AOP_web_app.DAO.*.*(..))")
    private void forDAOPackage() {
    }

    @Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
    private void forAppFlow() {
    }

    // add @Before advice
    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        // display method we are calling
        logger.info("##==--> in @Before: calling method: " + joinPoint.getSignature().toShortString() + " ##");

        // get and display the arguments to the method
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            logger.info("==--> method args: " + arg);
        }
    }

    // add @AfterReturning
    @AfterReturning(
            pointcut = "forAppFlow()",
            returning = "result")
    public void afterRetuning(JoinPoint joinPoint, Object result) {
        logger.info("##==--> in @AfterReturning: calling method: " + joinPoint.getSignature().toShortString() + " ##");
        logger.info("==--> result: " + result);
    }


}
