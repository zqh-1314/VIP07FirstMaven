package com.testing.class9;

public class Animal extends Thing{
    //变量
    public int eyes=2;
    public int nose=1;
    public String type="动物";

    //方法
    public Animal(){
        super("会动");
        System.out.println("动物出生了");
    }

    public int getEyes(){
        return eyes;
    }

    public void drink(){
        System.out.println("动物都会喝水");
    }

    public void run(){
        System.out.println("猫走路轻飘飘的，大晚上蹦迪");
    }
}
