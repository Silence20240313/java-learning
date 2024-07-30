package com.itheima.jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6_DateTimeFormatter {
    public static void main(String[] args) {
        // 1.创建一个日期时间格式化器对象出来
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2.对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);// 2024-07-30T21:32:01.606800900

        String rs = formatter.format(now);
        System.out.println(rs);// 2024年07月30日 21:32:01   正向格式化

        // 3.格式化时间，其实还有一种方案
        String rs2 = now.format(formatter);
        System.out.println(rs2);// 2024年07月30日 21:33:25  反向格式化

        // 4.解析时间:一般使用LocalDateTime提供的解析方法来解析
        String dateStr = "2029年12月12日 12:12:11";
        LocalDateTime ldt = LocalDateTime.parse(dateStr,formatter);
        System.out.println(ldt);// 2029-12-12T12:12:11
    }
}
