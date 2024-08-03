package com.itheima.map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// TODO Map集合的遍历方式1：键值对
public class MapTest2 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("蜘蛛精",169.8);
        map.put("紫霞",165.8);
        map.put("至尊宝",169.5);
        map.put("牛魔王",183.6);
        System.out.println(map);
        // {蜘蛛精=169.8, 牛魔王=183.6, 至尊宝=169.5, 紫霞=165.8}
        // entries = [{蜘蛛精=169.8},{牛魔王=183.6},{至尊宝=169.5},{紫霞=165.8}]

        // 1.调用Map集合提供的entrySet方法，把Map集合转换成键值对类型的Set集合
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "--->" + value);
            // 蜘蛛精--->169.8
            //牛魔王--->183.6
            //至尊宝--->169.5
            //紫霞--->165.8
        }
    }
}
