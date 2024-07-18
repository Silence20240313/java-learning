package com.itheima.define;

public class MethodTest4 {
    public static void main(String[] args) {
        //  TODO 掌握设计方法的技巧
        judge(10);
        judge(3);
    }

    public static void judge(int number){
       if (number % 2==0){
           System.out.println("偶数");
       }else{
           System.out.println("奇数");
       }
    }
}
