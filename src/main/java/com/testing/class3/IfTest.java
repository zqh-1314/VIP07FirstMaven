package com.testing.class3;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        System.out.println("---------单if语句测试开始啦-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值");
        int x = sc.nextInt();
        //如果if(布尔表达式)为真，则执行{语句体},然后继续向后执行
        // 如果(布尔表达式)为假，则继续向后执行
        if (x > 5 && x << 8 - 7 > 20 || !(x++ < 15)) {
            System.out.println("x的值满足条件");
        }
        //相当于else什么都不做
//        else{}
        System.out.println("if语句执行完了");


        System.out.println("-----------if else 测试，请输入x的值----------");
        x = sc.nextInt();
        //if(布尔表达式) 为真 则执行 {语句体}
        //（布尔表达式为假） 则执行  else{语句体}
        //然后继续向下执行
        if (x == 4) {
            System.out.println("打麻将去");
        } else {
            System.out.println("打不成麻将不高兴");
        }
        System.out.println("打麻将的事情过去了");

        //if else if  else if …… else
        // else 不一定有。
        // if 和各个 else if 之中，只要有一个满足了，
        // 那么后面的else if 和 else 都会跳过
        //通常写else if 都会写 和之前条件互斥的
        System.out.println("----if else if …… else 的测试开始啦-------");
        x = sc.nextInt();
        if (x > 9) {
            System.out.println("踢足球去");
        } else if (x <= 9 && x > 4) {
            System.out.println("团建去");
        } else if (x <= 4 && x > 0) {
            System.out.println("打篮球去");
            //声明一个局部变量
//            int roy=5;
        } else {
            System.out.println("人数不能是负数，自由活动吧");
        }
        System.out.println("多人运动结束了");
        //局部变量不能在if else语句外部使用。
//        System.out.println(roy);


        //嵌套 if else
        //先进行外层条件判断，然后再进内层条件判断。
        System.out.println("-----------嵌套if else测试，请输入x的值----------");
        x = sc.nextInt();
        if (x > 9) {
            if(x>11){
                System.out.println("太多人了，多人运动");
            }
            else{
                System.out.println("这些人看电影去吧");
            }
        }
        //x<=9时
        else {
            if(x>4){
                System.out.println("江郎才尽");
            }
            else if (x<=4 && x>2){
                System.out.println("打牌");
            }
            else{
                System.out.println("自己打游戏，单身狗");
            }
        }
    }

}
