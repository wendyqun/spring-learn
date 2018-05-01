package cn.leegq.aop.pojo;

/**
 * @author Hale Li 2018/4/23
 */
public class SleepHelper {

    public void beforeSleep(){
        System.out.println("睡觉前要脱衣服");
    }

    public void afterSleep(){
        System.out.println("睡醒了要穿衣服");
    }
}
