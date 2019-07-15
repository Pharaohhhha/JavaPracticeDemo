package com.hand.tanchun.Demo;

abstract class Personn{
    private  int age;
    private  String name;

    public abstract  void  want();
    public Personn(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class  Student extends Personn{
    private int score;

    public Student(int age, String name,int score) {
        super(age, name);
        this.score=score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void want() {
        System.out.println(getName()+getAge()+getScore()+"学生");
    }
}
class Worker extends Personn{
    private int money;

    public int getMoney() {
        return money;
    }

    public Worker(int age, String name, int money) {
        super(age, name);
        this.money = money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void want() {
        System.out.println(getName()+getAge()+getMoney()+"工人");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Student student = new Student(11,"谭春",100);
        Worker worker = new Worker(10,"张",15000);
        student.want();
        worker.want();
    }
}
