package com.testing.class10;

import com.testing.class9.Animal;
import com.testing.class9.Cat;
import com.testing.class9.Rabbit;

import java.util.*;

public class MultiTest {
    public static void main(String[] args) {
        //父类引用   子类对象。
        Animal a=new Cat();
        //向上转型
        Animal b=new Rabbit();
        Cat c=new Cat();
        //向上转型产生的效果：
        //1、调用方法的时候，子类如果完成了重写，那么调用的是子类重写之后的方法。
        //同样类型的对象调用同一个方法的时候，产生了不一样的结果。
//        a.drink();
//        b.drink();
        //2、进行了向上转型之后，子类扩充的方法，将会被隐藏。
        //因为这个时候，已经不作为一个特别的动物（猫）了，只拥有动物的共性。
//        a.play();
        System.out.println("---------------------人类来调用动物了-----------------------");
        Human roy=new Human();
        roy.playWithAnimal(a);
        roy.playWithAnimal(b);
        //子类对象在进行调用的时候，如果方法使用的是父类对象，那么调用的时候传递子类对象是可以自动向上转型的。
        roy.playWithAnimal(c);
        System.out.println("---------------------只针对猫来进行调用------------------------");
        //父类对象不能直接转换为子类对象
        //        roy.playWithCat(a);
        //        roy.playWithCat(c);
        //向下转型之后调用,如果方法调用的是子类对象，那么可以通过强制向下转型来完成调用。
        roy.playWithCat((Cat)a);
        //向上转型之后向下转型的对象，和普通的子类对象是没有区别的，c和downcat都是猫类的实例。

        System.out.println("------------------向下转型-----------------");
        //向下转型。  将父类对象转换为子类类型。
        Cat downCat= (Cat)a;
        //1、向下转型的对象，调用子类重写的方法的时候，用的是子类重写的方法。
        downCat.drink();
        //2、对象向下转型之后，原本隐藏起来的子类扩展的方法，可以重新使用了。
        downCat.play();
        //3、只有子类类型对象通过向上转型而产生的父类对象，才能向下转型为子类对象。
        Animal an=new Animal();
        //不能把兔子转成猫
        Cat downb=(Cat)b;
        //不能把一只笼统的动物父类转成子类猫。
        Cat downAn=(Cat)an;
        downAn.play();

    }
}
