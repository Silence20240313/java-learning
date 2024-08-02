package com.itheima.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精",26,172.5);
        Student s2 = new Student("蜘蛛精",26,172.5);
        Student s3 = new Student("紫霞",23,167.6);
        Student s4 = new Student("白晶晶",25,169.0);
        Student s5 = new Student("牛魔王",35,183.3);
        Student s6 = new Student("牛夫人",34,168.5);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6);

        // 1.身高超过168的有几人
        long size = students.stream().filter(s -> s.getHeight() > 168 ).count();
        System.out.println(size);// 5

        // 2.找出身高最高的学生对象，并输出
        Student z = students.stream().max((o1,o2) -> Double.compare(o1.getHeight(),o2.getHeight())).get();
        System.out.println(z);// Student{name='牛魔王', age=35, height=183.3}

        // 3.找出身高最矮的学生对象，并输出
        Student x = students.stream().min((o1,o2) -> Double.compare(o1.getHeight(),o2.getHeight())).get();
        System.out.println(x);// Student{name='紫霞', age=23, height=167.6}

        // 4.找出身高超过170的学生对象，并放到一个新集合中去返回
        // 流只能收集一次
        List<Student> students1 = students.stream().filter(y -> y.getHeight() > 170).collect(Collectors.toList());
        System.out.println(students1);

        Set<Student> students2 = students.stream().filter(y -> y.getHeight() > 170).collect(Collectors.toSet());
        System.out.println(students2);

        // 5.找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合返回
        Map<String,Double>  map =
                students.stream().filter(y -> y.getHeight() > 170)
                        .distinct()
                        .collect(Collectors.toMap(y -> y.getName(), y -> y.getHeight()));
        System.out.println(map);

        // 数组
        // Object[] arr = students.stream().filter(y -> y.getHeight() > 170).toArray();
        Student[] arr = students.stream().filter(y -> y.getHeight() > 170).toArray(len -> new Student[len]);
        System.out.println(Arrays.toString(arr));
    }
}
