package com.yhh.datastracture;

public interface List {
    /**
     * @return count of elements in this List
     */
    int size();

    void append(int element);

    void insert(int index, int element);
/*
* 删除列表中的第index元素  */
    void remove(int index);
    /*找出第一个元素值等于value的位置*/
    int getIndexOf(int value);
    /*找出第index个元素*/
    int get(int index);
    /*找出最后一个元素*/
    int gettail();
    /*找出第一个元素*/
    int gethead();
}
