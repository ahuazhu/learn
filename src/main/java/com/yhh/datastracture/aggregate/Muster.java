package com.yhh.datastracture.aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
    }
}
