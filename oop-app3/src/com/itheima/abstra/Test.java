package com.itheima.abstra;

public class Test {
    public static void main(String[] args) {
        // TODO 抽象类的好处
        Animal a = new Cat();
        a.setName("叮当猫");
        a.cry();// 更好的支持了多态
    }
}
