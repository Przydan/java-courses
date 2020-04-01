package pl.przydan.AOP_app._1_before_advice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppLoggingAspect {
    // this id where we add all of our related advices for logging

    @Before(value = "execution( * pl.przydan.AOP_app._1_before_advice.DAO.*.*(..) )")
    public void beforeAddAccountAdvice() {
        System.out.println("\n===>>>> Executing @Before advice on all methods");
    }
}
