package com.itheima.interfac_attention;

public class Test2 {
    public static void main(String[] args) {
        // TODO 使用接口的注意事项
        Zi zi = new Zi();
        zi.run();
    }
}
// 1.
interface I{
    void test1();
      }
interface J{
    String test1();
}
//interface K extends I,J{
//
//}


// 2.
//class E implements I,J{
//
//}


// 3.
class FU{
    public void run(){
        System.out.println("-----------父类的run方法");
    }
}
interface IT {
    default void run() {
        System.out.println("-----------接口IT中的run方法");
    }
}
class Zi extends FU implements IT{

}

// 4.
interface It1{
  default void test(){
      System.out.println("IT1");
  }
}
interface IT2{
    default void test(){
        System.out.println("IT2");
    }
}

class N implements It1,IT2{

    @Override
    public void test() {
        System.out.println("自己的");
    }
}
