package pl.przydan.AOP_app._8_around_advice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution( * pl.przydan.AOP_app._8_around_advice.DAO.*.*(..) )")
    public void forDaoPackage() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._8_around_advice.DAO.*.get*(..) )")
    public void getters() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._8_around_advice.DAO.*.set*(..) )")
    public void setters() {
    }

    @Pointcut("forDaoPackage() && !(getters() || setters())")
    public void forDaoPackageNoGettersSetters() {
    }
}