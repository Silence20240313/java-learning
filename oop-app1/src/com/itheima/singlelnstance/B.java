package com.itheima.singlelnstance;

public class B {
    // 2.定义一个类变量,用于存储这个类的一个对象
    private static B b;
    // 1.必须私有类的构造器
    private B(){

    }
    // 3.定义一个类方法,这个方法要保证第一次调用时才创建一个对象，后面调用时都会用这同一个对象返回
    public static B getInstance(){
        if (b == null){
            System.out.println("第一次创建对象");
            b =new B();
        }
        return b;
    }
}
