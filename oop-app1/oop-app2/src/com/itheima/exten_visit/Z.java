package com.itheima.exten_visit;

import java.security.PublicKey;

public class Z extends F {
    String name = "子类名称";
    public void showName(){
        String name = "局部名称";
        System.out.println(name);// 局部名称
        System.out.println(this.name);// 子类名称
        System.out.println(super.name);// 父类名字
    }

    @Override
    public void print1(){
        System.out.println("子类的print1方法执行了");
    }
    public void showMethod(){
        print1();//子类的
        super.print1();// 父类的
    }
}
