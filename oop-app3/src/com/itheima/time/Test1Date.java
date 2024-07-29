package com.itheima.time;

import java.util.Date;

public class Test1Date {
    public static void main(String[] args) {
        // TODO Date日期类的使用
        // 1.创建一个Date的对象，代表系统当前的时间信息的
        Date d = new Date();
        System.out.println(d);// Mon Jul 29 20:30:55 JST 2024

        // 2.拿到时间毫秒值
        long time = d.getTime();
        System.out.println(time);// 1722252718896

        // 3.把时间毫秒值又转换为日期对象 2秒之后的时间是多少
        time += 2*1000;
        Date d2 = new Date(time);
        System.out.println(d2);// Mon Jul 29 20:33:50 JST 2024

        // 4.直接把日期对象的时间通过setTime方法进行修改
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);// Mon Jul 29 20:35:34 JST 2024
    }
}
