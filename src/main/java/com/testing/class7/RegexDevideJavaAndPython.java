package com.testing.class7;

public class RegexDevideJavaAndPython {
    public static void main(String[] args) {
        String java="Java编程";
        String jtest="JJJJ编程";
        String python="python编程";
        String C="c编程";
        //必须是Java python中出现的字符，后面带上编程两个字
        //表示Javpythonc 中的任意一个字符出现*次
//        String regex="[Javpythonc]{4}编程";
//        //[]括起来的表示一个字符它的可能性是[]里列出来的各个字符。
//        System.out.println(java.matches(regex));
//        System.out.println(jtest.matches(regex));
//        System.out.println(python.matches(regex));
//        System.out.println(C.matches(regex));
        //表示java作为一个要素，需要出现4次，也就是JavaJavaJavaJava
        String javaRegex="(Java){4}编程";
        String quadraJava="JavaJavaJavaJava编程";
        System.out.println(java.matches(javaRegex));
        System.out.println(jtest.matches(javaRegex));
        System.out.println(quadraJava.matches(javaRegex));

    }
}
