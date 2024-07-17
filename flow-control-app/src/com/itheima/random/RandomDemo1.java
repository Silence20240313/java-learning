package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        // TODO 掌握使用Random生成随机数的步骤
        // 1.导包
        // 2.创建一个Random对象用于生成随机数
        Random r = new Random();
        // 3.调用Random提供的功能，nextint得到随机数
        for (int i = 1;i <= 20;i++) {
            int date = r.nextInt(10);//0-9
            System.out.println(date);
        }

        System.out.println("======================");

        // 生成1-10之间的随机数
        //1-10 先减1变成0-9 然后再加1
        for (int i = 1;i <= 20;i++) {
            int date1 = r.nextInt(10)+1;
            System.out.println(date1);
        }

        System.out.println("======================");

        // 生成3-17之间的随机数
        // 先减3 区间就变为0-14 然后再加3
        for (int i = 1;i <= 20;i++) {
            int date2 = r.nextInt(15)+3;
            System.out.println(date2);
        }
    }
}
