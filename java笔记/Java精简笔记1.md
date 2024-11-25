## 1.逻辑运算符
①&&:两个都为真，结果才为真
②||:只要有一个为真，结果就为真
## 2.循环
四个条件：
⭐条件初始化
⭐条件判断
⭐循环体
⭐迭代语句
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/f822ddf5-3844-5969-c58a-a6f57e5e0f3c.png)
## 3.方法
#### ①声明格式
（修饰符可以不写）
[修饰符1   修饰符2]  返回值类型 方法名（形式参数列表）{
Java语句;
}
#### ②调用
所有的方法都只能被main方法所调用
⭐静态方法的调用（static修饰的方法）：类名.方法名（形参列表）;
⭐普通方法的调用：对象.方法名（形参列表）；
#### ③方法的重载
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/47c6fe04-abd4-ed10-22bc-aba0c8b778dd.png)
## 4.数组
写在方法中
#### ①声明与创建
#### ②赋值
#### ③遍历
⭐for循环遍历
⭐增强for循环遍历
for循环可以涉及与索引相关的操作，增强for循环不可以
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/fba1f7af-f872-a1fb-5f4d-8cf306347001.png)
## 5.类的编写
注意事项：
①类名：首字母大写，驼峰命名（包名：小写）
②成员变量：特性 属性（名词）
③成员方法：行为（动词）
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/1b95ce8c-94cc-a4ec-04e4-ea1f28bf7c59.png)
## 6.对象的创建与使用
#### ①创建格式
类名.对象名 = new 类名() ;
#### ②给对象的属性赋值
对象名.属性名 = 值；
#### ③调用对象的方法
对象名.方法名（参数列表）;
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/5ef2eedc-dbe8-c8b9-920c-65d3b4c88911.png)
## 7.构造器
⭐在类中有①成员变量②成员方法③构造器（构造方法）
⭐构造器：是一个创建对象时被自动调用的特殊方法，用于对象的初始化，Java通过new关键字来调用构造器，从而返回该类的实例
#### ①声明格式
[修饰符] 类名 （形参列表）{
// n条语句
}
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/128a945e-749c-4750-15be-f07d43476fe3.png)
#### ②构造器四要点
⭐构造器的方法名必须和类名一致
⭐构造器通过new关键字调用
⭐构造器不能定义返回值类型，不能在构造器里使用return关键字来返回某个值
## 8.封装
设计思想：合理隐藏 合理暴露
封装代码层面的体现：
⭐将属性私有化，被private修饰--加入权限修饰符（一旦加入了权限修饰符，其他人就不可以随意的获取这个属性）
⭐提供public修饰的方法让别人来访问/使用
⭐即使外界可以通过方法来访问属性，但是也不能随意访问，因为程序员可以在方法中加入限制条件
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/fee1ea35-8be0-fbab-61ba-67cfe7f44ec6.png)
## 9.继承
①把子类中共同有的属性抽取出来，放到父类中
②子类可以调用父类的属性和方法
③方法的重写：
⭐当子类对父类提供的方法不满意的时候，要对父类的方法进行重写
⭐子类重写父类的方法，只有执行体不一样，其他必须都一样
## 10.多态
⭐三要素：继承 重写方法 父类引用指向子类对象
⭐概念：完成某个行为时，不同的对象会产生出不同的状态。同一种行为，不同的子类呈现出来的状态是不同的。
⭐多态指的是方法的多态。
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/c73451ac-6b4d-2ad2-24a8-537576904bab.png)
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/afbc13d4-d114-11a2-69b5-25bf5f54a1dd.png)
## 11.异常
#### ①try-catch-finally
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/429f317b-bf97-00df-60c1-d84c0b2f94c0.png)
#### ②throw与throws
区别：
①位置不同：
throw：方法内部
throws：方法声明处
②内容不同：
throw：异常对象
throws：异常的类型
③作用不同：
throw：异常出现的源头，制造异常
throws：在方法的声明处，告诉方法的调用者，这个方法中可能会出现我声明的这些异常，然后调用者对这个异常进行处理，要么自己处理要么再继续向外抛出异常
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/f18a5d65-64fc-a72b-b096-ca0eccd62322.png)
## 12.集合ArrayList
①增：add
②删：remove
③改：set
④查：get
⑤遍历：for循环
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/a86353f4-911b-a428-913d-fe15bb98d7a9.png)
## 13.书城案例
⭐在BOOK类中：
①三个成员变量:书籍的编号/名称/作者
②get/set方法 有参无参构造器
⭐
```java
package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // TODO 把所有的书都放在一个集合里
        ArrayList list = new ArrayList();
        // TODO while (true) 死循环
        while (true) {
            // TODO 菜单
            System.out.println("----欢迎来到[丽丽猫]书城----");
            System.out.println("1.展示书籍");
            System.out.println("2.上架书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            //TODO 借助Scanner类(键盘录入的数据扫描到程序中来)
            Scanner sc = new Scanner(System.in);
            // TODO 给用户提示
            System.out.println("请输入您想要执行操作的序号");
            // TODO 利用键盘录入序号(扫描int类型的数据)
            int choice = sc.nextInt();
            // TODO 根据序号进行后续判断
            if (choice == 1){
                System.out.println("[丽丽猫]书城 --> 1.展示书籍");
                // TODO 对集合进行遍历查看
                for (int i = 0; i < list.size(); i++) {
                   Book b = (Book)(list.get(i));
                    System.out.println(b.getbNo() + "-->" + b.getbName() + "-->" + b.getbAuthor());
                }
            }
            if (choice == 2){
                System.out.println("[丽丽猫]书城 --> 2.上架书籍");
                // TODO 从键盘录入书籍的信息：编号/名称/作者
                System.out.println("请录入书籍的编号:");
                int bNo = sc.nextInt();
                System.out.println("请录入书籍的名称:");
                String bName = sc.next();
                System.out.println("请录入书籍的作者:");
                String bAuthor = sc.next();
                // TODO 创建书籍类对象
                Book b = new Book();
                // TODO 键盘录入的信息与书籍类对象结合到一起
                b.setbNo(bNo);
                b.setbName(bName);
                b.setbAuthor(bAuthor);
                // TODO 在集合中添加书籍
                list.add(b);
            }
            if (choice == 3){
                System.out.println("[丽丽猫]书城 --> 3.下架书籍");
                // TODO 录入要下架的书籍编号
                System.out.println("请录入您要下架的书籍的编号");
                int delNo = sc.nextInt();
                // TODO 下架编号所对应的书籍
                for (int i = 0; i <= list.size()-1 ; i++) {
                    Book b = (Book)(list.get(i));
                    // 如果遍历的书籍编号和录入的要删除的书籍编号一致，那么从集合中移除该书籍即可
                    if (b.getbNo() == delNo){
                        list.remove(b);
                        System.out.println("该书籍下架成功");
                        break;// 如果下架成功，则停止遍历
                    }
                }
            }
            if (choice == 4){
                System.out.println("[丽丽猫]书城 --> 4.退出应用");
                // TODO break：停止正在执行的循环
                break;
            }
        }
    }
}
```















