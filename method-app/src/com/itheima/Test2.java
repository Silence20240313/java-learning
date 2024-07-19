package com.itheima;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        // TODO 生成随机验证码
        System.out.println(createCode(4));
    }

    public static String createCode(int n){
        // 1.定义一个for循环 用于控制产生多少位随机字符
        Random r = new Random();
        // 3.定义一个String类型的变量用于记住产生的每位随机字符
        String code = "";
        for (int i = 1; i <= n; i++) {
            // i = 1 2 3 ...n
            // 2.为每个位置生成一个随机字符，数字大小写字母
            // 思路：随机一个0 1 2 之间的数字出来，0代表数字，1 2代表大小写字母
            int type = r.nextInt(3) ;// 0  1   2
            switch (type){
                case 0:
                    // 随机一个数字
                    code += r.nextInt(10);// 0-9
                    break;
                case 1:
                    // 随机一个大写字母  A 65  Z65+25   (0-25)+65
                    char ch1 = (char) (r.nextInt(26)+65);
                    code += ch1;
                    break;
                case 2:
                    // 随机一个小写字母   a 97  z97+25   (0-25)+97
                    char ch2 = (char) (r.nextInt(26)+97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
