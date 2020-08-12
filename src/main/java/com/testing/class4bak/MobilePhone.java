package com.testing.class4bak;

public class MobilePhone {
    //属性，变量，实例域(field)
    //静态变量或者类变量
    public static String produce="中国深圳";
    //非静态变量或实例变量或成员变量
    public String brand = "oppo";
    public int weight = 300;
    public String size = "5.3英寸 ";
    public String resolution = "900*1600";
    public int useTime;
    public static final String TYPE="手机";

    //方法(method)
    //返回类型  方法名 (参数列表)，注意()永远不能丢。
    //void表示返回类型为空，也就是没有返回值。
    //call方法参数列表为空。
    public void call() {
        //方法体
        System.out.println("用手机打电话");
        return;
    }
    public String takePhoto() {
        return "美颜的照片";
    }

    //带参数的发短信方法
    public static void sendMsg(long mobileNo,String msg){
        System.out.println("现在开始发短信，发给"+mobileNo);
        System.out.println("发送的短信是"+msg);
    }

    //查询电量的方法
    public int queryBattery() {
        if (useTime < 30) {
            return 90;
        } else if (useTime < 60) {
            return 80;
        } else if (useTime < 120) {
            return 50;
        } else {
            return 10;
        }
    }



    public static void changePro(String szbrand,String szproduce){
        //非静态变量不能被静态方法使用
//        brand=szbrand;
        produce= szproduce;
        //静态方法不能调用非静态方法
//        takePhoto();
        //静态方法可以调用静态方法
        sendMsg(110,"xinx");
    }

    public void shanzhai(String szbrand,String szproduce){
        //非静态方法可以调用静态变量和非静态变量。
        brand=szbrand;
        produce=szproduce;
    }


    public String getResolution(){
        return resolution;
    }

    public void setResolution(String res){
        res+="修改过了";
        resolution=res;
    }

    public static void main(String[] args) {
//        shanzhai();
        sendMsg(110,"救命啊");
    }


}
