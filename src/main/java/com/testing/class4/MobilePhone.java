//包声明
package com.testing.class4;

//类声明
//公有权限  类定义  类名
public class MobilePhone {
    //属性，变量，实例域(field)
    public static String produce;
    public String brand = "华为";
    public int weight = 300;
    public String size = "5.3英寸 ";
    public String resolution = "900*1600";
    public int useTime;
//    String type="手机";

    //方法(method)
    //返回类型  方法名 (参数列表)，注意()永远不能丢。
    //void表示返回类型为空，也就是没有返回值。
    //call方法参数列表为空。
    public void call() {
        //方法体
        System.out.println("用手机打电话");
        return;
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

    public String takePhoto() {
        return "美颜的照片";
    }

    public String getResolution(){
        return resolution;
    }

    public void setResolution(String resolution){
       this.resolution=resolution;
    }

//    public static void main(String[] args) {
//        produce.equals("华为");
//    }

//    //返回一个mobilephone类型的对象
//    public static MobilePhone buyMobilePhone(){
//        MobilePhone phone=null;
//        return phone;
//    }
//
//    public static  MobilePhone openMobilePhone(MobilePhone phone){
//        phone=new MobilePhone();
//        return phone;
//    }


}
