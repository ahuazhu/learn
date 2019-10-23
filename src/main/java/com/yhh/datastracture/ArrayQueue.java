package com.yhh.datastracture;

public class ArrayQueue implements List_02{
    private int array[]=new int[4];
    private int count=0;
    public int size(){
        return count;
    }
    public void print(){
        for (int i = count-1; i >=0; i--) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public void enqueue(int value){
        if (count==0){
            array[0]=value;
            count++;
        }else if (count<array.length){
            for (int i = count; i >0; i--) {
                array[i]=array[i-1];
            }
            array[0]=value;
            count++;
        }else{
            int newArray[]=new int[array.length*2];
            for (int i = 0; i <count; i++) {
                newArray[i]=array[i];
            }
            for (int i = count; i >0 ; i--) {
                newArray[i]=newArray[i-1];
            }
            newArray[0]=value;
            count++;
            array=newArray;
        }
    }
    public int take(){
        int element=array[count-1];
        System.out.println("取出的元素为："+element);
        count--;
        return element;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue=new ArrayQueue();
        arrayQueue.enqueue(12);
        arrayQueue.enqueue(13);
        arrayQueue.enqueue(14);
        arrayQueue.print();
        arrayQueue.enqueue(15);
        arrayQueue.enqueue(16);
        System.out.println(arrayQueue.size());
        arrayQueue.print();
        arrayQueue.take();
        arrayQueue.print();
    }
}
