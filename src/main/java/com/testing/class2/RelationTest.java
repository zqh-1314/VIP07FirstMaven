package com.testing.class2;

public class RelationTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean ab = a == b;
//        System.out.println(a == b);
//        System.out.println(a == 3);
        //单引号引起来的叫字符，只有一个字符，不能有多个。
        char c='r';
        //判断字符串时，不要用==判断
        //字符串常量，存在栈内存中，可以理解成一个主仓库，里面的薯片身上贴了sa和sb两个标签。
        String sa="roy";
        String sb="roy";
        //new操作用于实例化java中的类，生成一个新的对象，会在内存中开辟对应的地址。
        //新建一个字符串对象，则开了一个A仓库，里面的薯片贴了一个sc标签。
        String sc=new String("roy");
        System.out.println(sa==sb);
        System.out.println(sa==sc);
        //使用equals比较，比较的是值。
        System.out.println(sa.equals(sb));
        System.out.println(sa.equals(sc));

    }
}
