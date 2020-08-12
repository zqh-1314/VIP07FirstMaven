package com.testing.class5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> roylist=new ArrayList<>();
        //按照顺序添加到list的尾部
        roylist.add("红烧牛肉");
        roylist.add("烧烤茄子");
        roylist.add("四川火锅");

        //增
        //往指定的位置插入元素内容，注意下标从0开始
        roylist.add(1,"老坛酸菜鱼");
        roylist.add("剁椒鱼头");

        System.out.println(roylist);

        //删  删除操作会改变list的长度和下标位置，重新排列的。
        //删除下标为1的元素
        System.out.println("+++++++++++删除操作");
        roylist.remove(1);
        //删除内容为四川火锅的元素
        roylist.remove("四川火锅");

        //改，由于list有下标，所以可以根据下标来进行修改
        roylist.set(1,"碳烤生蚝");

        //查  get方法
        //可以直接输出
        System.out.println(roylist);
        //遍历方案：
        //1、有下标可以基于下标遍历
        System.out.println("基于下标遍历：");
        for(int index=0;index<roylist.size();index++){
            System.out.print(roylist.get(index));
        }

        //2、foreach循环
        System.out.println("foreach遍历：");
        for(String s:roylist){
            System.out.print(s);
        }

        //3、iterator遍历
        System.out.println("iterator 遍历");
        Iterator roylit=roylist.iterator();
        while(roylit.hasNext()){
            System.out.print(roylit.next());
        }

    }
}
