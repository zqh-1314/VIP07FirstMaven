package com.testing.class4;

public class Homework3 {
    public static void main(String[] args) {
        for(int x=2;x<=100;x++){
            //从2到x之间，只有x自己能够整除x的数，就是质数。
            int i=2;
            for(;i<=x/2;i++){
                //每个i都要判断一次
//                if(i==x){
//                    System.out.print(x+" ");
//                }
                if(x%i==0){
                    break;
                }
            }
            //这里的if语句，在每个x只判断一次
            if(i==x/2+1){
                System.out.print(x+" ");
            }
        }

        System.out.println();

        for(int y=2;y<=100;y++){
            //从2到x之中，找能够整除x的数i，找到了就结束循环，然后判断i是否为x
            int k=2;
            //如果找到了y%k==0的k，就结束循环。
            for(;y%k!=0;k++){}
            if(k==y){
                System.out.print(y+" ");
            }
        }

    }
}
