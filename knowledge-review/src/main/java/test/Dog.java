package test;

public class Dog extends Animal {
    // TODO 狗狗的行为1 狗叫(重写父类方法)
    public void shout(){
        System.out.println("狗-汪汪叫");
    }
    // TODO 狗狗的行为2 看家护院（子类自己的方法）
    public void guard(){
        System.out.println("狗-忠诚的动物");
    }
}
