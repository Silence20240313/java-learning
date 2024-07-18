package com.itheima.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        //  TODO 掌握定义方法的完整格式，搞清楚使用方法的好处
        //  需求：很多人都要进行两个整数求和的操作
        int rs = sum(10,20);
        System.out.println(rs);
    }
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
}
