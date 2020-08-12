package com.testing.class2;

public class Calc {
    public static void main(String[] args) {
        int a=8;
        int b=3;
        //b+=2的意思就是 b=b+2;
        b/=2;
        System.out.println(b);
        //整数相除，结果是向下取整的
        int c=a/b;
        //取余操作，算完除法取余数
        int d=a%b;
        //先进行整数的除法，得到结果为2，然后才会将2转换为double类型，结果是2.0
        double dd=a/b;
        //先转换其中一个变量为double，那么计算时结果以最高的double为准，计算结果2.6666
        double dd1=(double)a/b;
        //假设要保留两位小数,先乘以100，基于int类型取值的办法向下取整，直接去掉尾数
        //然后除以100d，转换为double类型,就能保留两位小数。
        double di= (int)(dd1*100)/100d;
        System.out.println(di);
        System.out.println(c);
        System.out.println(d);
        System.out.println(dd);
        System.out.println(dd1);
    }
}
