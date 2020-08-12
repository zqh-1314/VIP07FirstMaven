package com.testing.class2;

public class BitMath {
    public static void main(String[] args) {
        byte a=33;
        byte b=98;
//        System.out.println((char)a);
//        System.out.println((char)b);
//        System.out.println((char)(a&b));
//        System.out.println((char)(a|b));
//        byte e=(byte)(a^b);
//        //异或的特征： e=a^b  则  e^a=b  e^b=a
//        System.out.println(a^b);
//        System.out.println(e^a);
//        System.out.println(e^b);
        //左右位移
        System.out.println(a<<1);
        System.out.println(a<<26);
        System.out.println((byte)(a<<2));
        //位运算低于四则运算。下式相当于a>>5
        System.out.println(a>>2+3);


    }

}
