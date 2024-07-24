package com.itheima.exten_constructor;

public class Test2 {
    public static void main(String[] args) {
        // TODO 子类构造器调用父类构造器，应用场景
        Teacher t = new Teacher("李四",36,"java");
        System.out.println(t.getName());// 李四
        System.out.println(t.getAge());// 36
        System.out.println(t.getSkill());// java
    }
}

class Teacher extends People{
    private String skill;

    public Teacher(String name, int age, String skill) {
       super(name,age);
       this.skill=skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

class People{
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
}