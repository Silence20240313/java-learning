package com.itheima.polymorphism;

public class Test {
    public static void main(String[] args) {
        // TODO 对象多态 行为多态
        // 1.对象多态
        People p1 = new Teacher();
        p1.run();// 老师跑的气喘吁吁  //编译看左边，运行看右边

        People p2 = new Student();
        p2.run();// 学生跑的贼快
    }
}
