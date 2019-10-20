package com.Object;

import java.util.ArrayList;
import java.util.List;

public class Gather {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i=(int)(Math.random()*list.size());
        System.out.println("随机过去数组中的元素是："+list.get(i));
        list.remove(2);
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
