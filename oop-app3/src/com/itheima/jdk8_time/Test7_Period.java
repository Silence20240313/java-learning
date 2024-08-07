package com.itheima.jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class Test7_Period {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2029,8,10);
        LocalDate end = LocalDate.of(2029,8,15);
        // 1.创建Period对象，封装两个日期对象
        Period period= Period.between(start,end);

        // 2.通过period对象获取两个日期对象相差的信息
        System.out.println(period.getYears());// 0
        System.out.println(period.getMonths());// 0
        System.out.println(period.getDays());// 5
    }
}
