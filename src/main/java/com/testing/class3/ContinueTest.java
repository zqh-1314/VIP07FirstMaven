package com.testing.class3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ContinueTest {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            if(i==5){
                //跳过一次循环，结束循环体的本次执行，跳到循环控制语句更新。
                continue;
            }
            System.out.println(i+1);
        }

        for(int i=0;i<20;i++){
            if(i!=5){
                System.out.println(i+1);
            }
        }

    }
}
