package com.testing.class2;

public class Homework {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        //    x=1  x=2   x=3  y=2   y=1  y=0
        //      3*1     3*2     2*2       0/2
        int z = 3*x++ + ++x*2 + y--*2 + --y/2;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
    }
}
