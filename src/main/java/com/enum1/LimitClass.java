package com.enum1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LimitClass<T extends List> {
    public static void main(String[] args) {
        LimitClass<ArrayList>l1=new LimitClass<ArrayList>();
        LimitClass<LinkedList>l2=new LimitClass<LinkedList>();
    }
}
