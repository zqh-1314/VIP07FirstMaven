package com.testing.class10;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractC {

    String kind="抽象";

    public void sound(){
        System.out.println("我是一个抽象类中的具体实现方法");
    }

    public abstract void silent();

}
