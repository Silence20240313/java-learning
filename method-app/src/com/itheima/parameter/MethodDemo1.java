package com.itheima.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        // TODO 理解方法的参数传递机制：值传递
        int a = 10;
        change(a);// 10
        System.out.println(a);// 10
    }

    public static void change(int a){
        System.out.println(a);// 10
        a = 20;
        System.out.println(a);//20
    }
}
