package com.testing.class1;

public class Math {
    public static void main(String[] args) {
        byte ba = 39;
        int a = 4;
        long l = 333444444444l;
        int b = 7;
        float f = 9.5f;
        double d = 18.3;
        char c='a';

        //ba/a+b*f+f*d;
        //四则运算顺序，符合现实顺序。
        //1、ba/a
        System.out.println(ba / a);
        //计算的表达式，结果的类型整数以计算式中存储位数最高的为准。
        long lresult = l / a;
        //()强制转换操作，高于除法操作，先强转ba,然后相除
        //如果要将结果转为byte，则小括号括起来。
        byte resultb = (byte) (ba / a);
        int result1 = ba / a;
        //2、f*d , 浮点数计算表达式的结果类型，以计算式存储位数最高的为准。
        double dres = f * d;
        float result2 = (float) (f * d);
        System.out.println(f * d);
        //3、b*f, b*f，如果同时出现整数和浮点数，以浮点数存储位数最高的为准
        float result3 = b * f;
        System.out.println(b * f);

        float result = result1 + result2 + result3;
        System.out.println(result);

    }
}
