package com.testing.class3;

public class ForTest {
    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            System.out.println(i + 1);
//            int roy = 5;
//        }
        //i是在for循环中定义的局部变量，之后不可使用。
//        System.out.println(i);
//        System.out.println(roy);

        //拆解 for循环
//        1、提取循环控制变量赋值操作。只执行一次
//        int i=0;
//        for(;i<20;i++){
//            System.out.println(i+1);
//        }

        //2、拆解 i++
//        int i = 0;
//        for (; i < 20; ) {
//            System.out.println(i + 1);
//            //由于i++或者++i在这里是单行执行的，所以执行结果不会有任何区别。
////        如果循环控制变量不更新，导致无法满足循环退出条件，则会出现死循环。
//            i++;
////            ++i;
//        }
//        System.out.println("执行完之后i的值是" + i);

        //3、拆解 循环执行条件i<20
        int i = 0;
        //死循环，无条件反复执行
        //在代码中要避免出现死循环
//        for(;;){
//            System.out.println(i);
//        }

        for (; ; ) {
            //执行条件，满足时执行循环体和循环语句更新
            if (i < 20) {
                //执行循环体
                System.out.println(i + 1);
                //执行循环语句更新操作
                i++;
            }
            //不满足条件退出for循环。
            else {
                break;
            }
        }
        System.out.println("for循环执行完了");

    }
}
