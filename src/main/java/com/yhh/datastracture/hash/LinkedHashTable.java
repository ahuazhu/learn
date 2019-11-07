package com.yhh.datastracture.hash;

public class LinkedHashTable<K, V> implements IHashTable<K, V> {


    private static final int DEFAULT_INIT_ARRAY_SIZE = 17;

    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private Entry<K, V>[] array;

    private float loadFactor;
    private int size = 0;

    public LinkedHashTable() {
        this(DEFAULT_LOAD_FACTOR, DEFAULT_INIT_ARRAY_SIZE);
    }

    public LinkedHashTable(float loadFactor) {
        this(loadFactor, DEFAULT_INIT_ARRAY_SIZE);
    }

    public LinkedHashTable(float loadFactor, int capacity) {
        this.loadFactor = loadFactor;
        this.array = new Entry[capacity];
    }


    @Override
    public int hash(K key, int length) {

        if (key == null) {
            return 0;
        }

        return hashString(key.toString(), length);
    }

    private int hashString(String s, int length) {
        int hash = 0;

        for (int i = 0; i < s.length(); i++) {
            hash = hash * 27 + s.charAt(i);
        }

        hash %= length;
        if (hash < 0) {
            hash += length;
        }

        return hash;
    }

    @Override
    public void put(K key, V value) {
        if (needResize()) {
            resize();
        }

        int hash = hash(key, this.array.length);
        insert(hash, new Entry(key, value));

    }

    private void insert(int index, Entry<K, V> entry) {
        if (array[index] == null) {
            array[index] = entry;
            this.size ++;
        } else {
            Entry en = array[index];
            while (en.next != null && en.key != entry.key) {
                en = en.next;
            }

            if (en.key.equals(entry.key)) {
                en.value = entry.value;
            } else {
                en.next = entry;
                this.size ++;
            }
        }

    }

    private boolean needResize() {
        return ((float) size() / array.length) > this.loadFactor;
    }

    private void resize() {
        int newSize = array.length * 2 + 1;
        Entry[] newArray = new Entry[newSize];
        Entry[] oldArray = this.array;
        this.array = newArray;

        this.size = 0;
        for (int i =0; i < oldArray.length; i ++) {
            for (Entry entry = oldArray[i]; entry != null; entry = entry.next) {
                this.put((K)entry.key, (V)entry.value);
            }
        }
    }

    @Override
    public V get(K key) {
        int hash = hash(key, array.length);
        for (Entry<K, V> en = array[hash]; en !=  null; en = en.next) {
            if (en.getKey().equals(key)) {
                return en.getValue();
            }

        }
        return null;
    }

    @Override
    public void remove(K key) {

    }

    @Override
    public int size() {
        return this.size;
    }

    public class Entry<K, V> {

        private K key;

        private V value;

        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Entry<K, V> getNext() {
            return next;
        }
    }
}
