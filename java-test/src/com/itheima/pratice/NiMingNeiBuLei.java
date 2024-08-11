package com.itheima.pratice;

import com.itheima.pratice.MXDX.Student;
import com.itheima.pratice.NMNBL.Car;
import org.junit.Test;

import java.util.ArrayList;

public class NiMingNeiBuLei {
    @Test
    public void demo9(){
        // TODO 匿名内部类
        //   3个条件：①new接口（相当于继承父类）②方法重写（重写接口（父类）中的方法）
        //          ③父类引用指向子类对象
        //  格式：new父类或者接口
        //  Car c = new Car(){
        //           重写子类的方法（重写必须有public且有执行体）
        //  }
       Car c = new Car(){
           @Override
           public void drive(){
               System.out.println("正在行驶");
           }
       };
       // TODO 调用方法
       c.drive();
    }
    @Test
    public void demo9_1(){
        // TODO new一个String类型的ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");// 添加元素
        list.add("李四");
        list.add("王五");
        list.add(1,"赵六");// 指定索引位置添加元素
        list.remove(3);// 移除元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));// 获取集合中的元素 get
        }
    }
    @Test
    public void demo9_2(){
        // TODO new一个Student类型的ArrayList
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",25,90);
        Student s2 = new Student("李四",34,78);
        Student s3 = new Student("王五",37,99);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // TODO 遍历数组取到每个对象的名字并输出
        for (int i = 0; i < list.size(); i++) {
            // 1.从list中拿到对象student
            Student student = list.get(i);
            // 2.从student中拿到每个人的名字
            String name = student.getName();
            // 3.输出姓名
            System.out.println(name);
        }
    }
}
