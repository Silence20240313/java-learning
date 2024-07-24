package com.itheima.block;

public class Test {
    public static void main(String[] args) {
        // TODO 认识两种代码块，了解他们的特点和基本作用
        System.out.println(Student.number);// 静态代码块执行了 80
        System.out.println(Student.number);//  80
        System.out.println(Student.number);//  80

        System.out.println(Student.schoolName);// 黑马

        System.out.println("--------------------");


        Student s1 = new Student();// 实例代码块执行了  无参数构造器执行了
        Student s2 = new Student("张三");//实例代码块执行了 有参数构造器执行了
        System.out.println(s1.age);// 18
        System.out.println(s2.age);// 18
    }
}
