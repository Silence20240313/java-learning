package com.itheima.exten_visit;

public class Test {
    public static void main(String[] args) {
        // TODO 子类中访问其他成员的特点：就近原则
        Z z = new Z();
        z.showName();
        z.showMethod();
    }
}
