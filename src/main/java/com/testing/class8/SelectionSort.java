package com.testing.class8;

public class SelectionSort {

    public static void main(String[] args) {
        int[] input={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] result=selectionSort(input);
        for(int i:result){
            System.out.print(i+" ");
        }
    }

    public static int[] selectionSort(int[] a){
        //一共a.length-1轮
        for(int lun=0;lun<a.length-1;lun++){
            //假设第lun个数最小，并且记录下来它的位置和值。
            int min=a[lun];
            int mini=lun;
            //从第lun+1个数开始和后面的每个数进行比较。
            for(int index=lun+1;index<=a.length-1;index++){
                //如果当前的数比最小数小。
                if(a[index]<min){
                    min=a[index];
                    mini=index;
                }
            }//循环比较完之后，会找到最小的数和它的位置。也就是 a[mini]
            //交换最小的数的位置和当前第lun个数也就是lun-1下标的数的位置。
            //如果第lun个数不是最小的数，则交换 a[mini]和a[lun-1]
            if(min!=a[lun]){
                //因为a[mini]的值就是min,相当于已经把水倒出来了。
                a[mini] =a[lun];
                a[lun]=min;
            }
        }
        return a;
    }

}
