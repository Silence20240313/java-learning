package com.itheima.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

// TODO Dom4J框架解析XML文件
public class Dom4JTest1 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个Dom4J框架提供的解析器对象
        SAXReader saxReader = new SAXReader();

        // 2.使用saxReader对象把需要解析的XML文件读成一个Document对象
        Document document =
                saxReader.read("properties\\src\\helloworld.xml");

        // 3.从文档对象中解析XML文件的全部数据了
        Element root = document.getRootElement();
        System.out.println(root.getName());// users

        // 4.获取根元素下的全部一级子元素
        /*List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());*/
        //user
        //user

        List<Element> elements = root.elements("user");
        for (Element element : elements) {
            System.out.println(element.getName());
            //user
            //user

            // 5.获取当前元素下的某个子元素
            // 如果下面有很多子元素user，默认获取第一个
            Element user = root.element("user");
            System.out.println(user.elementText("name"));// 张无忌

            // 6.获取元素的属性信息
            System.out.println(user.attributeValue("id"));// 1
            Attribute id = user.attribute("id");
            System.out.println(id.getName());// id
            System.out.println(id.getValue());// 1

            List<Attribute> attributes = user.attributes();
            for (Attribute attribute : attributes) {
                System.out.println(attribute.getName() + "=" + attribute.getValue());
            }

            // 7.获取全部的文本内容:获取当前元素下的子元素文本值
            System.out.println(user.elementText("name"));// 张无忌
            System.out.println(user.elementText("地址"));// 光明顶
            System.out.println(user.elementText("password"));// minmin

            Element data = user.element("data");
            System.out.println(data.getText());// 3<2&&5>4
            System.out.println(data.getTextTrim());// 3<2&&5>4 取出文本去除前后空格
        }
    }
}
