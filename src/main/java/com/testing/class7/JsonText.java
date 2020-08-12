package com.testing.class7;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonText {
    public static void main(String[] args) {
        String ipStr = "/**/jQuery110204941063012544571_1595858622654({\"status\":\"0\",\"t\":\"1595858632498\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国 亚马逊云\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]});";
        //获取字符串中第一个指定符号的下标。
        int index = ipStr.indexOf("{");
        System.out.println(index);
        //截取{到}之间的json的内容。
        String ipfmStr = ipStr.substring(ipStr.indexOf("{"), ipStr.length() - 2);
        System.out.println(ipfmStr);
        //解析字符串ipfmStr为一个json对象 ipJson
        JSONObject ipJson = JSON.parseObject(ipfmStr);
        System.out.println(ipJson);
        //新建一个map用于存放json中的内容。
        Map<String, String> IPmap = new HashMap<>();
        //遍历所有key，从而完成json对象的遍历
        for (String key : ipJson.keySet()) {
            System.out.println("键是：：" + key + "值是：：" + ipJson.get(key));
            IPmap.put(key, ipJson.get(key).toString());
        }
        System.out.println("map的结果是" + IPmap);
        //通过parse方法，解析出来的是一个Object对象，直接强转为Map<String,Object>
        Map<String, Object> fomMap = (Map<String, Object>) JSON.parse(ipfmStr);
        //输出的结果是：连接的，原因是因为map的强转源头是JSON解析出来的对象，而这个对象的toString方法
        //输出方式是按照json格式拼接的。所以这个map输出结果和普通的map不一样。
        System.out.println("强转Map的结果是" + fomMap);
        //获取array
        System.out.println("+++++++++++++++++++++++++++++++获取array");
        JSONArray dataarray=(JSONArray)fomMap.get("data");
         for (String key:((JSONObject)dataarray.getJSONObject(0)).keySet()){
             System.out.println(key+"的值是"+((JSONObject) dataarray.get(0)).get(key));
         }

        //拼接map内容为一个字符串
        String convertStr="{";
        //遍历所有的键
        for (String key : fomMap.keySet()) {
            String keyPart = "\"" + key + "\"";
            String maohao = ":";
            String valuePart = "";
            //判断键对应的值是不是一个字符串
            if (fomMap.get(key) instanceof String) {
                //如果值是一个字符串，则需要加上""
                valuePart = "\"" + fomMap.get(key) + "\"";
            } else {
                //如果值不是字符串，则不需要。
                valuePart = fomMap.get(key).toString();
            }
            convertStr+=keyPart+maohao+valuePart +",";
        }
        convertStr+="}";
        //最后多一个逗号，替换掉。
        convertStr=convertStr.replace(",}","}");
        System.out.println(convertStr);


    }
}
