package com.hand.tanchun.Demo;
class Ref{
    String temp="hello";
}
public class ReferenceTest {


    public  static  void  tell(String str2){
        str2="hand";
    }
    public  static  void  tell(Ref r){
        r.temp="china";
    }

    public static void main(String[] args) {
        String str="hello";
        System.out.println(str);
        tell(str);
        System.out.println("----");
        Ref ref = new Ref();
        ref.temp="jike";
        System.out.println(ref.temp);
        tell(ref);
        System.out.println(ref.temp);

    }
}
