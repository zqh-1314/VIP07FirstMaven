package com.testing.class9;

public class Rabbit extends Animal {

    public String type="兔子";

    public void drink(){
        System.out.println("兔子喝水突突突");
    }

    public String getOriginType(){
        return  super.type;
    }

}
