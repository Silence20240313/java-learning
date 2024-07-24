package com.itheima.extend_feature;

public class Test {
    public static void main(String[] args) {
        // TODO 继承的两个注意事项
       A a = new A();

       B b = new B();
    }
}

class A{} // extends Object {}
class B extends A{}
//  class C extends B,A{}  // 报错
class D extends B{}