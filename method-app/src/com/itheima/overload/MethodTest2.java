package com.itheima.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        // TODO 掌握方法重载的应用场景
        fire();
        fire("米国");
        fire("米国",100);
    }

    public static void fire() {
        System.out.println("发射一枚武器");
    }

    public static void fire(String country) {
        System.out.println("发射一枚武器给"+country );
    }

    public static void fire(String country,int number) {
        System.out.println("发射"+number+"枚武器给"+country);
    }
}

