package com.yhh.datastracture.hashTest;

public interface ListHash<K,V> {
    int size();

    int hash(K key,int length);

    void put(K key,V value);

    V get(K key);

    void remove(K key);
}
