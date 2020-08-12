package com.testing.class5;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        //二维数组
        //第一个下标是行数，第二个下标是列数。
        //第一个下标表示二维数组中一维数组的个数
        //第二个下标表示每个一维数组中元素的个数。
        int[][] doublei=new int[9][9];
        //二维数组的长度是3,3个一维数组。
        for(int i=0;i<doublei.length;i++){
            //取二维数组的第i+1个数组
            int[] a= doublei[i];
            //对于每个一维数组中的每个元素，赋值。
            for(int j=0;j<a.length;j++){
                doublei[i][j]=(i+1)*(j+1);
            }
        }


        //输出
        //输出第3行第6列的内容
        System.out.println(doublei[2][5]);
        //二维数组中存放的内容，其实是一维数组
        for(int[] a:doublei ){
            System.out.println(a);
            for(int i:a){
                System.out.print( i+" ");
            }
        }

    }
}
