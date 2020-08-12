package com.testing.class9;

public class AnimalTest {
    public static void main(String[] args) {
//        Cat happy=new Cat();
////        System.out.println("happy的眼睛数是"+happy.getEyes());
//        happy.drink();
//        happy.run();
//        System.out.println(happy.type);
//        System.out.println(happy.getOriginType());
//        happy.play();
        //调用继承自animal的run方法。
//        happy.run();
        //调用cat定义的新run方法
//        happy.run(10);
        System.out.println("=====================兔子==============================");
        Rabbit bunny=new Rabbit();
        bunny.drink();
        System.out.println(bunny.type);
        System.out.println(bunny.getOriginType());
        bunny.run();
    }

}
