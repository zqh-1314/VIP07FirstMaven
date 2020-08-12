package com.testing.class11;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LoginParamTest {

    static LoginSample ls;
    //创建3个成员变量，用于接收参数化的每一行数据。
    String user;
    String pwd;
    String expectedMsg;

    @Parameterized.Parameters(name="用户名是{0}时，执行结果预期是{2}")
    public static Object[][] loginData(){
        return new Object[][] {
                {"Roy","123456","登录成功"},
                {null,"123456","为空"},
                {"r","123456","3-16位"},
                {"ro","123456","4-16位"},
                {"","123456","3-17位"},
                {"royy","123456","错误"}
        };
    }

    @BeforeClass
    public static void setUp(){
        ls=new LoginSample();
    }
    //写一个构造方法，用于将参数化返回的二维数组的数据，给成员变量赋值
    //构造方法的参数列表和二维数组每一行数据的类型和个数匹配
    public LoginParamTest(String userParam,String pwdParam,String expectedParam){
        user=userParam;
        pwd=pwdParam;
        expectedMsg=expectedParam;
    }

    @Test
    public void testLogin(){
        ls.login(user,pwd);
        System.out.println(ls.getMsg());
        Assert.assertTrue(ls.getMsg().contains(expectedMsg));
    }



}
