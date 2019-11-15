package com.yhh.datastracture.aggregate;

public class HashSet<E extends Comparable> implements Set<E> {
    private Entry<E>[] array;
    private static final float LOAD_FACTOR=0.75f;
    private static final int ARRAY_SIZE=7;
    private float newFactor=LOAD_FACTOR;
    private int size=0;
    public HashSet(){
        this(LOAD_FACTOR,ARRAY_SIZE);
    }

    public HashSet(float newFactor, int arraySize) {
        this.newFactor=newFactor;
        this.array=new Entry[arraySize];
    }

    public int hash(E element, int length) {
        if (element==null){
            return 0;
        }else {
            int hashVal=0;
            for (int i = 0; i < element.toString().length(); i++) {
                hashVal=hashVal*37+element.toString().charAt(i);
            }
            hashVal=hashVal%length;
            if (hashVal<0){
                hashVal=hashVal+length;
            }
            return hashVal;
        }
    }

    @Override
    public void add(E e) {
        if (!contain(e)){
            if ((float)(getSize()+1)/array.length>newFactor){
                resize();
            }
            int hashcode=hash(e,array.length);
            insert(hashcode,new Entry<E>(e));
        }
    }

    private void insert(int hashcode, Entry<E> entry) {
        if (array[hashcode]==null){
            array[hashcode]=entry;
            size++;
        }else {
            Entry<E> node=array[hashcode];
            while (node.next!=null){
                node=node.next;
            }
                node.next=entry;
            size++;
        }
    }

    private void resize() {
        int newSize=array.length*2+1;
        Entry[] newArray=new Entry[newSize];
        Entry[] old=array;
        array=newArray;
        size=0;
        for (int i = 0; i < old.length; i++) {
            for (Entry<E> en=old[i];en!=null;en=en.next) {
                add(en.element);
            }
        }
    }

    @Override
    public void remove(E e) {
        int hashcode=hash(e,array.length);
        Entry<E> pre=null;
        for (Entry<E> en=array[hashcode];en!=null;pre=en,en=en.next) {
            if (en.getElement().equals(e)){
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

    @Override
    public boolean contain(E e) {
        for (int i = 0; i <array.length; i++) {
            Entry<E> node=array[i];
            while (node!=null){
                if (node.getElement()==e){
                    return true;
                }else {
                    node=node.next;
                }
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (getSize()==0){
            return true;
        }
        return false;
    }
    public static class Entry<E>{
        private E element;
        private Entry<E> next;
        public Entry(E element){
            this.element=element;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Entry<E> getNext() {
            return next;
        }

        public void setNext(Entry<E> next) {
            this.next = next;
        }
    }
}
