package string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        // 1.开发一个登录界面
        for(int i = 0; i < 3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入登录名称");
            String loginName = sc.next();
            System.out.println("请输入登录密码");
            String passWord = sc.next();

            // 5.开始调用登录方法，判断是否登录成功
            boolean rs =login(loginName,passWord);
            if (rs == true){
                System.out.println("登录成功");
                break;// 跳出循环，登录完成
            }else{
                System.out.println("登录失败");
            }
        }
    }

    // 2.开发一个登录方法，接收用户的登录名和密码，返回认证的结果
    public static boolean login(String loginName,String passWord){
      // 3.准备一份系统正确的登录名和密码
        String okloginName = "itheima";
        String okpassWord = "123456";

        // 4.开始正式判断用户是否登录成功
        if (okloginName.equals(loginName) && okpassWord.equals(passWord)){
            // 登录成功
            return true;
        }else{
            return false;
        }
    }
}
