package com.itheima.polymorphism2;

public class Student extends People {
    @Override
    public void run() {
        System.out.println("学生跑的贼快");
    }

    public void test(){
        System.out.println("学生需要考试");
    }
}
