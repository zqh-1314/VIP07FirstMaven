package com.testing.class2;

public class LogicTest {
    public static void main(String[] args) {
        int x = 5;
        int a=5,b=15;
        int y = 15;
        int z = 30;
        //表示先给x赋值为10，然后再取x值比较
//        boolean a= (x=10)>10;
        //&&是短路运算，第一个为假，则结果为假,第二个算式不再计算
        //(x = 10) > 10 为假，短路，y=30不执行
//        boolean a = (x = 10) > 10 && (y = 30) > 30;
        //(x = 10) > 8 为真，y=30会执行
//        boolean b = (x = 10) > 8 && (y = 30) > 30;
        //按位与&操作，不管第一个运算数是否为假，第二个运算都会进行。
        boolean c = (x = 10) > 10 &(y = 30) > 30;
//        System.out.println(a);
        System.out.println(x);
        System.out.println(y);

    }
}
