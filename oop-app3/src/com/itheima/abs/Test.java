package com.itheima.abs;
public class Test {
    public static void main(String[] args) {
        // TODO 抽象类的应用场景之一：经常用来设计模板方法设计模式
        // 场景：学生老师都要写一篇作文：日本
        // 第一段一样
        // 正文自由发挥
        // 结尾一样
        Teacher t = new Teacher();
        t.write();
        /*
        	        <<日本>>
		   3.12来东京了，开始学习日语和java
           每天学日语好烦，it也听不懂
           继续努力吧
         */
    }
}
