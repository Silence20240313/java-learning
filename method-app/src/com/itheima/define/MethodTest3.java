package com.itheima.define;

public class MethodTest3 {
    public static void main(String[] args) {
        //  TODO 掌握设计方法的技巧
        System.out.println(add(5));
    }

    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            // i =  1 2 3 4 ...n
            sum += i;
        }
        return sum;
    }
}
