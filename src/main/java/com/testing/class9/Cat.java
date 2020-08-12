package com.testing.class9;

public class Cat extends Animal{
    //扩展的变量
    public int claws=4;

    public String voice="喵";

    public String type="猫";


    public Cat(){
        System.out.println("一只小奶猫睁开了眼");
    }


    //扩展方法
    public void play(){
        System.out.println("猫会玩毛线球");
    }

    public void drink(){
        System.out.println("猫咪不爱喝水");
        System.out.println("喝完再用动物的方式来喝一次");
        super.drink();
    }

    //返回类型不同，方法名、参数列表相同，不形成重写，会报错
//    public String run(){
//        return "";
//    }

    public void run(int speed){
        System.out.println("猫咪跑的速度是"+speed);
    }

    public String getOriginType(){
        return  super.type;
    }


}
