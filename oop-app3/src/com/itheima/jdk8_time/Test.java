package com.itheima.jdk8_time;
import java.util.Calendar;
import java.util.Date;
// TODO 为什么要用JDK8开始新增的时间类
public class Test {
    public static void main(String[] args) {
        // TODO 传统的时间类存在如下问题
        // 1.
        Date d = new Date();
        // System.out.println(d.getYear() + 1900);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

    }
}
