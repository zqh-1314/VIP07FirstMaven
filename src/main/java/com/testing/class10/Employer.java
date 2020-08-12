package com.testing.class10;

public interface Employer {
    //接口中只允许有static final修饰的常量，所以通常变量名直接大写。static final都是可以省略的。
    public String TYPE="苦逼的上班族";
    //接口中，只允许存在抽象方法。
    //并且必须是public类型，因为接口需要被其他类实现。所以接口是默认加上public abstract修饰的。
    public void work();
    //方法的定义同样的可以自由指定，返回类型、方法名、参数列表。
    public String moyu(int time);

//    //很少用
    //可以有默认定义的方法，由default来修饰
    public default void jiaban(){
        System.out.println("社畜一般都是996");
    }

    //java1.8及之后，接口中可以有静态方法，需要方法体。
    public static void drink(){
        System.out.println("社畜也需要喝水");
    }



}
