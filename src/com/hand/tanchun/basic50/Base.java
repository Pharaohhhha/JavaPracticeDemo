package com.hand.tanchun.basic50;

import java.util.ArrayList;

/**
 * Created By TanChun On 2019/7/13
 * Description:
 */
public class Base {
    private  void  test(){
        String aStr="     One     ";
        String bStr=aStr;
        bStr=aStr.trim();
        System.out.println("["+aStr+","+bStr+"]");
    }


    public static void main(String[] args) {

        new Base().test();
        ArrayList<Object> objects = new ArrayList<>();

    }

}

