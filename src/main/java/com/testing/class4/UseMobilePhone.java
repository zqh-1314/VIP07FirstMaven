package com.testing.class4;

public class UseMobilePhone {
    //用于运行的入口main方法
    public static void main(String[] args) {
        //声明一个MobilePhone类型的变量（对象）
        //在内存中开一块空间，用于存储这个对象。
        MobilePhone huawei;
        //声明一个int类型的变量，注意对象只有类的对应变量才叫对象。
        int a;
        //赋值
        //在存储对象的内存中，完成变量、方法的实例化操作，这是真正完成实例化，对象能够使用的步骤。
        huawei=new MobilePhone();
        a=1;
        //调用方法
        huawei.call();
        //使用变量，不建议直接使用对象.变量来进行调用，尤其不建议直接赋值修改。
//      String res=  huawei.resolution;
        System.out.println(huawei.resolution);
        //建议使用get方法来返回需要使用的变量值
        System.out.println("更新之前的分辨率"+huawei.getResolution());
        //建议使用set方法来给需要赋值的变量赋值
        huawei.setResolution("更新的分辨率");
        System.out.println("更新之后的分辨率"+huawei.getResolution());

        System.out.println(huawei.takePhoto());
//        System.out.println(huawei.call());
        //takePhoto返回的值是"美眼的照片"
        //定义一个string类型的变量   String photo="美颜的照片"
        String photo=huawei.takePhoto();

        photo.equals("华为");


    }
}
