package com.itheima.pratice;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class WBRZ {
    public static void main(String[] args) throws Exception {
        // TODO 一： properties是用来代表属性文件的，通过properties可以读写属性文件里的内容
        //      properties属性文件：①都只能是键值对，且键不能重复 ②文件后缀是.properties
        // TODO 运用properties，读取属性文件里的键值对数据
        //      name = WANG SULONG
        //      age = 35
        // TODO 1.创建一个Properties的对象出来（键值对集合 空容器）
        Properties properties = new Properties();
        // TODO 2.开始加载属性文件中的键值对数据到Properties对象中去
        properties.load(new FileReader("java-test\\src\\user.properties"));// 属性文件的路径
        System.out.println(properties);// {name=WANG SULONG, age=35}


        // TODO 二:使用Dom4j读取Xml文件
        //  Dom4j解析XML-得到Document对象
         /*
         <?xml version="1.0" encoding="UTF-8" ?>
         <!-- 注释: 以上抬头声明必须放在第一行，必须有 -->
         <!-- 根标签只能有一个 -->
         <users>
    <user id = "1">
        <name>张无忌</name>
        <sex>男</sex>
        <地址>光明顶</地址>
        <password>minmin</password>
        <data>3&lt;2&amp;&amp;5>4</data>
        <data1>
            <![CDATA[
               3 < 2 && 5 > 4
            ]]>
        </data1>
    </user>
    <user id = "2">
        <name>敏敏</name>
        <sex>女</sex>
        <地址>光明顶</地址>
        <password>wuji</password>
        <data>3&lt;2&amp;&amp;5>4</data>
    </user>
    </users>
          */
        //  TODO 1.创建一个Dom4J框架提供的解析器对象
        SAXReader saxReader = new SAXReader();// SAXReader：构建Dom4J的解析器对象

        //  TODO 2.使用saxReader对象把需要解析的XML文件读成一个Document对象
        Document document =
                saxReader.read("java-test\\src\\wangsulong.xml");

        //  TODO 3.从文档对象中解析XML文件的全部数据了
        Element root = document.getRootElement();// getRootElement：获得根元素对象
        System.out.println(root.getName());//

        // TODO 三:日志级别
        //    ①trace ②debug ③info ④warn ⑤error
    }
}
