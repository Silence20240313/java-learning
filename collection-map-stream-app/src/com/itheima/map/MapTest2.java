package com.itheima.map;

import java.util.*;

// TODO Map集合的特点
public class MapTest2 {
    public static void main(String[] args) {
        // 1.添加元素：无序 不重复 无索引
        Map<String,Integer> map = new HashMap<>();
        map.put("手表",100);
        map.put("手表",220);
        map.put("手机",2);
        map.put("JAVA",2);
        map.put(null,null);
        System.out.println(map);// {JAVA=2, null=null, 手表=220, 手机=2}

        // 2.获取集合的大小
        System.out.println(map.size());// 4

        // 3.清空集合
//        map.clear();
//        System.out.println(map);

        // 4.判断集合是否为空，为空返回true，反之
        System.out.println(map.isEmpty());

        // 5.根据键获取对应值
        int v1 = map.get("手表");
        System.out.println(v1);// 220

        // 6.根据键删除整个元素（删除键会返回键的值）
        System.out.println(map.remove("手表"));// 220
        System.out.println(map);// {JAVA=2, null=null, 手机=2}

        // 7.判断是否包含某个键，包含返回true，反之
        System.out.println(map.containsKey("手表"));// false
        System.out.println(map.containsKey("手机"));// true

        // 8.判断是否包含某个值
        System.out.println(map.containsValue(2));// true

        // 9.获取Map集合的全部键
        Set<String> keys = map.keySet();
        System.out.println(keys);// [JAVA, null, 手机]

        // 10.获取Map集合的全部值
        Collection<Integer> values = map.values();
        System.out.println(values);// [2, null, 2]

        // 11.把其他Map集合的数据倒入到自己集合中来（拓展）
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("java1",10);
        map1.put("java2",20);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("java3",10);
        map2.put("java2",222);
        map1.putAll(map2);// putAll:把map2集合中的元素全部倒入一份到map1集合中去
        System.out.println(map1);// {java3=10, java2=222, java1=10}
        System.out.println(map2);// {java3=10, java2=222}
    }
}
