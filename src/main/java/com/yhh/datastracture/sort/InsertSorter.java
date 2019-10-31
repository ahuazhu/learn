package com.yhh.datastracture.sort;

import com.yhh.datastracture.ListUtils;

public class InsertSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] array) {
        int count = array.length;
        for (int i =1; i < count; i ++ ) {
            insertElement(i,array);
        }
        ListUtils.print(array);
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
}
