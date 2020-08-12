package com.testing.class2;

public class MultiSelf {
    public static void main(String[] args) {
        int x=1;
        //1、 x=1
        //2、   ++x  x变成2  算式取值第一个x 为 2
        //3、   x=2   ++x  x变成3  算是取第二个 x 为3
        //4、   x=3   ++x  x=4   算式取第三个x  为4
        int z = ++x + ++x + ++x;
        //  9     2     3     4
        System.out.println("z的值"+z);
        System.out.println("x:"+x);

        //1、x=4
        //2、  算式取值 4 然后x自增  x 变成 5
        //3、   算是取值 5  然后x++  x变成6
        //4、   算式取值6   然后 x++  x变成7
        int y = x++ + x++ + x++;
        //       4    5    6
        System.out.println("y的值"+y);
        System.out.println("x:"+x);




    }
}
