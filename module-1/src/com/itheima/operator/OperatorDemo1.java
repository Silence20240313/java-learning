package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // TODO 掌握基本的算术运算符的使用
        int a = 10;
        int b =2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);// 20
        System.out.println(a / b);// 5
        System.out.println(5 / 2);// 2
        System.out.println(5.0 / 2);// 2.5
        int i = 5;
        int j =2;
        System.out.println(i*1.0 / j);// 2.5

        System.out.println(a % b);// 0
        System.out.println(3 % 2);// 1

        // TODO 掌握使用+符号做连接符的情况
        int a2 = 5;
        System.out.println("abc" + a2);// abc5
        System.out.println(a2 + 5);// 10
        System.out.println("itheima"+a2+'a');//itheima5a
        System.out.println(a2+'a'+"itheima");// 5+97+itheima  102itheima


    }
}
