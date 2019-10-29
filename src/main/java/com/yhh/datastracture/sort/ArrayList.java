package com.yhh.datastracture.sort;

public class ArrayList implements List {
    private int[] array = new  int[4];

    /* 当前以及插入的元素个数 */
    private int count = 0;

    /*
     返回元素的个数
     */
    public int size() {
        return count;
    }
    /*
     *增加一个元素在当前List的尾部
     * o(1)
     */
    public void append(int element) {
        if(count>=array.length){
            resize();
        }
        array[count++]=element;
    }

    //O(n)
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
    //O(n)
    public void insert(int index, int element) {
        if (count<array.length){
            count++;
            for (int i=count-1;i>index;i--){
                array[i]=array[i-1];
            }
            array[index]=element;
        }else{
            int newArray[]=new int[array.length*2];
            for (int i = 0; i < index; i++) {
                newArray[i]=array[i];
            }
            newArray[index]=element;
            for (int i = index+1; i <count; i++) {
                newArray[i]=array[i];
            }
            count++;
            array=newArray;
        }
    }
    //O(n)
    public void remove(int index){
        if (index<count){
            for (int i=index;i<count;i++){
                array[i]=array[i+1];
            }
            count--;
        }
    }
    //O(n)
    public int getIndexOf(int value){
        for (int i = 0; i < count; i++) {
            if (array[i]==value){
                return i;
            }
        }
        return -1;
    }
    //O(1)
    public int get(int index){
        if (index<count){
            return array[index];
        }else{
            throw new IndexOutOfBoundsException();
        }

    }
    public void resize(){
        int newArray[]=new int[array.length*2];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }
    public int gettail(){
        return array[count-1];
    }//O(1)
    public int gethead(){
        return array[0];
    }//O(1)

    //每次将最小的数放置前列
    // select sort
    public void sort1(){
        for (int i = 0; i < count; i++) {
            int minValue = array[i];
            int minValueIndex = i;

            for (int j = i + 1; j < count; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minValueIndex = j;
                }
            }
            swap(i, minValueIndex);
        }
    }

    private void swap(int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    //比较相邻的两个数。将最大的数放置数组最后
    public void sort2(){
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count-i-1; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }


    public void insertSort() {
        for (int i =1; i < count; i ++ ) {
            insertElement(i);
        }
    }

    private void insertElement(int i) {
        int to = findRoom(array, i - 1, array[i]);
        int value = array[i];
        if (array[i-1]>array[i]) {
            moveToNext(to, i - 1);
            array[to] = value;
        }
    }
    private void moveToNext(int to,int end){
        for (int i = end; i >=to; i--) {
            array[i+1]=array[i];
        }
    }

    private int findRoom(int[] array,  int end, int value) {
        int index = 0;
        for (int i = 0; i <= end; i ++) {
            index = i;
            if (array[i] > value) {
                break;
            }
        }
        return index;
    }

    public void sort(){
        qSort(array,0,count-1);
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
    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(4);
        list.append(6);
        list.print();
        list.sort();
        list.print();
    }

    //O(n)
    public boolean equals(ArrayList l2) {
        ArrayList l1 = this;
        if (l1.count!=l2.count){
            return false;
        }else{
            for (int i = 0; i < count; i++) {
                if (l1.get(i)!=l2.get(i)){
                    return false;
                }
            }
            return true;
        }
    }
}

