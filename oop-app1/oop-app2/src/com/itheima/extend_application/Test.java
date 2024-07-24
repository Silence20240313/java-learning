package com.itheima.extend_application;

public class Test {
    public static void main(String[] args) {
        // TODO 继承的好处
        Teacher t = new Teacher();
        t.setName("播仔");
        t.setSkill("java");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();// 播仔具备的技能:java
    }
}
