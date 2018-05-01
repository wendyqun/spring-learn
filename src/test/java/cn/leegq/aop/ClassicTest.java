package cn.leegq.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hale Li 2018/4/23
 */
public class ClassicTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classic-application.xml");
        Sleepable sleepable = (Sleepable) context.getBean("proxy");
        sleepable.sleep();
    }
}
