package com.itheima.polymorphism2;

public class Test {
    public static void main(String[] args) {
        // TODO 多态的好处
        // 好处1：可以实现解耦合，右边对象可以随时切换，后续业务随之改变
        People p1 = new Student();
        p1.run();
        // p1.test();// 多态下存在的问题，无法直接调用子类的独有功能
        // p1.teach();//多态下存在的问题，无法直接调用子类的独有功能

        // 强制类型转换
        Student s1 = (Student)p1;
        s1.test();// 独有功能

        //强制类型转换可能存在的问题：编译阶段有继承或者实现关系就可以强制转换，
        //但是，运行时可以出现类型转换异常
       //  Teacher t1 =(Teacher)p1;// 运行异常：学生对象不能被转成老师对象
        if (p1 instanceof Student){
            Student s2 = (Student)p1;
            s2.test();
        }else {
            Teacher t2 = (Teacher)p1;
            t2.teach();
        }

        System.out.println("---------------");
        // 好处2：可以使用父类类型的变量作为形参，可以接收一切子类对象
        Student s = new Student();
        go(s);

        Teacher t = new Teacher();
        go(t);
    }

       public static void go(People p){
           p.run();
           if (p instanceof Student){
               Student s = (Student)p;
               s.test();
           }else if(p instanceof Teacher){
               Teacher t = (Teacher)p;
               t.teach();

       }
    }
}
