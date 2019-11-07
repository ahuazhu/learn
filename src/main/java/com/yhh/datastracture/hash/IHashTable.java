package com.yhh.datastracture.hash;

public interface IHashTable<K, V> {

    int hash(K key, int lenth);

    void  put(K key, V value);

    V get(K key);

    void remove(K key);

    int size();
}
