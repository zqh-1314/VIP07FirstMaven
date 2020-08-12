package com.testing.class7;

public class RegexTest {
    public static void main(String[] args) {
        String s="[1, 2, 5, 3, 4, 6, 9, 7, 8, 0]";
//        s=s.replace("1","x");
//        System.out.println(s);
//        s=s.replace("2","x");
//        System.out.println(s);
//        for(int i=1;i<6;i++){
//            s=s.replace(i+"","x");
//        }
//        System.out.println(s);
        //7 8 9 中的任意一个字符。
        String regex="[7-9]";
        String all=s.replaceAll(regex,"x");
        System.out.println(all);

        String first=s.replaceFirst(regex,"x");
        System.out.println(first);

        //用于通过分割符将字符串切分为数组
        String[] Nos= s.split(",|\\[|\\]");
        for(String No:Nos){
            System.out.println(No);
        }

    }

}
