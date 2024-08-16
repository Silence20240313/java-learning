package com.itheima.pratice;

import org.junit.Test;

import java.util.*;

public class KuangJia2 {
    @Test
    public void demo12() {
        // TODO Map:键值对
        //   HashMap：无序 不重复 无索引
        Map<String, String> map = new HashMap<>();
        map.put("张三", "张三");// 添加数据
        map.put("李四", "李四");
        System.out.println(map.size());// 2
        System.out.println(map.isEmpty());// false
        System.out.println(map.containsKey("王五"));// false  是否包含某个键
        System.out.println(map.containsValue("赵六"));// false  是否包含某个值
        map.put("张三", "张三01");// 变更内容 ，之前内容被覆盖
        System.out.println(map.remove("李四"));// 李四 根据键删除整个元素
        System.out.println(map);// {张三=张三01}

        // TODO 遍历1
        Set<String> keys = map.keySet();// 获取集合的全部键
        System.out.println(keys);// 张三
        // 遍历全部键
        for (String k : keys){
            //根据键盘获取对应的值
            String value = map.get(k);
            System.out.println(k + "---->" + value);// 张三---->张三01
        }

        // TODO 遍历2（entry）
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---->" + value);// 张三---->张三01
        }

        // TODO 遍历3（Lambda）
        map.forEach((k, v) -> {
            System.out.println(k + "---->" + v);
        });
    }
}