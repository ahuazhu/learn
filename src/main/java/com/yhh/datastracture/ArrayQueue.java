package com.yhh.datastracture;

public class ArrayQueue<T>  implements Queue<T>  {
    private Object array[]=new Object[4];
    private int count=0;
    public int size(){
        return count;
    }//O(1)
    //O(n)
    public void print(){
        for (int i = 0; i<count; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    //O(1)
    public void enqueue(T value){

        if (count >= array.length) {
            resize();
        }
        array[count ++] = value;
    }

    private void resize() {
        Object newArray[]=new Object[array.length*2];
        for (int i = 0; i <count; i++) {
            newArray[i]=array[i];
        }
        array = newArray;
    }


    //O(n)
    public T take(){
        T element=(T)array[0];
        for (int i = 0; i < count-1; i++) {
            array[i]=array[i+1];
        }
        //System.out.println("取出的元素为："+element);
        count--;
        return element;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue=new ArrayQueue();
        arrayQueue.enqueue("S");
        arrayQueue.enqueue(13);
        arrayQueue.enqueue(14);
        arrayQueue.print();
        arrayQueue.enqueue(15);
        arrayQueue.enqueue(16);
        System.out.println(arrayQueue.size());
        arrayQueue.print();
        System.out.println(arrayQueue.take());
        arrayQueue.print();
    }
}
