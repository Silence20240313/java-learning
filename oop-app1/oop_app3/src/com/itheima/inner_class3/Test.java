package com.itheima.inner_class3;

public class Test {
    public static void main(String[] args) {
        // TODO 匿名内部类及作用
//        Animal a =  new Cat();
//        a.cry();

        // 1.把这个匿名内部类编译为一个子类，然后会立即创建一个子类对象出来
        Animal a = new Animal(){

            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}

//class Cat extends Animal{
//    @Override
//    public void cry() {
//       System.out.println("喵喵喵");
//    }
//}

abstract class Animal{
    public abstract void cry();
}