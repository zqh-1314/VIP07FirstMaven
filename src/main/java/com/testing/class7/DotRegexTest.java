package com.testing.class7;

public class DotRegexTest {
    public static void main(String[] args) {
        String dot="....编程";
        String java="java编程";
        String python="python编程";
        String jjj="jjjj编程";

        //由于[]中不能出现()，如果要表示多个词组的可能性的时候，就用|
        String regex="(java|python)编程";
        System.out.println(java.matches(regex));
        System.out.println(python.matches(regex));


//        String regex="\\.{4}编程";
//
//        System.out.println(dot.matches(regex));
//        System.out.println(java.matches(regex));


    }
}
