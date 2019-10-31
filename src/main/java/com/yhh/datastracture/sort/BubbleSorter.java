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
}
