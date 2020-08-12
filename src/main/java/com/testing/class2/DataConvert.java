package com.testing.class2;

public class DataConvert {
    public static void main(String[] args) {
        int  a= 16 ;
        byte b=9;
        double dd=1.666;
        float  ff=1.5f;
        //低精度赋值给高精度能够自动完成转换。
        int f =b;
        //低精度的int转换为double，可以自动处理
        double da=a;
        //高精度double转低精度int，需要强转。
        int id=(int)dd;
        //精度更高的是int，所以结果是int类型
        int c= a*b;
        byte d =(byte)(a*b);
        //字符串的拼接
        System.out.println("c的结果是"+c+"    d的结果是"+d);
        System.out.println();
        //144的int存储 32位  0000 0000 0000 0000 0000 0000 1001 0000
        //转为byte 只有8位 1001 0000 -》反码 0110 1111 64+32+8+4+2+1=111+1=112
        //添负号  -112



    }
}
