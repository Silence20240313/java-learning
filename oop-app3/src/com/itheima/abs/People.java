package com.itheima.abs;

public abstract class People {
    // 设计模板方法设计模式
    // 1.定义一个模板方法出来
    public void write(){
        System.out.println("\t\t\t\t\t<<日本>>");
        System.out.println("\t\t3.12来东京了，开始学习日语和java");
        // 2.模板方法并不清楚正文部分到底应该怎么写，但是知道子类肯定要写
        System.out.println(writeMain());
        System.out.println("继续努力吧");
    }
   // 3.设计一个抽象方法写正文，具体的实现交给子类来完成

    public abstract String  writeMain();
}
