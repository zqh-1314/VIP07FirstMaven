package com.testing.class10.accessTest;

import com.testing.class10.Tester;

public class SonOfTester extends Tester {
    //不能继承父类的default权限方法，这里相当于新写了一个方法。
    void defaultWork(){
        System.out.println("测试的儿子尝试去重写测试的默认方法");
        System.out.println("不同包中的子类不能继承default方法。");
    }

    public void caseModule(){
        System.out.println("roy遗留给儿子的测试用例模板");
    }



    public static void main(String[] args) {
        Tester roy=new Tester();
        SonOfTester royson=new SonOfTester();
        royson.defaultWork();
        //不同包中，子类中的子类对象是可以使用protected方法的。
        royson.manSpirit();
        //静态的protected方法，在子类中可以使用。
        roy.manSpirit();
        Tester.manSpirit();
    }
}
