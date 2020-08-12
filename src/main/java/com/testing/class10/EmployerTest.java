package com.testing.class10;

import java.util.ArrayList;
import java.util.List;

public class EmployerTest {
    public static void main(String[] args) {
        //接口中的静态方法，和常量可以直接通过接口名使用。
        Employer.drink();
        //接口的向上转型。
        List li=new ArrayList();
        Employer devloper=new Developer();
        //向上转型之后，类扩展实现的方法不再生效
        //通过向下转型，将扩展的方法重新生效。
        ((Developer)devloper).writeBug();
        devloper.moyu(2);
        devloper.work();
        //没有重写过的default方法
        devloper.jiaban();

        Employer tester=new Tester();
        tester.moyu(3);
        tester.work();
        //同一个包中可以使用default级别的方法。
        ((Tester)tester).defaultWork();
        //重写过的default方法。
        tester.jiaban();
    }
}
