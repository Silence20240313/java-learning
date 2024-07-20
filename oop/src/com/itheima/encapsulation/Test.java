package com.itheima.encapsulation;

public class Test {
    public static void main(String[] args) {
        // TODO 封装的设计规范：合理隐藏合理暴露
        Student s1 = new Student();
        s1.setScore(80);
        System.out.println(s1.getScore());
    }
}
