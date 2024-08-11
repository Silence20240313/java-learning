package com.itheima.pratice.STATIC;

public class Cat extends Animal {
    @Override
    public void run(){
        System.out.println("猫猫要开始跑了");
        super.run();// 调用父类的run方法
    }
}
