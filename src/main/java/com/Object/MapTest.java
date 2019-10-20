package com.Object;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();
        Emp emp1=new Emp("351","张三");
        Emp emp2=new Emp("512","李四");
        Emp emp3=new Emp("853","王五");
        Emp emp4=new Emp("125","赵六");
        Emp emp5=new Emp("341","黄七");
        map.put(emp4.getId(),emp4.getName());
        map.put(emp5.getId(),emp5.getName());
        map.put(emp1.getId(),emp1.getName());
        map.put(emp2.getId(),emp2.getName());
        map.put(emp3.getId(),emp3.getName());
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        System.out.println("HashMap类实现的Map集合，无序：");
        while(it.hasNext()){
            String str=(String)it.next();
            String name=(String)map.get(str);
            System.out.println(str+" "+name);
        }
        TreeMap<String,String> treeMap=new TreeMap<String, String>();
        treeMap.putAll(map);
        Iterator<String>iter=treeMap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，键对象升序：");
        while (iter.hasNext()){
            String str=(String)iter.next();
            String name=(String)treeMap.get(str);
            System.out.println(str+" "+name);
        }
    }
}
