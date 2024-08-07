package com.itheima.reflect;
// TODO 获取class对象
public class Test1Class {
    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        System.out.println(c1.getName());// 全类名 com.itheima.reflect.Student
        System.out.println(c1.getSimpleName());// 简名 Student

        Class c2 = Class.forName("com.itheima.reflect.Student");
        System.out.println(c1 == c2);// true

        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c2);// true
    }
}
