package com.yhh.datastracture.hash;

public class LinkedHash<K,V> implements List<K,V>{
    class Entry<K,V> {
        private K key;
        private V value;
        private Entry<K,V> next;

        public Entry(){
        }
        public Entry(K key,V value){
            this.key=key;
            this.value=value;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    Entry<K,V> head=null;
    int count=0;

    public void insert(K key,V value){
        Entry<K,V> node=new Entry<K, V>(key,value);
        if (head==null){
            head=node;
        }else {
            Entry<K,V> p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(node);
        }
        count++;
    }
    public void remove(K key,V value){
        Entry<K,V> node=head;
        Entry<K,V> pre=null;
        if (head.getKey()==key&&head.getValue()==value){
            if (head.getNext()==null){
                head=null;
            }else {
                head=head.getNext();
            }
        }else {
            while ((!(node.getKey()==key&&node.getValue()==value))&&node!=null){
                pre=node;
                node=node.getNext();
            }
            pre.setNext(node.getNext());
        }
        count--;
    }

    public V findValue(K key){
        Entry<K,V> node=head;
        while (node!=null){
            if (key.equals(node.getKey())){
                return node.getValue();
            }else {
                node=node.getNext();
            }
        }
        return null;
    }
    public void print(){
        Entry<K,V> node=head;
        while (node!=null){
            System.out.print("Key:"+node.getKey()+" "+"value:"+node.getValue()+"\t");
            node=node.getNext();
        }
    }
}
