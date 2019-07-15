package com.hand.tanchun.Demo;
class Person{
    String name;
    int age;
    public  void tell(){
        System.out.println("name is"+name);
    }
}
public class CreatClassTest {


    public static void main(String[] args) {
        Person person = new Person();
        person.name="张三";
        person.age=22;
        person.tell();
    }
}
