package cn.leegq.aop.anno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Hale Li 2018/4/23
 *
 * 使用注解方式定义切面
 */
@Aspect
public class SleepHelper {

    @Pointcut("execution(* *.sleep())")
    public void sleeppoint() {
    }

    @Before("sleeppoint()")
    public void beforeSleep() {
        System.out.println("睡觉前要脱衣服");
    }

    @AfterReturning("sleeppoint()")
    public void afterSleep() {
        System.out.println("睡醒了要穿衣服");
    }
}
