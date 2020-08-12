package com.testing.class5;
//import语句调用java中实现的其它包中的类。
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //新增数组元素：数组长度固定。不存在新增，其实就是初始化过程。
        //创建一个长度为6的数组
        int[] ia=new int[6];
        //直接赋初值的初始化方式
        int[] ib={11,22,15,18,33,29};
        String[] sb=new String[4];
        String[] sa={"roy","will","tufei","kaka"};
        //构造自定义类型的数组。
        Dog[] da={new Dog("开心"),new Dog("小白")};
        //构造一个长度为3的Dog数组。
        Dog[] db=new Dog[3];
        //输出数组的类型。
        System.out.println(ib);
        System.out.println(da);

        //查
        System.out.println("ib中的第3个数字"+ib[2]);
        //1、通过下标遍历。注意下标从0开始。
        System.out.println("赋值之前的ia数组内容");
        for(int index=0;index<ia.length;index++){
            System.out.print(ia[index]);
        }
        System.out.println();
        for(int index=0;index<sb.length;index++){
            System.out.println(sb[index]);
        }
        System.out.println();
        //输出未赋值的dog数组中的内容
        for(Dog d:db){
            System.out.println(d);
        }

        //改
        //其实就是给指定元素赋值
        ia[0]=3;
        ia[1]=5;
        System.out.println("修改赋值之后的ia数组内容");
        for(int i:ia){
            System.out.print(i+" ");
        }
        //Arrays类通过静态方法调用内容。
        //调用静态方法fill，为数组全部填充值为4.
        Arrays.fill(ia,4);
        System.out.println("调用fill之后的ia数组内容");
        for(int i:ia){
            System.out.print(i+" ");
        }

        //用Arrays.sort来进行排序
        System.out.println("排序之后的ib");
        Arrays.sort(ib);
        for(int i:ib){
            System.out.print(i+" ");
        }




    }
}
