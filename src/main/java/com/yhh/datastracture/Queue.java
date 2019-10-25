package com.yhh.datastracture;

public interface Queue<T> {
    //从表头位置添加一个元素
    void enqueue(T value);
    //从表尾取出一个元素并返回该元素的值
    T take();
    //
    int size();
}
