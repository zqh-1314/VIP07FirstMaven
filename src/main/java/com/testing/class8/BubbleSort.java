package com.testing.class8;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] result=bubbleSort(input);
        for(int i:result){
            System.out.print(i+" ");
        }
    }

    //冒泡排序算法
    public static int[] bubbleSort(int[] a){
        //轮的循环,从第1轮到第14轮。
        for(int lun=1;lun<=a.length-1;lun++){
            //每一轮做什么?
            //下标从0开始到a.length-1 -n 的每个数和它后面的数进行比较
            for(int index=0;index<=a.length-1-lun;index++){
                //如果这个数比后面的数大，则进行交换
                if(a[index]>a[index+1]){
                    //交换
                    //首先找一个临时存放的变量，相当于找第3个杯子来。
                    int tmp=a[index];
                    a[index]=a[index+1];
                    a[index+1]=tmp;
                }
            }
        }
        return a;
    }
}
