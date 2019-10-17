package com.yhh.datastracture;

public class ArrayTest {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int arr2[]=new int[]{10,20,30,40,50,60};
        for (int a :arr2) {
            System.out.print(a+"\t");
        }
    }
}
