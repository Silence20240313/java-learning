package com.itheima.pratice;

public class StringUtil {
    public static boolean isValid(String s){
        // TODO 接收一个String变量 ①不能是null ②长度必须为10 ③不能包含“巴”字
        if (s != null && s.length() == 10 && !s.contains("巴")){
            return true;
        }
        return false;
    }
}
