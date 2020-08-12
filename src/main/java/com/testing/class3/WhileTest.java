package com.testing.class3;

import java.util.Random;

public class WhileTest {
    public static void main(String[] args) {
        //while（条件）  {循环体}
        // 等价于  for(;条件;){循环体}
        //循环控制变量的赋值和更新操作需要自己写。
        for(int x=0;x<100;x++) {
            Random random = new Random();
            int a = random.nextInt(5);
            System.out.println(a);
        }
        int i=10;
        while(i<10){
            System.out.println("while循环执行");
            System.out.println(i+1);
            i++;
        }

        i=10;
        do{
            System.out.println("do while循环执行");
            System.out.println(i+1);
            i++;
        }while (i<10);

    }
}
