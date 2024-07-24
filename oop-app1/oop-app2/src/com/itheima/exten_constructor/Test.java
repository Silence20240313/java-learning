package com.itheima.exten_constructor;

import java.sql.SQLOutput;

class F{
    public F() {
        System.out.println("父类F的 无参数构造器 执行了");
    }
}
class Z extends F{
    public Z() {
        // super();// 默认存在
        System.out.println("子类Z的 无参数构造器 执行了");
    }

    public Z(String name) {
        // super();// 默认存在
        System.out.println("子类Z的 有参数构造器 执行了");
    }
}
public class Test {
    public static void main(String[] args) {
        // TODO 子类构造器的特点及其常见应用场景
        Z z = new Z();
        // 父类F的 无参数构造器 执行了   子类Z的 无参数构造器 执行了
        Z z2 = new Z("张三");
        // 父类F的 无参数构造器 执行了   子类Z的 有参数构造器 执行了
    }
}
