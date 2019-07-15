package com.hand.tanchun.basic50;

import java.util.HashMap;

/**
 * Created By TanChun On 2019/7/15
 * Description:
 */
public class Azzzz {
    public static char find(String A){
        char[] chars = A.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                return chars[i];
            }
            map.put(chars[i],1);
        }
        return 0;

    }
    public static void main(String[] args) {
        double f=4.3f;
        Azzzz azzzz1 = new Azzzz();
        Azzzz azzzz2 = new Azzzz();
        System.out.println(azzzz1.equals(azzzz2));
        System.out.println(azzzz1 == azzzz2);
    }
}

