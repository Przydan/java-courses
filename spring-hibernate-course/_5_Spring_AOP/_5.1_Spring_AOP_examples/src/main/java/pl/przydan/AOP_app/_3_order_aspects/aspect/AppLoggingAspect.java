package pl.przydan.AOP_app._3_order_aspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(0)
@Component
public class AppLoggingAspect {
    // this id where we add all of our related advices for logging

    @Before("pl.przydan.AOP_app._3_order_aspects.aspect.AopExpressions.forDaoPackageNoGettersSetters()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n===>>>> Executing @Before advice on all methods");
    }
}
