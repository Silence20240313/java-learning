package com.itheima.collection_set;

public class SetTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("蜘蛛精",25,169.5);
        Student s2 = new Student("紫霞",22,166.5);
        System.out.println(s1.hashCode());// 990368553
        System.out.println(s1.hashCode());// 990368553
        System.out.println(s2.hashCode());// 1096979270

        String str1 = new String("abc");
        String str2 = new String("acD");
        System.out.println(str1.hashCode());// 96354
        System.out.println(str2.hashCode());// 96354
    }
}
