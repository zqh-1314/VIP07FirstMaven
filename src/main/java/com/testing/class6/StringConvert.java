package com.testing.class6;

import com.testing.class5.Dog;

public class StringConvert {
    public static void main(String[] args) {
        int a=34;
        System.out.println("a的值是"+a);
        Integer i=34;

        //基本数据类型转换为String
        //1、直接+一个字符串完成拼接转换
        String as=a+"";
        //2、通过String类的静态方法valueOf进行转换。
        String sa=String.valueOf(a);
        //判断类型的运算符，判断某个对象是否是instanceof后面的类的对象。
        boolean b= as instanceof String;


        //类类型转为String
        Dog xiaobai=new Dog();
        //直接调用类对象的toString方法转换为String
        String dogstr=xiaobai.toString();
        System.out.println(dogstr);
        //直接输出一个类类型对象的时候，默认就是调用toString方法之后，再输出。
        String dogstr2=xiaobai+"";
        System.out.println(xiaobai);

        //基本数据类型不是一个类的对象，没有变量和方法
//        a.toString();
        //整型int的包装类Integer是有变量和方法的。
        i.toString();



    }

}
