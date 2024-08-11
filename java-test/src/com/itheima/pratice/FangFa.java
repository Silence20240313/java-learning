package com.itheima.pratice;

import org.junit.Test;

import java.util.Arrays;

public class FangFa {
    @Test
    public void demo4(){
        // TODO 调用方法测试
        // TODO 方法一：运用if分支判断
        System.out.println(calcute('+', 10, 5));
        System.out.println(calcute('-', 10, 5));
        // TODO 方法一：运用switch判断
        System.out.println(calcute2('*', 10, 5));
        System.out.println(calcute2('/', 10, 5));
        // TODO 方法二
        System.out.println(judgeScore(100));
        System.out.println(judgeScore(-6));
        // TODO 方法三
        System.out.println(judge('a'));
        System.out.println(judge('中'));
        for (char i = 'a'; i < 'z'; i++) {
            System.out.println(judge(i));
        }
        // TODO 方法四
        System.out.println(Arrays.toString(length(5)));// Arrays.toString 打印数组内容 不加的话 打出来是地址
        System.out.println(Arrays.toString(length(3)));
        // TODO 方法五
        System.out.println(Arrays.toString(length1(5)));
        // TODO 方法六
        int[] arr = {2,5,9,6};
        System.out.println(Arrays.toString(judgeArr(arr)));
    }


    // TODO 方法一：定义一个char类型的变量，两个int类型变量
    //      char是 + - * / %  那两个int变量就进行相应的操作  都不满足则输出-1
    //      ①运用if分支判断
    //  方法格式：修饰符 返回值类型 方法名 (形参){方法体}
    //  （有返回值类型就有return）
    private int calcute(char operator,int number1,int number2) {
        if (operator == '+') {
            return number1 + number2;
        } else if (operator == '-') {
            return number1 - number2;
        } else if (operator == '*') {
            return number1 * number2;
        } else if (operator == '/') {
            return number1 / number2;
        } else if (operator == '%') {
            return number1 % number2;
        }
        return -1;// 以上条件均不满足
    }

    // TODO ②运用switch判断
    //   case后面是冒号：
    private int calcute2(char operator,int number1,int number2){
        int result = 0;
        switch (operator){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
            default:
                result = -1;// 以上条件均不满足
        }
        return result;
    }

    // TODO 方法二：判断分数，输出相应评价
    //  0-60：不合格    60-79：合格良好     80-100：优秀   负的，超过100：不合法
    private String judgeScore(double score){
        if (score >= 0 && score < 60){
            return "不合格";
            // 使用return,而不是sout
        } else if (score >= 60 && score <= 79) {
            return "良好";
        } else if (score >= 80 && score <= 100) {
            return "优秀";
        }
        return "不合法";// 以上条件均不满足
    }

    // TODO 方法三：判断输入的字符是否在a-z之间，若在返回true，反之false
    //  注意：字符单引号''
    private boolean judge(char ch){
        if (ch >= 'a' && ch <= 'z'){
            return true;
        }
        return false;
    }

    // TODO 方法四： 返回int类型数组，长度为形参的n,值是1-n
    private int[] length(int n){
        // 定义一个长度为n的数组（动态）
        int[] arr = new int[n];
        // 遍历这个新数组
        for (int i = 0; i < arr.length; i++) {
            // 索引为0处的位置数值是1，为1处的位置数值是2  位置处的数值=索引+1
            arr[i] = i + 1;
        }
        return arr;
    }

    // TODO 方法五： 返回String类型数组  索引偶数输出孙悟空  索引奇数输出猪八戒
    private String[] length1(int n){
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                // i是索引
                arr[i] = "孙悟空";
            } else {
                arr[i] = "猪八戒";
            }
        }
        return arr;
    }

    // TODO 方法六：接收int类型数组，返回string类型数组 。若int数组里的数为奇数，则返回string数组为“奇数”，反之为“偶数”
    private String[] judgeArr(int[] arr){
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                // arr[i]是数组里的值
                result[i] = "偶数";
            } else {
                result[i] = "奇数";
            }
        }
        return result;
    }
}
