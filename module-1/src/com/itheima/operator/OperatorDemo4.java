package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // TODO 掌握关系运算符的基本使用
        int a = 10;
        int b = 5;
        boolean rs = a>b;
        System.out.println(rs);

        System.out.println(a >= b);// 大于或者等于
        System.out.println(2 >= 2);// true
        System.out.println(a < b);
        System.out.println(a <= b);// false
        System.out.println(2 <= 2);// true
        System.out.println(a == b);// false
        System.out.println(5 == 5);// true
        // System.out.println(a=b);// 5  ==:等于   =:赋值
        System.out.println(a!=b);// true
        System.out.println(10 != 10);// false
    }
}
