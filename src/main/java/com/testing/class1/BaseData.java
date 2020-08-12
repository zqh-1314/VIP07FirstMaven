package com.testing.class1;

public class BaseData {
    public static void main(String[] args) {
        //声明变量：
        byte a;
        short s;
        int i;
        long l;

        //声明同时赋予初值
        byte fb=1;
        //同时声明多个变量
        int ia,ib;
        //使用的时候赋值。
        ia=1;
        //同时声明并且赋值多个变量。
        int iia=3,iib=4;

        System.out.println(fb);
        System.out.println(iia);


        //浮点数，默认是double类型
        //单精度float，小数点后7~8位
        float fa= 1.66666666666666666666666f;
        //双精度double，小数点后15~17位
        double da=1.666666666666666666666666;
        System.out.println(fa);
        System.out.println(da);
        //布尔数只有两个值， true和false
        boolean ba=true;
        boolean bb=false;

        //字符类型，用''引起单个字符。
        char ca='a';
        char cb='啊';
        //表示一个'的时候，使用\进行转义。
        char cc='\'';

        //字符的存储格式，按一定方式转为整数，就是所谓的编码，
        //java中使用的是unicode编码，格式 /u[4位16进制数],共65535个字符
        // 字符可以转换为数字，就是它的编码数位。
        //UNICODE编码的前128个就是著名的ascii编码
        int ic=(int)cc;
        System.out.println(cc);
        System.out.println(ic);





    }
}
