package com.testing.class4;

public class MultiplicationTable {
    public static void main(String[] args) {
//        for(int row=1;row<=9;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print(row+"×"+col+"="+row*col+"\t");
//            }
//            System.out.println();
//        }

        for(int row=1;row<=9;row++){
            for(int col=1;col<=9;col++){
                if(row==col||row+col==10){
                    System.out.printf("%6s","\t");
                }
                else {
                    System.out.printf("%6s",row + "×" + col + "=" + row * col + "\t");
                }
            }
            System.out.println();
        }


    }
}
