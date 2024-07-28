package com.itheima.api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // TODO objects类提供的常用方法
        String s1 = "itheima";
        String s2 = "itheima";

        System.out.println(s1.equals(s2));// true
        System.out.println(Objects.equals(s1, s2));// true 推荐

        System.out.println(Objects.isNull(s1));// false
        System.out.println(s1 == null);// false

        System.out.println(Objects.nonNull(s2));// true


    }
}
