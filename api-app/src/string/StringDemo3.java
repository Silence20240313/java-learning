package string;

public class StringDemo3 {
    public static void main(String[] args) {
        // TODO string使用时的注意事项
        // 1.string的对象是不可变的
        String name = "黑马";
        name += "程序员";// name = name + 程序员
        name += "波妞";
        System.out.println(name);// 黑马程序员波妞

        // 2.只要是以双引号给出的字符串对象，存储在常量池中，而且内容相同时，只会存储一份
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);// true

        // 3.new string 创建字符串对象，每次new出来的都是一个新对象，会放在堆内存中
        char[] chars = {'a','b','c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2);// false
    }
}
