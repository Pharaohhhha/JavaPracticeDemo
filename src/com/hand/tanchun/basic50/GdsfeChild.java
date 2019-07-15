package com.hand.tanchun.basic50;

class Gdsfes {
    
    public Gdsfes(){
        System.out.println("父类构造");
    }
    static{
        System.out.println("父类静态块儿");
    }
    public void tell(){
        System.out.println("父类块儿");
    }
    
}
public class GdsfeChild  extends Gdsfes{
    public GdsfeChild(){
        System.out.println("子类构造");
    }
    static{
        System.out.println("子类静态块儿");
    }
    {
        System.out.println("子类块儿");
    }
    public static void main(String[] args) {
        GdsfeChild g = new GdsfeChild();
        System.out.println(">>>>>>>>>");
        GdsfeChild g2 = new GdsfeChild();
        
    }
}