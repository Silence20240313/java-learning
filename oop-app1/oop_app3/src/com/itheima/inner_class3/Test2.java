package com.itheima.inner_class3;

import com.itheima.enu.C;

public class Test2 {
    public static void main(String[] args) {
        // TODO 匿名的常见使用场景
        //Swimming s1 = new Swimming(){
             // @Override
             // public void swim() {
                 // System.out.println("狗游泳");
             // }
          //};
        //go(s1);
//        go(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("狗游泳");
//            }
//        });




//        Swimming c = new Dog();
//        go(c);
//
//        Swimming b = new Cat();
//        go(b);

        Swimming dogCry = new Swimming() {
            @Override
            public void swim() {
                System.out.println("dog cry");
            }
        };

        Swimming catCryy = new Swimming() {
            @Override
            public void swim() {
                System.out.println("cat cry");
            }
        };

        go(catCryy);
    }
    // 设计一个方法：可以接收Swimming接口的一切实现类对象来参加有用比赛
    public static void go (Swimming s){
        System.out.println("--------------开始");
        s.swim();
    }
}



// 猫和狗都要参加游泳比赛
interface Swimming{
    void swim();
}

class Dog implements Swimming {

    @Override
    public void swim() {
        System.out.println("dog swim");
    }
}

class Cat implements Swimming {

    @Override
    public void swim() {
        System.out.println("cat swim");
    }
}