package com.yhh.datastracture.sort;

public class BubbleSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] array) {
        int count = array.length;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count-i-1; j++) {
                if(array[j].compareTo(array[j+1]) > 0){
                    T temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public void insertSort(T[] array) {
        int count = array.length;
        for (int i =1; i < count; i ++ ) {
            insertElement(i,array);
        }
        print(array);
    }
    private void insertElement(int i,T[] array) {
        int to = findRoom(array, i - 1, array[i]);
        T value = array[i];
        if (array[i-1].compareTo(array[i])>0) {
            moveToNext(array, to, i - 1);
            array[to] = value;
        }
    }
    private void moveToNext(T[] array,int to,int end){
        for (int i = end; i >=to; i--) {
            array[i+1]=array[i];
        }
    }

    private int findRoom(T[] array,  int end, T value) {
        int index = 0;
        for (int i = 0; i <= end; i ++) {
            index = i;
            if (array[i].compareTo(value)>0) {
                break;
            }
        }
        return index;
    }
    public void print(T[] array){
        for (T i:array) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Comparable[] array={23,33,14,35,67,99,1};
        BubbleSorter bubbleSorter=new BubbleSorter();
        bubbleSorter.insertSort(array);
    }
}
