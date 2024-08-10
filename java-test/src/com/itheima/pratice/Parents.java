package com.itheima.pratice;

import java.sql.SQLOutput;
// TODO implements:实现（继承）
//  条件：①实现：家长实现了行为的接口  ②重写方法:(加上执行语句)家长里就有了接口里的行为
//   ③父类引用指向子类对象（多态）
public class Parents extends People implements Action {
    // TODO 重写People类中的eat方法
    @Override
    public void eat() {
        System.out.println("家长在吃饭");
    }
    // TODO 重写Action类中的study，work方法
    @Override
    public void study() {
        System.out.println("家长在学习");
    }

    @Override
    public void work() {
        System.out.println("家长在工作");
    }
}
