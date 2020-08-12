package com.testing.class6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework5 {
    public static void main(String[] args) {
        Integer[] a = { 1, 2, 3, 5, 4, 6, 9, 7, 8, 0 };
        //从数组中取各个元素添加到list
        List<Integer> resultlist=new ArrayList<>();
        //foreach 直接取值存进list
        for(Integer i:a){
            resultlist.add(i);
        }
        System.out.println("foreach存值："+resultlist);

        //for循环基于下标取值存值
        for(int index=0;index<a.length;index++){
            resultlist.add(a[index]);
        }
        System.out.println("for基于下标存值："+resultlist);

        //使用Arrays中的asList方法
        resultlist=Arrays.asList(a);
        System.out.println("基于asList转换："+resultlist);


        //list转换成数组
        //存数组首先得初始化一个数组。仅知道长度和list的长度一致。
        Integer[] result=new Integer[resultlist.size()];
        //toArray方法，可以接收一个参数，参数类型为数组类型，那么会将list中的内容传递到这个数组中，
        // 并且返回这个数组对象
        Integer[] b=resultlist.toArray(result);
        System.out.println("输出转换后的数组");
        for(int i:b){
            System.out.print(i+" ");
        }
        //无参的toArray方法，返回类型是一个Object[]数组，所以接收的时候，需要进行类型强制转换。
        result=(Integer[]) resultlist.toArray();
        System.out.println("输出转换后的数组");
        for(int i:result){
            System.out.print(i+" ");
        }


    }
}
