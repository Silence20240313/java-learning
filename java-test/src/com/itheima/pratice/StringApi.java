package com.itheima.pratice;

public class StringApi {
    public static void main(String[] args) {
        // TODO 掌握string提供的处理字符串的常用方法
        String s = "黑马Java";
        // TODO 1.获取字符串的长度
        System.out.println(s.length());// 6

        // TODO 2.提取字符串中某个索引位置处的字符
        char c = s.charAt(1);
        System.out.println(c);// 马

        // TODO 字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            // i = 0 1 2 3 4 5
            char ch = s.charAt(i);
            System.out.println(ch);// 黑马Java
        }

        // TODO 3.把字符串转换成字符数组，再进行遍历
        System.out.println("--------");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);// 黑马Java
        }
        System.out.println("--------");

        // TODO 4.判断字符串内容，内容一样就返回true
        String s1 = new String("黑马");
        String s2 = new String("黑马");
        System.out.println(s1 == s2);//false 判断地址
        System.out.println(s1.equals(s2));//true

        // TODO 5.忽略大小写，比较字符串内容
        String c1 = "34AeFG";
        String c2 = "34aEfg";
        System.out.println(c1.equals(c2));//false 不忽略大小写
        System.out.println(c1.equalsIgnoreCase(c2));//true 忽略大小写

        // TODO 6.截取字符串内容
        String s3 = "Java是最好的编程语言之一";
        String rs = s3.substring(0,8);// 1-8
        System.out.println(rs);// Java是最好的

        // TODO 7.从当前索引位置一直截取到字符串的末尾
        String rs2 = s3.substring(5);
        System.out.println(rs2);// 最好的编程语言之一

        // TODO 8.把字符串中的某个内容替换成新内容，并返回新的字符串对象给我们
        String info = "这个电影简直是个垃圾，垃圾电影";
        String rs3 =info.replace("垃圾","**");
        System.out.println(rs3);// 这个电影简直是个**，**电影

        // TODO 9.判断字符串中是否包含某个关键字
        String info2 = "Java是最好的编程语言之一，我爱Java，Java不爱我";
        System.out.println(info2.contains("Java"));//true

        // TODO 10.判断字符串是否以某个字符串开头，
        String rs4 = "张三";
        System.out.println(rs4.startsWith("张"));// true

        // TODO 11.把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中，返回给我们
        String rs5 = "汪苏泷,魏大勋,李宇春";
        String[] names = rs5.split(",");// 按照逗号去分割内容
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            // 汪苏泷
            //魏大勋
            // 李宇春
        }
    }
}
