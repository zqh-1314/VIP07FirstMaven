package com.testing.class3;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //运算优先级 &&高于 ||
        //实际运算顺序：
         //||的左边是true
        // 由于&&高于||运算，所以右边的算式，||的第二个操作数，不是false  而是 (false && false)
        //只有两个操作数，因此结果为true
        //短路原则高于一切优先级
//        System.out.println(true || false && false);
        //  true||false =true  然后 true&&false =false;
        //最后结果是false
//        System.out.println((true || false) && false);
    //创建一个监控对象，用于监控控制台输入。
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入测试的x值：");
        //获取输入的下个整数值，赋值给x
        int x = sc.nextInt();
        System.out.println("x=" + x + "时：");
        boolean result = x > 5 && x << 8 - 7 > 20 || !(x++ < 15);
        System.out.print("x的值是" + x);
        System.out.println("\t运算结果是" + result);
        System.out.println("----------------先或再与");
        System.out.println("请输入测试的x值：");
        x = sc.nextInt();
        System.out.println("x=" + x + "时：");
        boolean result1 = x > 5 || x << 8 - 7 > 20 && !(x++ < 15);
        System.out.print("x的值是" + x);
        System.out.println("\t运算结果是" + result1);
        System.out.println("----------------调整顺序");
         x = sc.nextInt();
        System.out.println("x=" + x + "时：");
        boolean result2 = x < 5 || !(x++ < 15) && x << 8 - 7 > 20;
        System.out.print("x的值是" + x);
        System.out.println("\t运算结果是" + result2);

    }
}
