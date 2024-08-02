package com.itheima.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores,88.5,100.0,60.0,99.0,9.5,99.6,25.0);
        // 需求1：找出成绩大于等于60分的数据，升序再输出
        scores.stream().filter(s -> s >= 60).sorted().forEach(s-> System.out.println(s));

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精",26,172.5);
        Student s2 = new Student("蜘蛛精",26,172.5);
        Student s3 = new Student("紫霞",23,167.6);
        Student s4 = new Student("白晶晶",25,169.0);
        Student s5 = new Student("牛魔王",35,183.3);
        Student s6 = new Student("牛夫人",34,168.5);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6);
        // 2.找出年龄大于等于23，且年龄小于等于30岁的学生，并按照年龄降序输出
        students.stream().filter(s -> s.getAge() >= 23 && s.getAge() <= 30)
                .sorted((o1,o2) -> o2.getAge() - o1.getAge())
                .forEach(s -> System.out.println(s));

        // 3.取出身高最高的前3名学生，并输出
        students.stream().sorted((o1,o2) -> Double.compare(o2.getHeight(),o1.getHeight()))
                .limit(3).forEach(System.out::println);

        // 4.取出身高倒数的2名学生，并输出
        students.stream().sorted((o1,o2) -> Double.compare(o2.getHeight(),o1.getHeight()))
                .skip(students.size() - 2).forEach(System.out::println);

        // 5.找出身高超过168的学生叫什么名字，要求去除重复的名字，再输出
        students.stream().filter(s -> s.getHeight() > 168).map(Student::getName)
                .distinct().forEach(s -> System.out.println(s));

        // distinct:去重复
        // concat：合并流
        Stream<String> st1 = Stream.of("张三","李四");
        Stream<String> st2 = Stream.of("张三2","李四2","王五");
        Stream<String> allSt = Stream.concat(st1, st2);
        allSt.forEach(System.out::println);
    }
}
