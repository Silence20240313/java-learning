package com.itheima.api_object;

public class Test {
    public static void main(String[] args) {
        // TODO Object类提供的常用方法
        Student s1 = new Student("赵敏",23);
        System.out.println(s1.toString());// Student{name='赵敏', age=23}
        System.out.println(s1);// Student{name='赵敏', age=23}


        Student s2 = new Student("赵敏",23);
        System.out.println(s2.equals(s1));// true
        System.out.println(s2 == s1);// false
    }
}
