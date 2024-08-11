package com.itheima.pratice;

import com.itheima.pratice.STATIC.Cat;
import com.itheima.pratice.STATIC.StringUtil;
import org.junit.Test;

public class StaticFangFa {
    @Test
    public void demo7(){
       Cat c = new Cat();
       c.setName("喵喵");
       c.setAge(5);
       c.setKind("加菲");
       c.run();
       /* 猫猫要开始跑了
       姓名:喵喵  年龄：5  种类:加菲    正在跑*/

        String s1 = null;
        String s2 = "玛卡巴卡";
        String s3 = "Java高级编程言语";
        // TODO  static调用 ①类名.类方法  ②类名.类变量
        System.out.println(StringUtil.isValid(s1));
        System.out.println(StringUtil.isValid(s2));
        System.out.println(StringUtil.isValid(s3));
    }
}
