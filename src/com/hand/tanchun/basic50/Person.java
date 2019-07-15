package com.hand.tanchun.basic50;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By TanChun On 2019/7/13
 * Description:
 */
public class Person {
    private Long idCard;
    private String userName;

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person();
        p1.setIdCard(1001L);
        p1.setUserName("terry");
        Person p2 = new Person();
        p2.setIdCard(1002L);
        p2.setUserName("tom");
        list.add(p1);
        list.add(p2);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdCard()+":"+list.get(i).getUserName());
        }
        for (Person person :list) {
            System.out.println(person.getIdCard()+":"+person.getUserName());
        }

    }
}

