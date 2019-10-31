package com.yhh.datastracture;

public class ListUtils {

    public static void print(List l) {
        int size = l.size();
        for (int i = 0; i < size; i ++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
    }

    public static<T> void print(T[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
