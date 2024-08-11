package com.itheima.pratice.STATIC;

public class Animal {
    private String name;
    private int age;
    private String kind;

    public Animal() {
    }

    public Animal(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void run(){

        System.out.println("姓名:"+this.name +"  年龄：" + this.age + "  种类:" + this.kind + "    正在跑");
    }
}
