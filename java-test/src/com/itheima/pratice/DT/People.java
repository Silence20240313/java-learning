package com.itheima.pratice.DT;

// TODO 抽象类（abstract）
//    三个条件：①子类继承父类 ②子类中重写父类方法 ③测试类：父类引用指向子类对象（多态）
//    *成员变量私有  *抽象方法不能写执行体
//     abstract写在public后面
public abstract class People {
    private String name;
    private int age;


    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}
