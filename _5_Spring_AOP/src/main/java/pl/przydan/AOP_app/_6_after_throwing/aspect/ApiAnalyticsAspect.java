package pl.przydan.AOP_app._6_after_throwing.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class ApiAnalyticsAspect {
    // this id where we add all of our related advices for logging

    @Before("pl.przydan.AOP_app._6_after_throwing.aspect.AopExpressions.forDaoPackageNoGettersSetters()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n===>>>> ApiAnalyticsAspect");
    }
}
