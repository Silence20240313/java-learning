package com.itheima.collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

// TODO Collection集合的遍历方式一：jdk8开始新增的Lambda表达式
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c);
        //  [赵敏, 小昭, 素素, 灭绝]
        //   s

        // 集合Lambda表达式遍历集合
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
                // 赵敏
                // 小昭
                // 素素
                // 灭绝
            }
        });
        c.forEach((String s) -> {
                System.out.println(s);
        });
        c.forEach(s -> {
            System.out.println(s);
        });
        c.forEach(s ->  System.out.println(s));

        c.forEach(System.out::println);
    }
}
