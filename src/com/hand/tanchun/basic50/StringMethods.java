package com.hand.tanchun.basic50;

/**
 * Created By TanChun On 2019/7/14
 * Description:
 */
public class StringMethods {
    public static void main(String[] args) {
        String a = "Hello Word!";
        // length（）字符串的长度
        System.out.println(a.length());
       //输出的结果是字符串长度10。

       //charAt（）截取一个字符
        System.out.println(a.charAt(1));
       // 输出的结果是字符串a的下标为1的字符e。

        //getchars（）截取多个字符并由其他字符串接收
        char[] b = new char[10];
        a.getChars(0, 5, b, 0);
        System.out.println(b);
        //输出的结果为Hello，其中第一个参数0是要截取的字符串的初始下标（int sourceStart），
        // 第二个参数5是要截取的字符串的结束后的下一个下标（int sourceEnd）也就是实际截取到
        // 的下标是int sourceEnd-1，第三个参数是接收的字符串（char target[]），最后一个参数
        // 是接收的字符串开始接收的位置。

        //getBytes()将字符串变成一个byte数组
        byte bb[] = a.getBytes();
        System.out.println(new String(bb));
        //输出的结果为Hello Word的byte数组。

       // toCharArray()将字符串变成一个字符数组
        char[] ab = a.toCharArray();
        System.out.println(b);
       //输出的结果为Hello Word字符数组

//        equals()和equalsIgnoreCase()比较两个字符串是否相等，前者区分大小写，后者不区分
        String bbb = "hello word";
        System.out.println(a.equals(bbb));
        System.out.println(a.equalsIgnoreCase(bbb));
       // 输出的结果为第一条为false，第二条为true。

//        startsWith()和endsWith()判断字符串是不是以特定的字符开头或结束
        System.out.println(a.startsWith("ee"));
        System.out.println(a.endsWith("rd"));
//        输出的结果第一条为false，第二条为true。

//        toUpperCase()和toLowerCase()将字符串转换为大写或小写
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        //输出的结果第一条为“HELLO WORD”，第二条为“hello word”。



        //concat() 连接两个字符串
        String bz = "你好";
        System.out.println(bz.concat(a));
//        输出的结果为“你好Hello Word”。



//        trim()去掉起始和结束的空格

        String qa = "    Hello Word   ";
        System.out.println(qa.trim());
//        输出的结果为“Hello Word”。



        //substring（）截取字符串
        System.out.println(a.substring(0, 5));
        System.out.println(a.substring(6));
//        输出的结果第一条为“Hello”,第一个参数0（beginIndex）是开始截取的位置，第二个参数5（endIndex）是截取结束的位置，
// 输出的结果第二条是“Word”，参数6（beginIndex）是开始截取的位置。

        //indexOf()和lastIndexOf()前者是查找字符或字符串第一次出现的地方，后者是查找字符或字符串最后一次出现的地方
        System.out.println(a.indexOf("o"));
        System.out.println(a.lastIndexOf("o"));
//        输出的结果第一条是4，是o第一次出现的下标，第二条是7，是o最后一次出现的下标。

        //compareTo()和compareToIgnoreCase(）按字典顺序比较两个字符串的大小，前者区分大小写，后者不区分
        String bn = "hello word";
        System.out.println(a.compareTo(bn));
        System.out.println(a.compareToIgnoreCase(bn));
//        输出的结果第一条为-32，第二条为0，两个字符串在字典顺序中大小相同，返回0。

//        replace() 替换
        String ib = "你好";
        System.out.println(a.replace(a, ib));
        System.out.println(a.replace(a, "HELLO WORD"));
        System.out.println(ib.replace("你", "大家"));
//        输出的结果第一条为“你好”，第二条为“HELLO WORD”，第三条为“大家好”。

//        对于多态，可以总结以下几点：
//
//一、使用父类类型的引用指向子类的对象；
//二、该引用只能调用父类中定义的方法和变量；
//三、如果子类中重写了父类中的一个方法，那么在调用这个方法的时候，将会调用子类中的这个方法；（动态连接、动态调用）
//四、变量不能被重写（覆盖），”重写“的概念只针对方法，如果在子类中”重写“了父类中的变量，那么在编译时会报错
//
//1、抽象类：
//（1）、抽象类不可以被实例化；
//（2）、抽象类中可以没有抽象方法；可以拥有非抽象方法或者属性；
//（3）、接口与抽象类中的抽象方法不能具体实现；
//（4）、抽象类可以有构造函数；
//（5）、抽象类中的成员变量可以被不同的修饰符来修饰；
//（6）、
//2、接口：
//（1）、接口中不能有普通数据成员，只能够有静态的不能被修改的数据成员,final表示全局，static 表示不可修改，可以不用static final 修饰，会隐式的声明为static和final ；
//（2）、接口中的方法一定是抽象方法，所以不用abstract修饰；
//（3）、接口不能且它里面的方法只是一个声明必须用public来修饰没有具体实现的方法。
//---------------------
//作者：俺叫赵小邪
//来源：CSDN
//原文：https://blog.csdn.net/zhaojw_420/article/details/70477636
//版权声明：本文为博主原创文章，转载请附上博文链接！
    }
}

