package com.itheima.stringBuilder;

public class Test {
    public static void main(String[] args) {
        // TODO stringBuilder的用法和作用
        //StringBuilder s = new  StringBuilder();// s ""
        StringBuffer s = new  StringBuffer("itheima");// s "itheima"

        // 1.拼接内容
        s.append(12);
        s.append("黑马");
        s.append(true);

        // 支持链式编程
        s.append(666).append("黑马2").append(666);
        System.out.println(s);// itheima12黑马true666黑马2666

        // 2.翻转操作
        s.reverse();
        System.out.println(s);// 6662马黑666eurt马黑21amiehti

        // 3.返回字符串的长度
        System.out.println(s.length());

        // 4.把StringBuilder对象又转换成String类型
        String rs = s.toString();
        System.out.println(rs);// 6662马黑666eurt马黑21amiehti
    }
}
