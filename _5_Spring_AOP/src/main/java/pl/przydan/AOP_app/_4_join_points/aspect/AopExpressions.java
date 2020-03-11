package pl.przydan.AOP_app._4_join_points.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution( * pl.przydan.AOP_app._4_join_points.DAO.*.*(..) )")
    public void forDaoPackage() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._4_join_points.DAO.*.get*(..) )")
    public void getters() {
    }

    @Pointcut("execution( * pl.przydan.AOP_app._4_join_points.DAO.*.set*(..) )")
    public void setters() {
    }

    @Pointcut("forDaoPackage() && !(getters() || setters())")
    public void forDaoPackageNoGettersSetters() {
    }


}
