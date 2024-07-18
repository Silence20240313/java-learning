package com.itheima.overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        // TODO 认识方法重载并掌握其应用场景
        test();
        test(100);
    }
    public static void test(){
        System.out.println("test1");
    }
    public static void test(int a){
        System.out.println("test2" + a);
    }
}
