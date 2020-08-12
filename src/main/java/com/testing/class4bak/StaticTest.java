package com.testing.class4bak;

public class StaticTest {
    public static void main(String[] args) {
        MobilePhone huawei=new MobilePhone();
        MobilePhone xiaomi=new MobilePhone();
        System.out.println("+++++++++++++修改之前++++++++++++++++");
        System.out.println(huawei.brand);//oppo
        System.out.println(huawei.produce);//中国深圳
        System.out.println(xiaomi.brand);//oppo
        System.out.println(xiaomi.produce);//中国深圳
        huawei.brand="华为";
        huawei.produce="中国香港";
        xiaomi.brand="小米";
        System.out.println("+++++++++++++修改之后++++++++++++++++");
        System.out.println(huawei.brand);  //华为
        System.out.println(huawei.produce);//中国香港
        System.out.println(xiaomi.brand); //小米
        System.out.println(xiaomi.produce);//?



    }

}
