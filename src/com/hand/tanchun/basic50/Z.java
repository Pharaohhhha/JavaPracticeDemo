package com.hand.tanchun.basic50;/*
    看程序写结果：
        A:成员变量的问题
            int x = 10; //成员变量x是基本类型
            Student s = new Student(); //成员变量s是引用类型
        B:一个类的初始化过程
            先进行成员变量的初始化：
                默认初始化
                显示初始化
                构造方法初始化
        C:子父类的初始化(分层初始化)
            先进行父类初始化，然后进行子类初始化。
            
    结果：
        YXYZ
        
    问题：
        虽然子类中的构造方法默认有一个 super();
        但初始化的时候，不是按照那个顺序进行的。
        而是按照分层初始化进行的。
        super(); 它仅仅表示要先初始化父类数据，再初始化子类数据。
*/

class X {
    //成员变量(引用类型)
    Y b = new Y();
    //无参构造方法
    X() {
        System.out.print("X");
    }
}

class Y {
    //无参构造方法
    Y() {
        System.out.print("Y");
    }
}

public class Z extends X {
    //成员变量(引用类型)
    Y y = new Y();
    //无参构造方法
    Z() {
        //super(); //它仅仅表示要先初始化父类数据，再初始化子类数据。
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z(); 
    }
}