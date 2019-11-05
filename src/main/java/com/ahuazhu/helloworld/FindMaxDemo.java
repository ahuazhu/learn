package com.ahuazhu.helloworld;

import java.awt.*;

public class FindMaxDemo {
    public static Comparable findMax(Comparable[] arr){
        int maxIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex])>0){
                maxIndex=i;
            }
        }
        return arr[maxIndex];
    }

    public static void main(String[] args) {
        String[] st1={"Joe","Bob","Bill","Zeke"};
        System.out.println(findMax(st1));
    }
}
