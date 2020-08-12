package com.testing.class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //<泛型>中填写的是set中存储的数据类型。
        //只指定了存储容器是set，存储的类型是String。
        Set<String> roySet=new HashSet<String>();
        //容器结构中不能是基本数据类型。而应该是java实现的对应的类类型
        // （基本数据类型对应的类类型就叫包装类型）。
//        Set<int> royi=new HashSet<int>();

        //增
        roySet.add("茶颜悦色");
        roySet.add("喜茶");
        roySet.add("奈雪の茶");
        roySet.add("双双");
        //set中不允许重复的值。
        roySet.add("茶颜悦色");
        //删
        roySet.remove("喜茶");
        //改 ，由于set没有下标。set没有修改的方法。
        //查
        System.out.println(roySet);

        //遍历：没有下标，不能用下标遍历，只能foreach
        for(String s:roySet){
            System.out.println(s+"好喝");
        }
        System.out.println("+++++++++++++迭代器遍历：");
        //迭代器遍历：
        Iterator roysit= roySet.iterator();
        //roysit就可以看成是一个抽奖的人
        //先判断是否还有下一个值
        if(roysit.hasNext()){
            //取出下一个球，取完之后，在遍历过程中set里面就没有这个值了。
            System.out.println(roysit.next());
            System.out.println(roysit.next());
            System.out.println(roysit.next());
            System.out.println(roysit.next());
        }


    }
}
