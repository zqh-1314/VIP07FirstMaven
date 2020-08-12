package com.testing.class11;

import org.junit.BeforeClass;
import org.junit.Test;

public class LoginSampleTestMsg {

    static LoginSample ls;

    @BeforeClass
    public static void setUp(){
        ls=new LoginSample();
    }

    @Test
    public void getMsg(){
        ls.login("Roy","2345");
        System.out.println("测试结果是"+ls.getMsg());

    }

}
