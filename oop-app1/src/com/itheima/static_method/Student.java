package com.itheima.static_method;

public class Student {
    double score;
    // 类方法
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    // 实例方法（对象的方法）
    public void printPass(){
        System.out.println("成绩:"+
                (score >= 60?"合格":"不合格"));
    }
}
