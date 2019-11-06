package com.yhh.datastracture.hash;

public interface List<K,V> {
    void insert(K key,V value);

    void remove(K key,V value);

    V findValue(K key);

    void print();
}
