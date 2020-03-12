package pl.przydan.AOP_app._2_pointcut_declarations.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppLoggingAspect {
    // this id where we add all of our related advices for logging

    @Pointcut("execution( * pl.przydan.AOP_app._2_pointcut_declarations.DAO.*.*(..) )")
    private void forDaoPackage() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._2_pointcut_declarations.DAO.*.get*(..) )")
    private void getters() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._2_pointcut_declarations.DAO.*.set*(..) )")
    private void setters() {
    }

    @Pointcut("forDaoPackage() && !(getters() || setters())")
    private void forDaoPackageNoGettersSetters() {
    }

    @Before("forDaoPackageNoGettersSetters()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n===>>>> Executing @Before advice on all methods");
    }
}
