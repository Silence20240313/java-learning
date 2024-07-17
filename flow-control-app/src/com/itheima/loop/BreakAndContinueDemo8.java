package com.itheima.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        // TODO 掌握Break和Continue的作用
        // Break：跳出并结束当前所在循环的执行
        // 说5句我爱你，说完第三句，别说了
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("我爱你:"+ i);
            if (i==3){
                //已经说完了第三句了
                break;//跳出并结束当前所在循环的执行
            }
        }

        //Continue:跳出当前循环的当次执行，直接进入循环的下一次执行
        //洗碗5天，第三天不用洗，但之后还是要洗
        for (int i = 1; i <= 5 ; i++) {
            if (i == 3){
               // 第三天不用洗
                continue;
            }
            System.out.println("洗碗:"+ i);
        }
    }
}
