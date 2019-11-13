package com.yhh.datastracture.aggregate;

import java.util.*;

public class MapStu {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();
        map.put("01","小李");
        map.put("02","小魏");
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        System.out.println("key集合中的元素：");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Collection<String> coll=map.values();
        it=coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
