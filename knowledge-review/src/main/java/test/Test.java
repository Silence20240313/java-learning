package test;

public class Test {
    public static void main(String[] args) {
        //创建小女孩对象
        Girl g = new Girl();

        //创建猫咪对象
        Cat c = new Cat();
        // 女孩和小猫玩
        g.play(c);// 猫咪-喵喵叫

        //创建狗对象
        Dog d = new Dog();
        // 女孩和小狗玩
        g.play(d);// 狗-汪汪叫

        // TODO 小女孩和动物玩
        Animal a = new Cat();// 多态
        g.play(a);// 猫咪-喵喵叫
        Animal b = new Dog();
        g.play(b);// 狗-汪汪叫

        // Animal a = new Cat(); 父类指向子类对象


    }
}
