package com.itheima.interface2;

public class Test {
    public static void main(String[] args) {
        // TODO 使用接口的好处
        Driver s = new A();
        s.drive();

        Driver d = new B();
        d.drive();
    }
}
class B implements Driver{

    @Override
    public void drive() {

    }
}

class A extends Student implements Driver,Singer{

    @Override
    public void drive() {

    }

    @Override
    public void sing() {

    }
}
class Student{

}

interface Driver{
  void drive();
}
interface Singer{
  void sing();
}