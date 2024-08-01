package com.itheima.exception;

import java.util.Scanner;

// TODO 异常的处理方式：捕获异常 尝试修复
public class ExceptionTest3 {
    public static void main(String[] args) {
     // 需求：调用一个方法，让用户输入一个合适的价格返回为止
        // 尝试修复
        while (true) {
            try {
                System.out.println(getMoney());
            } catch (Exception e) {
                System.out.println("请输入合法的数字");
            }
        }
    }
    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入价格");
            double money = sc.nextDouble();
            if (money >= 0){
                return money;
            }else {
                System.out.println("输入的价格不合适");
            }
        }
    }
}
