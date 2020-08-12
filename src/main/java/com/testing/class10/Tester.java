package com.testing.class10;

public class Tester implements Employer{
    //私有,只在这一个类中能使用。
    private String env="测试环境";

    @Override
    public void work() {
        System.out.println("测试的工作是找bug以及跟开发讨论这是不是一个bug");
    }

    @Override
    public String moyu(int time) {
        System.out.println("测试通过喝很多次水摸鱼"+time);
        return "happy";
    }

    public void jiaban(){
        System.out.println("测试加班的时候总是陪着开发");
    }

    void defaultWork(){
        System.out.println("这是一个默认级别default权限的方法，允许在同一个包(package)中调用或继承");
    }

    public void opEnv(){
        System.out.println("部署"+env);
    }

    protected void caseModule(){
        System.out.println("祖传的测试用例模板");
    }

    protected static void manSpirit(){
        System.out.println("roy将男子气概遗传给自己的儿子");
        System.out.println("当然不遗传给儿媳妇");
    }

    public static void main(String[] args) {
        Tester roy=new Tester();
        System.out.println(roy.env);
    }

}
