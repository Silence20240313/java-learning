package test;

public class Girl {
     //小女孩和猫一起玩
    // Cat Dog Animal 类名也是一种数据类型
    public void play(Cat cat){
        // 调用方法：对象.方法名
        cat.shout();
    }
    // 小女孩和狗一起玩
    public void play(Dog dog){
        // 调用方法：对象.方法名
        dog.shout();
    }
    // 小女孩和动物一起玩
    public void play(Animal animal){
        animal.shout();
    }
}
