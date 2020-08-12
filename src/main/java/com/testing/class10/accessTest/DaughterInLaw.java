package com.testing.class10.accessTest;

import com.testing.class10.Tester;

public class DaughterInLaw {
    //这个类是儿媳妇
    public static void main(String[] args) {
        SonOfTester royson=new SonOfTester();
        //在儿媳妇面前没有任何男子气概。
        // protected 修饰的方法，在不同包中时：只能在不同包的子类中被使用，子类的对象不能使用。
//        royson.manSpirit();
        Tester roy=new Tester();
        //父类对象也不能用protected。
//        roy.manSpirit();

    }
}
