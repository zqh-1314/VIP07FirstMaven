package com.testing.class3;

public class OddTest {
    public static void main(String[] args) {
        //循环的操作：
        //从1数到100，对每个数除以2，看是否有余数。
        //循环范围 1到100， 循环体 是每个数除以2，判断是否有余数
        int i=1;
        while(i<101){
            if(i%2==1){
                System.out.print(i+"\t");
            }
            i++;
        }
    }
}
