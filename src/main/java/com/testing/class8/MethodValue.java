package com.testing.class8;

import com.testing.class5.Dog;

import java.util.HashMap;
import java.util.Map;


public class MethodValue {
	
	public static void change(Integer[] arr,Integer age,String caseName,int weight,Dog dog,Map map) {
		//循环遍历数组中的每个值，并且+1
		System.out.println("++++++++++++++方法调用时内部改变之后的值++++++++++++++");
		for(int xb=0;xb<arr.length;xb++) {
			arr[xb]+=1;
		}
		System.out.print("调用方法后内部arr的值是：");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//改变integer类型
		age+=1;
		System.out.println("调用方法后方法内部的age值是"+age);
		//改变String类型的值
		caseName="java编程";
		System.out.println("调用方法后方法内部的caseName值是"+caseName);
		//改变基本数据类型int的值
		weight=15;
		System.out.println("调用方法后方法内部的weight值是"+weight);
		System.out.println("调用方法前方法内dog的耳朵是"+dog.ear);
		//改变 dog类型中的成员变量ear的值
		dog.ear="大耳朵";
		System.out.println("调用方法后方法内dog的耳朵是"+dog.ear);
		System.out.println(map);
		//改变map的值
		map.put("Will", "teacher");
		System.out.println("调用方法后方法内map的值是"+map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++++++++++++++++++++调用方法之前的原始值+++++++++++++++++++++");
		//数组类型
		Integer[] a=new Integer[] {1,1,1,1};
		//map引用类型
		Map<String, String> imap=new HashMap<String, String>();
		imap.put("roy", "老师");
		System.out.println(imap);

		Integer oAge=new Integer(1);
		String dName=new String("软件测试");
		int oWeight=4;
		//类类型
		Dog xh= new Dog();
		System.out.println(xh);
		System.out.println("方法调用之前的ear"+xh.ear);
		System.out.print("方法调用前数组a的值是：");
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println("Integer参数oAge的值是"+oAge);
		System.out.println("String参数dName的值是"+dName);
		System.out.println("int参数oWeight的值是"+oWeight);
		System.out.println("Dog参数xh的耳朵是"+xh.ear);
		
		
		//分割线
		change(a, oAge, dName, oWeight, xh,imap);


		System.out.println("----------方法执行后查看参数变化----------------------");
		System.out.print("方法调用后数组a的值是：");
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Integer参数oAge的值是"+oAge);
		System.out.println("String参数dName的值是"+dName);
		System.out.println("int参数oWeight的值是"+oWeight);
		System.out.println("Dog参数xh的耳朵是"+xh.ear);
		System.out.println(imap);
	}

}
