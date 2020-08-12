package com.testing.class6;

public class ConvertFromString {
    public static void main(String[] args) {
        //将String转换为基本数据类型。
        String is="1234";
        System.out.println(is + 3);
        //Integer可以自动转换成int
        int i=Integer.parseInt(is);
        Integer ii=Integer.parseInt(is);
        System.out.println(i+3);

        String fs="1234.5";
        float f=Float.parseFloat(fs);
        Float ff=Float.parseFloat(fs);
        //类型不匹配的时候，会报异常。
        try {
            int fi=Integer.parseInt(fs);
        } catch (NumberFormatException interror) {
            //输出异常的信息
            interror.printStackTrace();
            //输出转换错误
            System.out.println("转换数字出错啦");
        }finally {
            //如果代码运行过程中出现异常，也没有进行处理的话，代码会停止运行。
            System.out.println(ff);
        }


    }
}
