package pl.przydan.AOP_app._5_after_returning.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution( * pl.przydan.AOP_app._5_after_returning.DAO.*.*(..) )")
    public void forDaoPackage() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._5_after_returning.DAO.*.get*(..) )")
    public void getters() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._5_after_returning.DAO.*.set*(..) )")
    public void setters() {
    }

    @Pointcut("forDaoPackage() && !(getters() || setters())")
    public void forDaoPackageNoGettersSetters() {
    }


}
