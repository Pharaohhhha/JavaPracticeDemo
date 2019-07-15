package com.hand.tanchun.Demo;

import java.util.*;

/**
 * Created By Tc In 2019/7/12 14:41
 * Description:
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        Iterator<String> iterator = strings.iterator();
        while ( iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            if("A".equals(next)){
                iterator.remove();
            }
        }
        System.out.println(strings);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","A");
        hashMap.put("2","B");
        hashMap.put("3","3");
        if(hashMap.containsKey("1")){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
        if(hashMap.containsValue("A")){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }

        Set<String> strings1 = hashMap.keySet();
        Iterator<String> iterator12 = strings1.iterator();
        while (iterator12.hasNext()){
            String next = iterator12.next();
            System.out.println(next);
        }
        Collection<String> values = hashMap.values();
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}

