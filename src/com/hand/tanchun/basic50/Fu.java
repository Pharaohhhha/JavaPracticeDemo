package com.hand.tanchun.basic50;

/*
    看程序写结果：
        A:访问成员变量的原则：就近原则。
        B:this和super的问题：
            this     访问本类的成员
            super    访问父类的成员(可以理解为的)
        C:子类的所有构造方法执行前默认先执行父类的无参构造方法。
        D:一个类的初始化过程：
            成员变量进行初始化过程如下：
                默认初始化
                显示初始化
                构造方法初始化
                
    输出的结果是：
        　　　　fu
        　　　　zi
        　　　　30
        　　　　20
        　　　　10
*/
class Fu {
    public int num = 10;
    public Fu() {
        System.out.println("fu");
    }
}

class Zi extends Fu {
    public int num = 20;
    public Zi() {
        System.out.println("zi");
    }
    public void show() {
        int num = 30;
        System.out.println(num); //30
        System.out.println(this.num); //20
        System.out.println(super.num); //10
    }
}
class ExtendsTest {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
/*
    看程序写结果：
        A:一个类的静态代码块,构造代码块,构造方法的执行流程：
            静态代码块 > 构造代码块 > 构造方法
        B:静态的内容是随着类的加载而加载，
            即：静态代码块的内容会优先执行。
        C:构造代码块
　            在类中方法外出现(即在类中的成员位置)，可以把多个构造方法方法中相同的代码存放到一起，用于对对象进行初始化，
            每次调用构造方法都执行，并且在构造方法前执行。
        C:子类的所有的构造方法默认都会去访问父类的无参构造方法。

    输出结果是：
        　　静态代码块Fu
        　　静态代码块Zi
        　　构造代码块Fu
        　　构造方法Fu
        　　构造代码块Zi
       　　 构造方法Zi
*/
class Fuz {
    static {
        System.out.println("静态代码块Fu");
    }

    {
        System.out.println("构造代码块Fu");
    }

    public Fuz() {
        System.out.println("构造方法Fu");
    }
}

class Ziz extends Fuz{
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public Ziz() {
        System.out.println("构造方法Zi");
    }
}

class ExtendsTest2 {
    public static void main(String[] args) {
        Ziz z = new Ziz();
    }
}