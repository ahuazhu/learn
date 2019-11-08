package com.yhh.datastracture.hashTest;

public class LinkedHashTableTest<K extends Comparable,V> implements ListHash<K,V> {
    private Entry<K,V>[] array;
    private static final float LOAD_FACTOR=0.75f;
    private static final int ARRAY_SIZE=7;
    private float newFactor=LOAD_FACTOR;
    private int size=0;
    public LinkedHashTableTest(){
        this(LOAD_FACTOR,ARRAY_SIZE);
    }

    public LinkedHashTableTest(float newFactor, int arraySize) {
        this.newFactor=newFactor;
        this.array=new Entry[arraySize];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int hash(K key, int length) {
        if (key==null){
            return 0;
        }else {
            int hashVal=0;
            for (int i = 0; i < key.toString().length(); i++) {
                hashVal=hashVal*37+key.toString().charAt(i);
            }
            hashVal=hashVal%length;
            if (hashVal<0){
                hashVal=hashVal+length;
            }
            return hashVal;
        }
    }

    @Override
    public void put(K key, V value) {
        if ((float)(size()+1)/array.length>newFactor){
            resize();
        }
        int hashcode=hash(key,array.length);
        insert(hashcode,new Entry<K,V>(key, value));
    }

    private void insert(int hashcode, Entry<K,V> entry) {
        if (array[hashcode]==null){
            array[hashcode]=entry;
            size++;
        }else {
            Entry<K,V> node=array[hashcode];
            Entry<K,V> pre = null;
            while (node.next!=null&&entry.key.compareTo(node.key)>0){
                pre=node;
                node=node.next;
            }
            if (entry.key.equals(node.key)){
                node.value=entry.value;
            }else {
                if (node.next==null){
                    node.next=entry;
                }else {
                    pre.next=entry;
                    entry.next=node;
                }
                size++;
            }
        }
    }

    private void resize() {
        int newSize=array.length*2+1;
        Entry[] newArray=new Entry[newSize];
        Entry[] old=array;
        array=newArray;
        size=0;
        for (int i = 0; i < old.length; i++) {
            for (Entry<K,V> en=old[i];en!=null;en=en.next) {
                put(en.key,en.value);
            }
        }
    }

    @Override
    public V get(K key) {
        int hashcode=hash(key,array.length);
        for (Entry<K,V> en=array[hashcode];en!=null;en=en.next) {
            if (en.getKey().equals(key)){
                return en.getValue();
            }
        }
        return null;
    }

    @Override
    public void remove(K key) {
        int hashcode=hash(key,array.length);
        Entry<K,V> pre=null;
        for (Entry<K,V> en=array[hashcode];en!=null;pre=en,en=en.next) {
            if (en.getKey().equals(key)){
                if (en==array[hashcode]){
                    if (en.next==null){
                        array[hashcode]=null;
                    }else {
                        array[hashcode]=en.next;
                    }
                }else {
                    if (en.next==null){
                        pre.next=null;
                    }else {
                        pre.next=en.next;
                    }
                }
                size--;
            }
        }
    }


    public void print(){
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null){
                for (Entry<K,V> en=array[i];en!=null;en= en.next) {
                    System.out.print("key:"+en.getKey()+" value:"+en.getValue()+"\t");
                }
                System.out.println();
            }
        }
    }

    public class Entry<K,V>{
        private K key;
        private V value;
        private Entry<K,V> next;
        public Entry(K key,V value){
            this.key=key;
            this.value=value;
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
