package com.itheima.singlelnstance;

public class Test1 {
    public static void main(String[] args) {
        // TODO 单例设计模式的写法
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println(a1);// A@3b07d329
        System.out.println(a2);// A@3b07d329
    }
}
