package com.yhh.datastracture.sort;

public interface List {
    void append(int element);
    void insert(int index, int element) ;
    void remove(int index);
    void print();
    //*找出第一个元素值等于value的位置
    int getIndexOf(int value);
    //*找出第index个元素
    int get(int index);
    int gettail();
    //*找出第一个元素
    int gethead();
}
