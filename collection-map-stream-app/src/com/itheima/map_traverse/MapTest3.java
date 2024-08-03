package com.itheima.map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// TODO Map集合的遍历方式3：Lambda
public class MapTest3 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("蜘蛛精",169.8);
        map.put("紫霞",165.8);
        map.put("至尊宝",169.5);
        map.put("牛魔王",183.6);
        System.out.println(map);
        // {蜘蛛精=169.8, 牛魔王=183.6, 至尊宝=169.5, 紫霞=165.8}
        map.forEach((k,v) -> {
            System.out.println(k + "--->" + v);
            // 蜘蛛精--->169.8
            //牛魔王--->183.6
            //至尊宝--->169.5
            //紫霞--->165.8
        });
    }
}
