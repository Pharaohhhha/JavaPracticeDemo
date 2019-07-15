package com.hand.tanchun.basic50;

import java.util.*;

/**
 * Created By TanChun On 2019/7/13
 * Description:
 */
public class RemoveList {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jessica",100);
        map.put("tom",200);
        map.put("den",300);
        Set<Map.Entry> set = map.entrySet();
        Set set1 = map.keySet();
        for (Map.Entry o : set) {
            System.out.println(o.getKey()+":"+o.getValue());
        }
//        ArrayList<String> list = new ArrayList<>();
//        list.add("java");
//        list.add("php");
//        list.add(".net");
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//
//            it.next();
//            it.remove();
//        }
//        System.out.println(list);
    }
}

