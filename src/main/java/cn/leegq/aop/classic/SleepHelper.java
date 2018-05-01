package cn.leegq.aop.classic;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Hale Li 2018/4/23
 *
 * 使用经典方式定义切面（最复杂的一种方式）
 *
 */
public class SleepHelper implements MethodBeforeAdvice,AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("睡醒了要穿衣服");
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("睡觉前要脱衣服");
    }
}
