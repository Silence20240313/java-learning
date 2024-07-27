package com.itheima.inner_class2;

public class Outer {
    private int age;
    public static String schoolName;
    // 静态内部类
    public static class Inner{
       private String name;
       public static int a;

       public void test(){
           System.out.println(schoolName);
           // System.out.println(age);
       }

        public String getName() {
            return name;
        }
    }
    public static void test2(){
        System.out.println(schoolName);
        // System.out.println(age);
    }
}
