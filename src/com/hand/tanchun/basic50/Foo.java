package com.hand.tanchun.basic50;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created By TanChun On 2019/7/13
 * Description:
 */
public class Foo {
    int value;

     Foo(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof  Foo){
            Foo foo=(Foo)obj;
            return value==foo.value;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        HashSet set = new HashSet();
        list.add(new Foo(1));
        set.add(new Foo(1));

        System.out.println(new Foo(1).equals (new Foo(1)) + ","+ set.contains(new Foo(1)));
    }
}

