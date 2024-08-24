package com.itheima.pratice;

import org.junit.Test;

import java.util.*;

public class KuangJia2 {
    @Test
    public void demo12() {
        // TODO Map:键值对
        //   HashMap：无序 不重复 无索引
        Map<String, String> map = new HashMap<>();
        map.put("张三", "张三");// put:添加数据
        map.put("李四", "李四");
        System.out.println(map.size());// 2
        System.out.println(map.isEmpty());// false
        System.out.println(map.containsKey("王五"));// false  是否包含某个键
        System.out.println(map.containsValue("赵六"));// false  是否包含某个值
        map.put("张三", "张三01");// 变更内容 ，之前内容被覆盖
        System.out.println(map.remove("李四"));// 李四 根据键删除整个元素
        System.out.println(map);// {张三=张三01}

        // TODO 遍历1
        Set<String> keys = map.keySet();// 获取集合的全部键 keySet
        System.out.println(keys);// 张三
        // 遍历全部键
        for (String k : keys){
            //根据键获取对应的值
            String value = map.get(k);
            // get:在 Map 中根据键获取对应的值
            System.out.println(k + "---->" + value);// 张三---->张三01
        }

        // TODO 遍历2（entry）
        Set<Map.Entry<String,String>> entries = map.entrySet();
        // entrySet：返回整体的键值对对象到Set（entries）中，   Map.Entry：固定格式
        // <String,String>：和集合的类型一样
        for (Map.Entry<String,String> entry : entries){
            // 加强for循环   Map.Entry<String,String>：类型  entries：集合名字
            //  entry：自己起的一个名字
            String key = entry.getKey();// 取到键
            String value = entry.getValue();// 取到值
            System.out.println(key + "---->" + value);// 张三---->张三01 键+值 输出
        }

        // TODO 遍历3（Lambda）
        map.forEach((k, v) -> {
            System.out.println(k + "---->" + v);
        });
    }
}