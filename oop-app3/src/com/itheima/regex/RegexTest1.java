package com.itheima.regex;
// TODO 使用正则表达式来校验数据格式的合法性
// 需求：校验QQ号是否正确，要求全部是数字，长度是6-20之间，不能以0开头
public class RegexTest1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("251425876"));// true
        System.out.println("--------------------------");
        System.out.println(checkQQ1("251425876"));// true
        System.out.println(checkQQ1("2sgf5876"));// false
    }

    public static boolean checkQQ1(String qq){
        return qq!=null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq){
        // 1.判断QQ号码是否为null
        if (qq == null || qq.startsWith("0") || qq.length()< 6 ||qq.length()> 20)  {
            return false;
        }

        // 2.qq至少不是null，不是以0开头，满足6-20之间的长度
        // 判断qq号码中是否都是数字
        // qq = 2514ghd234
        for (int i = 0; i < qq.length(); i++) {
            // 根据索引提取当前位置处的字符
            char ch = qq.charAt(i);
            // 判断ch记住的字符，如果不是数字，qq号码不合法
            if (ch < '0' || ch > '9'){
                return false;
            }
        }

        // 3.说明qq号码肯定是合法的
        return true;
    }
}
