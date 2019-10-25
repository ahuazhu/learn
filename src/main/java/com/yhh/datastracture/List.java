package com.yhh.datastracture;

public interface List<T> {
    /**
     * @return count of elements in this List
     */
    int size();

    void append(T element);

    void insert(int index, T element) throws Exception;
/*
* 删除列表中的第index元素  */
    void remove(int index);

    void print();
     //*找出第一个元素值等于value的位置
    int getIndexOf(T value);
    //*找出第index个元素
    T get(int index);
    //*找出最后一个元素
    T gettail();
    //*找出第一个元素
    T gethead();
}
