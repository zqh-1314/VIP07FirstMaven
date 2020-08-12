package com.testing.class6;

import javax.sound.midi.Soundbank;

public class MainArgsTest {
    public static void main(String[] args) {
        try {
            String param1=args[0];
            String param2=args[1];
//            try {
                Integer i1=Integer.parseInt(param1);
                Integer i2=Integer.parseInt(param2);
                if(i1<i2){
                    System.out.println("参数1比参数2小");
                }
                else if (i1==i2){
                    System.out.println("两个参数相等");
                }
                else{
                    System.out.println("参数1比参数2大");
                }

//            } catch (NumberFormatException e) {
//                System.out.println("输入的不是数字");
//            }
            System.out.println(param1);
            System.out.println(param2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("请输入两个参数！");
        }

    }
}
