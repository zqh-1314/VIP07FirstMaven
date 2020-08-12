package com.testing.class7;

public class RegexLearn {
    public static void main(String[] args) {
        String java="Java编程";
        String python="python编程";
        //这里的.和*只代表.号这个含义，不代表任意字符。因为不是作为regex使用。
        String dot="..*编程";
        String p="编程";

        //定义一个正则表达式，用于表述 xx编程。
        //.*编程表示只要最后是编程，前面可以是0到n个任意字符。
        String programmingRegex=".*编程";
        //验证一个字符串是否满足指定的正则条件
        System.out.println(java.matches(programmingRegex));
        System.out.println(python.matches(programmingRegex));
        System.out.println(dot.matches(programmingRegex));
        System.out.println(".{4,6}编程的匹配结果：：：");
        //应该是4到6个任意字符在编程前面，也就是4到6个.如何表示。
        String programRegex=".{4,6}编程";
        System.out.println(java.matches(programRegex));
        System.out.println(python.matches(programRegex));
        System.out.println(dot.matches(programRegex));
        //
        System.out.println("验证.*和..*的区别：..*必须要有1个字符，相当于.+");
        String doubleDot="..*编程";
        System.out.println(p.matches(doubleDot));
        System.out.println(p.matches(programmingRegex));

    }
}
