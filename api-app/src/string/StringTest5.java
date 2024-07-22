package string;

import java.util.Random;
import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(6));
    }

    // 1.设计一个方法，返回指定位数的验证码
    public static String createCode(int n){
        // 2.定义两个变量，一个是记录最终产生的随机验证码，一个是记住可能用到的全部字符
        String code = "";
        String date = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        // 3.开始定义一个循环产生每位随机字符
        for (int i = 0; i < n; i++) {
            // 4.随机一个字符范围内的索引
            int index = r.nextInt(date.length());
            // 5.根据索引去全部字符中，提取该字符
            code += date.charAt(index);
        }
        // 6.返回code即可
        return code;
    }
}
