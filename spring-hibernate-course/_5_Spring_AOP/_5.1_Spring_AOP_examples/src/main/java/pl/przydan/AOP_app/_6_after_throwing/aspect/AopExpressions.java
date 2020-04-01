package pl.przydan.AOP_app._6_after_throwing.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution( * pl.przydan.AOP_app._6_after_throwing.DAO.*.*(..) )")
    public void forDaoPackage() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._6_after_throwing.DAO.*.get*(..) )")
    public void getters() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._6_after_throwing.DAO.*.set*(..) )")
    public void setters() {
    }

    @Pointcut("forDaoPackage() && !(getters() || setters())")
    public void forDaoPackageNoGettersSetters() {
    }


}
