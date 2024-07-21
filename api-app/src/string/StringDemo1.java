package string;

public class StringDemo1 {
    public static void main(String[] args) {
        // TODO 创建string对象，并封装要处理的字符串的方式
        // 通过 new String 创建字符串对象，并调用构造器来初始化字符串
        String rs1 = new String();
        System.out.println(rs1);// ""

        String rs2 = new String("itheima");
        System.out.println(rs2);// itheima

        char[] chars = {'a','黑','马'};
        String rs3 = new String(chars);
        System.out.println(rs3); // a黑马

        byte[] bytes = {97,98,99};
        String rs4 = new String(bytes);
        System.out.println(rs4); // abc
    }
}
