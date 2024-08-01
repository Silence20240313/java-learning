package com.itheima.collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

// TODO Collection集合的遍历方式二：增强for
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c);
        // c =  [赵敏, 小昭, 素素, 灭绝]
        //        ele

        // 使用增强for遍历集合或者数组
        for (String ele : c) {
            System.out.println(ele);
        }
            // 赵敏
            // 小昭
            // 素素
            // 灭绝

        String[] names = {"迪丽热巴","古力娜扎","七七八八"};
        for (String name:names){
            System.out.println(name);
            // 迪丽热巴
            // 古力娜扎
            // 七七八八
        }
    }
}
