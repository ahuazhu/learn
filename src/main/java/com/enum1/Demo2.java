package com.enum1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo2<T extends List> {
    Demo2<ArrayList> l1=new Demo2<ArrayList>();
    Demo2<LinkedList>l2=new Demo2<LinkedList>();
}
