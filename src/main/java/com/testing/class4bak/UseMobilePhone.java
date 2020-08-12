package com.testing.class4bak;

public class UseMobilePhone {
    public static void main(String[] args) {
        MobilePhone huawei=new MobilePhone();
        //变量的调用
        //非静态变量只能用实例来进行调用
        System.out.println(huawei.weight);
        //对成员变量weight进行赋值
        huawei.weight=400;
        System.out.println(huawei.weight);
        //静态变量调用：
        //可以使用类名调用，也可以用实例调用。
        System.out.println(MobilePhone.produce);
        System.out.println(huawei.produce);

        //方法的调用
        System.out.println(huawei.getResolution());
        //传递实参
        huawei.setResolution("更新之后的分辨率");
        System.out.println(huawei.getResolution());
        //没有返回类型的方法，也没有参数列表，直接调用使用它。
        huawei.call();
        huawei.sendMsg(13401231234l,"你好呀");
        MobilePhone.sendMsg(110,"救命呀");


    }
}
