package com.itheima.recursion;

// TODO 递归的形式
public class RecursionTest1 {
    public static void main(String[] args) {
        test1();
    }

    // 直接方法递归
    public static void test1(){
        System.out.println("-----test1------");
        test1();// 直接方法递归
    }

    // 间接方法递归
    public static void test2(){
        System.out.println("-----test2------");
        test3();
    }

    public static void test3(){
        System.out.println("-----test3------");
        test2();// 间接递归
    }
}
