package com.itheima.util;

import java.util.Random;

public class MyUtil {
    private MyUtil(){

    }
    public static String createCode(int n){
        String code = "";
        String date = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        // 2.开始定义一个循环产生每位随机字符
        for (int i = 0; i < n; i++) {
            // 3.随机一个字符范围内的索引
            int index = r.nextInt(date.length());
            // 4.根据索引去全部字符中，提取该字符
            code += date.charAt(index);
        }
        return code;
    }
}
