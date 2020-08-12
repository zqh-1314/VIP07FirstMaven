package com.testing.class11;

import org.junit.*;

import static org.junit.Assert.*;

public class LoginSampleTest {

    static LoginSample ls;

    @BeforeClass
    public static void classSetUp(){
        System.out.println("-------------------------测试类开始执行前执行的方法-------------------------");
        //在测试方法执行前的准备工作：完成对象实例化。
        ls=new LoginSample();
    }

    @AfterClass
    public static void classTd(){
        System.out.println("-------测试类执行结束后执行的方法-----------");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("**********每个测试方法执行前执行的方法***********");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("**********测试方法完成后执行的方法***********");
    }

    @Test
    public void login() {
        ls.login("Roy","123456");

        //预期结果，登录成功
//        fail("也不知道你执行了个啥，没有结果，所以失败了");
        assertEquals("恭喜您，登录成",ls.getMsg());
    }

    @Test
    public void loginMsg() {
        System.out.println("测试的结果是："+ls.getMsg());
    }

    @Test
    public void errorLogin(){
        ls.login(null,"123456");
        //预期结果，用户名密码不能为空
        assertTrue(ls.getMsg().contains("为空"));
    }

}