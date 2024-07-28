package com.itheima.api_object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO Object类提供的对象克隆的方法
        // 对象克隆 protected Object clone()
        User u1 = new User(1,"张三","wo666",new double[]{99.0,99.5});

        User u2 = (User) u1.clone();

        System.out.println(u1.getId());
        System.out.println(u1.getPassword());
        System.out.println(u1.getUsername());
        System.out.println(u1.getScores());

        System.out.println("--------------------");

        System.out.println(u2.getId());
        System.out.println(u2.getPassword());
        System.out.println(u2.getUsername());
        System.out.println(u2.getScores());
    }
}
