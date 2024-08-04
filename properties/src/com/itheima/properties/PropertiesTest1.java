package com.itheima.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

// TODO Properties类读取属性文件中的键值对信息
public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
      // 1.创建一个Properties的对象出来（键值对集合 空容器）
        Properties properties = new Properties();
        System.out.println(properties);// {}

        // 2.开始加载属性文件中的键值对数据到Properties对象中去
        properties.load(new FileReader("properties\\src\\users.properties"));
        System.out.println(properties);

        // 3.根据键取值
        System.out.println(properties.getProperty("ccc"));// wuji

        // 4.遍历全部的键和值
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "--->" + value);
            // aaa--->minmin
            //ccc--->wuji
            //bbb--->wuji
            //admin--->123456
        }
            properties.forEach((k,v)->{
                System.out.println(k + "--->" + v);
            });
        }
    }

