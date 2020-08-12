package com.testing.class3;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("欢迎来到will老师的恋爱历险记：");
        Scanner sc = new Scanner(System.in);
        //好感度
        int exp = 50;
        //钱
        int money = 50000;
        while (money > 500) {
            //接收输入的字符串
            System.out.println("请输入要送的礼物");
            String gift = sc.nextLine();
            //break表示 满足在了某个条件之后,跳出switch语句，结束switch操作
            //加了break之后，类似于else if的机制，满足一个，后面的就不执行了
            //如果不加break，执行完一个case会继续执行下一个case，直到遇到break退出，
            // 或者所有的switch中得条件全部执行完。
            switch (gift) {
                case "口红":
                    System.out.println("will老师给你送了一支小羊皮,dior 999");
                    exp += 10;
                    money -= 500;
                    break;
                case "包":
                case "钱包":
                    int i = 0;
                    //如果i>=30，结束循环
                    while (i < 30) {
                        System.out.println("will老师送了一个lv");
                        exp += 30;
                        money -= 1000;
                        i++;
                        //如果好感度大于500，也可以结束循环。
                        if (exp >= 500) {
                            //用于退出while循环
                            break;
                        }
                    }
                    //用于退出switch
                    break;
                case "房子":
                    //用do while 不管条件如何，先执行一次。
                    int x = 0;
                    do {
                        System.out.println("do while被执行了");
                        if (exp >= 150) {
                            break;
                        }
                        System.out.println("will送了个房子");
                        exp += 100;
                        money -= 30000;
                        x++;
                    } while (x < 100);
                    break;
                case "娃娃":
                    System.out.println("will送了个娃娃");
                    exp -= 15;
                    break;
                //其它情况下
                default:
                    System.out.println("will送了个迷之礼物");
                    exp -= 20;
                    break;
            }
            System.out.println("现在好感度是" + exp);
            if (exp >= 100 || exp < 0) {
                System.out.println("恭喜will成功抱得美人归");
                break;
            } else if (exp < 0) {
                System.out.println("活该你是条单身狗");
                break;
            }
        }
    }
}
