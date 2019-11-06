package com.yhh.datastracture.hash;

public class HashTable<K,V> {
    private LinkedHash<K,V>[] entryArray;
    private final float LOAD_FACTOR=0.75f;
    private int size=0;
    public HashTable(){
        entryArray=new LinkedHash[7];
        for (int i = 0; i < entryArray.length; i++) {
            entryArray[i]= new LinkedHash();
        }
    }
    public int hash(K key){
        int hashVal=0;
        String k= (String) key;
        for (int i = 0; i < k.length(); i++) {
            hashVal=hashVal*27+k.charAt(i);
        }
        hashVal=hashVal%entryArray.length;
        if (hashVal<0){
            hashVal=hashVal+entryArray.length;
        }
        return hashVal;
    }
    public void resize(){
        LinkedHash<K,V>[] newEntryArray=new LinkedHash[entryArray.length*2];
        for (int i = 0; i < entryArray.length; i++) {
            newEntryArray[i]=entryArray[i];
        }
        entryArray=newEntryArray;
    }
    public void put(K key,V value){
        if ((++size/entryArray.length)>LOAD_FACTOR){
            resize();
        }
        int hashCode=hash(key);
        entryArray[hashCode].insert(key,value);
        size++;
    }
    public void remove(K key,V value){
        int hashCode=hash(key);
        entryArray[hashCode].remove(key,value);
        size--;
    }
    public V findValue(K key){
        int hashCode=hash(key);
        return entryArray[hashCode].findValue(key);
    }
    public void print(){
        for (int i = 0; i < entryArray.length; i++) {
            if (entryArray[i]!=null){
                entryArray[i].print();
            }
        }
        System.out.println();
    }
}
