package cn.leegq.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hale Li 2018/4/23
 */
public class AnnoTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("anno-application.xml");
        Sleepable sleepable=(Sleepable)context.getBean("me");
        sleepable.sleep();
    }
}
