package com.itheima.jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Test8_Duration {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025,11,11,11,10,10);
        LocalDateTime end = LocalDateTime.of(2025,11,11,11,11,11);
        // 1.得到Duration对象
        Duration duration = Duration.between(start,end);

        // 2.获取两个时间对象间隔的信息
        System.out.println(duration.toDays());// 天  0
        System.out.println(duration.toHours());// 小时  0
        System.out.println(duration.toMinutes());// 分  1
        System.out.println(duration.toSeconds());// 秒  61
        System.out.println(duration.toMillis());// 毫秒  61000
        System.out.println(duration.toNanos());// 纳秒  61000000000
    }
}
