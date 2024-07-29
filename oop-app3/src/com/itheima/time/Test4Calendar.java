package com.itheima.time;

import java.util.Calendar;
import java.util.Date;

public class Test4Calendar {
    public static void main(String[] args) {
        // TODO Calendar的使用和特点
        // 1.得到系统此刻时间对应的日历对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 2.获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);// 2024

        int days = now.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);// 211

        // 3.拿到日历中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);// Mon Jul 29 21:28:42 JST 2024

        // 4.获取时间毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        // 5.修改日历中的某个信息
        now.set(Calendar.MONTH,9);// 修改为10月
        now.set(Calendar.DAY_OF_YEAR,125);// 修改成一年中的第125天
        System.out.println(now);

        // 6.为某个信息增加或者减少多少
        now.add(Calendar.DAY_OF_YEAR,100);
        now.add(Calendar.DAY_OF_YEAR,-10);
        now.add(Calendar.DAY_OF_MONTH,6);
        now.add(Calendar.HOUR,12);
        System.out.println(now);
    }
}
