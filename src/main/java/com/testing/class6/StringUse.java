package com.testing.class6;

public class StringUse {
    public static void main(String[] args) {
        String s="roy";
        //判断字符串是否相等
        try {
            System.out.println(s.equals("roy"));
        } catch (Exception e) {
            System.out.println("不要这么写，容易空指针");
        }
        //建议用下面这种写法
        System.out.println("roys".equals(s));
        //判断字符串是否包含另一个字符串
        System.out.println(s.contains("ro"));
        //length()方法，返回字符串的长度
        System.out.println("字符串的长度是："+s.length());
        //替换字符串中的某些内容
        String res=s.replace("oy","ose");
        s=s.replace("o","eplacement");
        System.out.println("将替换后的值重新赋值给s之后：s的值"+s);
        s=s.replace("e","ok");
        System.out.println("将替换后的值重新赋值给s之后：s的值"+s);
        System.out.println("将替换后的值赋值给另一个字符串res"+res);

        //输出是第几个字符。
        System.out.println(s.indexOf("o"));
        //截取子字符串，从指定位置截到最后
        String sub1=s.substring(3);
        System.out.println(sub1);
        //从指定开始位置截到结束位置,取值，左闭右开。[3,8)
        String  sub2=s.substring(3,8);
        System.out.println(sub2);


        StringBuffer sb=new StringBuffer();
        sb.append("roy");
        sb.append("老师");
        System.out.println(sb);
        String ss=sb.reverse().toString();
        System.out.println(ss);






    }
}
