package com.itheima.static_attention;

public class Student {
    static String schoolName;// 类变量
    double score;// 实例变量
    // 1.
    public static void printHelloWorld(){
        // 注意：同一个类中访问类成员，可以省略类名不写
        Student.schoolName = "黑马";
        Student.printHelloWorld2();

        // System.out.println(score);//报错
        // printPass();//报错

        // System.out.println(this);//报错
    }
    public static void printHelloWorld2(){

        // 类方法
    }
    // 2.
    // 实例方法
    // 3.
    public  void printPass(){
        schoolName = "黑马2";
        printHelloWorld2();

        System.out.println(score);
        printPass2();
        System.out.println(this);
    }
    // 实例方法
    public void printPass2(){

    }
}
