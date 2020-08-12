package com.testing.class11;

public class LoginTest {
    public static void main(String[] args) {
        LoginSample ls=new LoginSample();
        //路径1，登录成功
        ls.login("Roy","123456");
        System.out.println("测试结果"+ls.getMsg());
        //2、用户名为空
        //空字符串，和空格是两个事情，和null也是两个事情。
        //空格是有字符的字符串，长度为1，null是没有内存分配的，空字符串有内存，长度为0
        ls.login(null,"123456");
        ls.login("","123456");

        //3、密码为空
        ls.login("Roy",null);
        ls.login("Roy","");

        //4、用户名长度 不是[3,16]
        //输入3个空格
        System.out.println("--------------------------------用户名长度验证");
        ls.login("   ","123456");
        ls.login("","123456");
        ls.login("ro","123456");
        ls.login("royy","123456");

        //5、密码长度不是[3,16]
        ls.login("Roy","123456789123456789");
        ls.login("Roy","12");
        ls.login("Roy","1");

        //6、用户名密码不正确。
        ls.login("royy","123456");

    }
}
