package com.itheima.pratice;

import org.junit.Test;

public class Test5 {
    @Test
    public void demo5(){
        // TODO new一个学生类s1出来并赋予相关信息
        //  调用方法一:输出学生信息
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(25);
        s1.setScore(99);
        print(s1);

        // TODO new一个老师类t1出来并赋予相关信息
        //   调用方法二:输出老师及附带的学生信息
        Teacher t1 = new Teacher("李四",60,100,s1);
        print1(t1);

        // TODO 把学生s1的信息重新变更
        //  调用方法输出新信息
        s1.setName("张三丰");
        s1.setAge(26);
        s1.setScore(100);
        print(s1);

        // TODO 把老师t1的年龄变更
        //  调用方法输出新信息
        t1.setAge(61);
        print1(t1);

        // TODO new一个学生类s2出来并赋予相关信息
        Student s2 = new Student();
        s2.setName("王五");
        s2.setAge(33);
        s2.setScore(59);
        // TODO 老师t1所带的学生变更为s2
        //  调用方法输出老师信息及新的学生信息
        t1.setStudent(s2);
        print1(t1);
    }


    // TODO 方法一: 输出学生的姓名年龄分数
    private void print(Student s){
        System.out.println("姓名:" + s.getName() +"   年龄:" + s.getAge() + "   分数:" + s.getScore());
    }

    // TODO 方法二: 输出老师的姓名年龄分数 及 他带着的一个学生的信息
    private void print1(Teacher t){
        System.out.println("姓名:" + t.getName()+"   年龄:"  + t.getAge() + "   分数:"  + t.getScore());
        print(t.getStudent());
    }
}
