package com.yhh.datastracture;

public interface Stack<T> {
    //从表头位置添加一个元素
    void push(T value);
    //从表头位置删除一个元素
    T pop();
    //找出第一个元素
    T peek();
    int size();
    void print();
}
