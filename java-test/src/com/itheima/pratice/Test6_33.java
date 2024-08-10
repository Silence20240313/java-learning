package com.itheima.pratice;

import org.junit.Test;

public class Test6_33 {
    @Test
    public void demo6(){
       // TODO 定义字符串
        String str = "巴拉巴拉小魔仙";
        String str2 = "巴拉巴拉小魔仙2";
        String str3 = "";// 空字符
        String str4 = null;// 空值
        String str5 = "迪丽热巴扎德巴雷";
        // TODO 调用方法
        // TODO 方法一
        System.out.println(getLength(str));
        System.out.println(getLength(str3));
        System.out.println(getLength(str4));
        // TODO 方法二
        System.out.println(isSame(str, str2));
        System.out.println(isSame(str4, str3));
        // TODO 方法三
        System.out.println(cutString(str));
        System.out.println(cutString(str4));
        // TODO 方法四
        System.out.println(replaceString(str4));
        System.out.println(replaceString(str5));
        // TODO 方法五
        System.out.println(containsString(str4));
        System.out.println(containsString(str5));
        // TODO 方法六
        System.out.println(startsWithString(str4));
        System.out.println(startsWithString(str2));
        System.out.println(startsWithString(str5));
    }


    // TODO 方法一：返回字符串长度
    public int getLength(String s){
        if (s == null){
            return 0;
        }
        return s.length();
    }

    // TODO 方法二：判断内容是否相等
    public boolean isSame(String s1, String s2){
        if (s1 != null && s1.equals(s2)){
            return true;
        }
        return false;
    }

    // TODO 方法三：接收一个string参数，返回前三位内容，如果不足三位 返回空字符串
    public String cutString(String s){
        if ( s == null || s.length() < 3){
            return "";
        }
        return s.substring(0,3);
    }

    // TODO 方法四：接受一个String参数，所有带“巴”的汉字换为“*”号并返回。若为null，返回空字符串
    public String replaceString(String s){
        if (s == null){
            return "";
        }
        return s.replace("巴","*");
    }

    // TODO 方法五：字符串中包含“巴”返回true，反之false
    public boolean containsString(String s){
        if (s != null && s.contains("巴")){
            return true;
        }
        return false;
    }

    // TODO 方法六：以“巴”开头返回true，反之false（null）
    public boolean startsWithString(String s){
        if (s != null && s.startsWith("巴")){
            return true;
        }
        return false;
    }
}
