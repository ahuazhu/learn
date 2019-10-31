package com.yhh.datastracture.sort;

public class QuickSorter<T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] array) {
        qSort(array, 0, array.length - 1);
    }

    private void qSort(T[] array, int low, int high) {
        if (low < high) {
            T pivotkey = array[low];
            int pivotloc = partition(array, low, high, pivotkey);
            qSort(array, low, pivotloc);
            qSort(array, pivotloc + 1, high);
        }
    }

    private int partition(T[] array, int low, int high, T pivotkey) {
        while (low != high) {
            while (low < high && array[high].compareTo(pivotkey) >= 0) {
                high--;
            }
            swap(array, low, high);
            while (low < high &&  array[low].compareTo(pivotkey) <= 0 ) {
                low++;
            }
            swap(array, low, high);
        }
        return low;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
