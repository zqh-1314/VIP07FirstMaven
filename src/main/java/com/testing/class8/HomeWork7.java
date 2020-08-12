package com.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
//        DataJson();
        System.out.println(checkMail("roy0814@sina.com"));
    }

    public static boolean checkMail(String input) {
        boolean result = false;
        // 邮箱格式  用户名 @ 邮箱服务器域名.一级域名  .com .org .edu .cn
        //匹配的是一个普通的.号，所以正则表达式用\\.
        String emailRegex = "\\w{3,16}@\\w{2,16}\\.(com|org|edu|cn)";
        if (input.matches(emailRegex)) {
            result = true;
        }
        input="roy0814@sina.com";
        input=input.replaceAll(".+(?=@)","smtp");
        System.out.println(input);
        return result;
    }

    public static void DataJson() {
        String ipStr = "/**/jQuery110204941063012544571_1595858622654({\"status\":\"0\",\"t\":\"1595858632498\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国 亚马逊云\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]});";
        //截取{到}之间的json的内容。
        String ipfmStr = ipStr.substring(ipStr.indexOf("{"), ipStr.length() - 2);
        System.out.println(ipfmStr);
        //解析字符串ipfmStr为一个json对象 ipJson
        JSONObject ipJson = JSON.parseObject(ipfmStr);
        //新建一个map用于存放json中的内容。
        Map<String, Object> IPmap = new HashMap<>();
        //遍历所有key，从而完成json对象的遍历
        for (String key : ipJson.keySet()) {
            System.out.println("键是：：" + key + "值是：：" + ipJson.get(key));
            IPmap.put(key, ipJson.get(key));
        }
        System.out.println("map的结果是" + IPmap);

        Object datajson = IPmap.get("data");
        System.out.println(datajson);
        //1、解析出来直接就是JSOnArray json的数组类型的形式
        JSONArray dataArray = (JSONArray) datajson;
        //通过下标获取dataArray中的元素。
        JSONObject dataJsonOb = (JSONObject) dataArray.get(0);
        for (String s : dataJsonOb.keySet()) {
            System.out.println("键是" + s + "值是" + dataJsonOb.get(s));
        }

        //2、解析出来看做一个字符串，去掉前后[]，就是一个json对象可以进行处理。
        String dataStr = datajson.toString();
        System.out.println("将data转换为string：" + dataStr);
        //截取[]
        String dataJsonStr = dataStr.substring(1, dataStr.length() - 1);
        //字符串解析为JsonOBject对象
        JSONObject dataStr2Json = JSON.parseObject(dataJsonStr);
        for (String s : dataStr2Json.keySet()) {
            System.out.println("键是" + s + "值是" + dataJsonOb.get(s));
        }


    }


}
