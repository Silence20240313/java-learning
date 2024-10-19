package test;

public class Cat extends Animal{
    // TODO 猫咪的行为1 猫咪叫(重写父类方法)
    public void shout(){
        System.out.println("猫咪-喵喵叫");
    }
    // TODO 猫咪的行为2 猫咪挠人（子类自己的方法）
    public void scratch(){
        System.out.println("猫咪-调皮挠人");
    }
}
