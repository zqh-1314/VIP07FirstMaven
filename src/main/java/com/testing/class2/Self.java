package com.testing.class2;

public class Self {
    public static void main(String[] args) {
        //自增 ++  自减--
        int a=3;
        int b=15;
        //a=a+1  a+=1
        //后自增
        a++;
        System.out.println("后自增之后的"+a);
        //前自增
        ++a;
        System.out.println("前自增之后的"+a);
        //后自减和前自减
        b--;
        System.out.println("后自减之后的"+b);
        --b;
        System.out.println("前自减之后的"+b);

    }
}
