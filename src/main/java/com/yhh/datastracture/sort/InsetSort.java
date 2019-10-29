package com.yhh.datastracture.sort;

public class InsetSort {
        public void sort(int[] array){
            qSort(array,0,array.length-1);
            print(array);
        }
        private void qSort(int[] array,int low,int high){
            if (low<high){
                int pivotkey=array[0];
                int pivotloc=partition(array,low,high,pivotkey);
                qSort(array,low,pivotloc);
                qSort(array,pivotloc+1,high);
            }
        }
        private int partition(int[] array,int low,int high,int pivotkey){
            while (low!=high){
                while (low<high&&array[high]>=pivotkey){
                    high--;
                }
                swap(array,low,high);
                while (low<high&&array[low]<=pivotkey){
                    low++;
                }
                swap(array,low,high);
            }
            return low;
        }
        private void swap(int[] array,int i, int j) {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        private void print(int[] array){
            for (int i :array) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] array={49,38,13,22,23,45,69};
            InsetSort insetSort=new InsetSort();
            insetSort.sort(array);
        }
    }


