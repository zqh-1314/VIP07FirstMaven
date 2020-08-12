package com.testing.class5;

public class Dog {
    //变量
    //年龄的变量，使用成员变量，因为这是狗的特有属性
    public int age =0;
    public String name="小狗狗";
    public String ear="尖耳朵";
    //狗的不同阶段叫声，固定的，所以使用常量
    public static final String LITTLE_DOG_BARK="呜呜";
    public static final String Big_DOG_BARK="汪汪";
    public static final String Old_DOG_BARK="嗷嗷";

    //在类中默认有一个无参的构造方法
    public Dog(){

    }

    //在构造狗的时候，给狗取名字
    //参数传递狗的名字
    public Dog(String name){
        this.name=name;
    }


    //方法
    //长大的同时，叫一声
    //传参长大的岁数，返回长大之后的年龄
    public int growUp(int growAge){
        age+=growAge;
        bark();
        return age;
    }
    //重载同名的方法
    public int growUp(){
        age++;
        return age;
    }

    //叫
    //基于狗的当前年龄来判断叫声
    public void bark(){
        int barktimes=3;
        if(age<3 &&age>=0){
            System.out.println("小"+name+LITTLE_DOG_BARK+"叫"+barktimes+"次");
        }else if(age<6){
            System.out.println("大"+name+Big_DOG_BARK+"叫"+barktimes+"次");
        }else{
            System.out.println("老"+name+Old_DOG_BARK+"叫"+barktimes+"次");
        }
    }

    public static void  showBark(){
        System.out.println("小狗的叫声是"+LITTLE_DOG_BARK);
    }

    public String toString(){
        return "这是一条"+age+"岁"+"名字是"+name+"的狗";
    }

    public static void main(String[] args) {
        Dog xiaobai=new Dog("开心");
        int nowAge=xiaobai.growUp(4);
        System.out.println("当前年龄是"+nowAge);
        nowAge=xiaobai.growUp(5);
        System.out.println("当前年龄是"+nowAge);
        Dog.showBark();
    }

}
