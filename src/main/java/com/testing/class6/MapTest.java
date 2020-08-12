package com.testing.class6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//引入Map中的Entry子接口模块
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //字典用于存储键值对格式的内容，第一个是键Key，第二个是值Value
        Map<String,Integer> scoreMap=new HashMap<>();
        //增
        scoreMap.put("病态",90);
        scoreMap.put("roy",60);
        scoreMap.put("610",610);
        //不允许出现相同的键
        scoreMap.put("roy",30);
        //允许出现相同的值
        scoreMap.put("蜗牛",90);
        //删
        scoreMap.remove("roy");
        //remove（key，value）更保险，如果值错误，不会删除这条记录
        scoreMap.remove("病态",50);
        //改
        scoreMap.put("610",90);
        scoreMap.replace("蜗牛",80);
        //查
        System.out.println("++++++++++++++直接输出map++++++++++++++");
        System.out.println(scoreMap);
        //遍历：
        //foreach:
        //1、基于键遍历 map中的键值对， 通过键取值的方法是 map.get（key）
        System.out.println("++++++++++++++++通过foreach遍历keyset完成遍历++++++++++++++++");
        for(String key:scoreMap.keySet()){
            System.out.println("姓名是"+key+"分数是"+scoreMap.get(key));
        }
        //2、基于键值对来进行遍历
        //键值对使用的是Entry，对应的是map的entryset。
        System.out.println("+++++++++++++++++通过foreach基于Entry来进行遍历++++++++++++");
        for (Entry<String,Integer> e:scoreMap.entrySet()){
            System.out.println(e);
        }

        //3、遍历值，只能把所有的值拿出来，由于值可以重复，并不知道每个值对应的是哪个键。
//        System.out.println("++++++++++++++++++++通过foreach遍历所有值++++++++++++++++++++++");
//        for( Integer value: scoreMap.values()){
//            System.out.println(value);
//        }

        //基于迭代器遍历：
        //scoreMap.keySet() 得到的是一个set类型的对象，因此可以调用set的方法。
        Set<String> mapkeys=scoreMap.keySet();
        mapkeys.iterator();
        Iterator<String> mit=scoreMap.keySet().iterator();
        //调用一次mit.next()就取一次值。
        //1、第一次取值之前，mit.hasNext()判断是否有值
        //2、连取两次key，“键是”取了第一个值，病态， “值是”取了第二个值，蜗牛，然后map.get(蜗牛)=80
        //3、循环体执行完成，再次判断hasNext(),这个时候判断的是第三次取值是否有hasnext。
        //4、连取两次key，"键是"取第三个值，610， “值是”取第四个值，没有第四个值，所以报异常。
//        while (mit.hasNext()){
//            //调用这一行代码取了两次值。
//            System.out.println("键是："+mit.next()+"值是："+scoreMap.get(mit.next()));
//        }

        //处理逻辑就是：循环体中只取一次值。一个hasnext判断，只做一次next取值。
        while(mit.hasNext()){
            //只取一次值，把值存起来
            String key=mit.next();
            System.out.println("键是："+key+"值是："+scoreMap.get(key));
        }





    }
}
