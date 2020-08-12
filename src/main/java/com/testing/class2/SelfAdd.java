package com.testing.class2;

public class SelfAdd {
    public static void main(String[] args) {
        //自增 ++  自减--
        int a=3;
        int b=15;
        //a=a+1  a+=1
        //后自增
        //后自增先取值使用，然后自增，因此sout取值的时候是3
        System.out.println("后自增过程中的"+ a++);
        //然后完成自增，a变成4
        System.out.println("后自增之后的"+ a);
        //前自增
        //前自增先自增，然后取值，因此sout取值之前，先完成自增 b=16,然后取值16
        System.out.println("前自增过程中的"+ ++b);
        //然后完成自增，a变成4
        System.out.println("前自增之后的"+ b);

    }
}
