package com.testing.class3;

public class NineTest {
    public static void main(String[] args) {
        //九九乘法表：
        //1、循环写9行 每一行的第2个乘数是 当前行数 ，写完之后做个换行
        int column=1;
        while (column<=9){
            //2、每一行要循环写9个格子  每个格子的第一个数 是当前格子数。
            int row=1;
            while (row<=9) {
                System.out.print(row+"×"+column+"="+row*column+"\t");
                row++;
            }
            //换个行
            System.out.println();
            //更新循环控制变量
            column++;
        }



    }
}
