package cn.leegq.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hale Li 2018/4/23
 *         <p>
 *         使用Spring来定义纯粹的POJO切面
 */
public class PojoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("pojo-application.xml");
        Sleepable sleepable = (Sleepable) context.getBean("me");
        sleepable.sleep();
    }
}
