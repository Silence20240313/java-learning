package com.itheima.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

// TODO 把键值对数据存入到属性文件中去
public class PropertiesTest2 {
    public static void main(String[] args) throws Exception {
      // 1.创建Properties对象出来，先用它存储一些键值对数据
        Properties properties = new Properties();
        properties.setProperty("aaa","minmin");
        properties.setProperty("bbb","cuishan");
        properties.setProperty("ccc","susu");

        // 2.把Properties对象中的键值对数据存入到属性文件中去了
        properties.store(new FileWriter("properties/src/users2.properties"),
                "i saved many users!");
        }
    }

