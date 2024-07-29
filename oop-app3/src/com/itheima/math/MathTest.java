package com.itheima.math;

public class MathTest {
    public static void main(String[] args) {
        // TODO Math类提供的常见方法
        // 1.
        System.out.println(Math.abs(-12));// 12
        System.out.println(Math.abs(123));// 123
        System.out.println(Math.abs(-3.14));// 3.14

        // 2.
        System.out.println(Math.ceil(4.000001));// 5.0
        System.out.println(Math.ceil(4.0));// 4.0

        // 3.
        System.out.println(Math.floor(4.9999999));// 4.0
        System.out.println(Math.floor(4.0));// 4.0

        // 4.
        System.out.println(Math.round(3.49999));// 3
        System.out.println(Math.round(3.500001));// 4

        // 5.
        System.out.println(Math.max(10, 20));// 20
        System.out.println(Math.min(10, 20));// 10

        // 6.
        System.out.println(Math.pow(2, 3));// 8.0   2的3次方
        System.out.println(Math.pow(3, 2));// 9.0   3的2次方

        // 7.
        System.out.println(Math.random());// 随机的 0.4248507561876931
    }
}
