package com.itheima.jdk8_time;

import java.time.Instant;

public class Test5_Instant {
    public static void main(String[] args) {
        // 1.创建Instant的对象，获取此刻时间信息
        Instant now =  Instant.now();

        // 2.获取总秒数
        long second = now.getEpochSecond();
        System.out.println(second);

        // 3.不够一秒的纳秒数
        int nano =  now.getNano();
        System.out.println(nano);

        System.out.println(now);

        Instant instant = now.plusNanos(111);

        // Instant对象的作用：做代码的性能分析，或者记录用户的操作时间点
        Instant now1 = Instant.now();
        // 代码执行
        Instant now2 = Instant.now();
    }
}
