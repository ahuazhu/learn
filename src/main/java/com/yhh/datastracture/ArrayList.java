package com.yhh.datastracture;

public class ArrayList implements List {

    /* 存储元素的数组 */
    private int[] array = new int[4];

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
    */
    public void append(int element) {
        if(count<array.length){
            array[count]=element;
            count++;
        }else{
            int newArray[]=new int[array.length*2];
            for (int i = 0; i < array.length; i++) {
                newArray[i]=array[i];
            }
            newArray[count]=element;
            count ++;
            array=newArray;
        }
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

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
    public void remove(int index){
        if (index<count){
            for (int i=index;i<count;i++){
                array[i]=array[i+1];
            }
            count--;
        }
    }
    public int getIndexOf(int value){
        int s=0;//表示数组的下标
        for (int i = 0; i < count; i++) {
            if (array[i]==value){
                s=i;
                break;
            }else{
                s=-1;
            }
        }
        return s;
    }
    public int get(int index){
        if (index<count){
            return array[index];
        }else{
            return -1;
        }

    }
    public int gettail(){
        return array[count-1];
    }
    public int gethead(){
        return array[0];
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.append(8);
        list.append(7);
        list.print();
        list.append(2);
        list.append(3);
        list.append(2);
        System.out.println(list.size());
        list.print();
        System.out.println(list.getIndexOf(2));
        System.out.println(list.get(1));
        list.remove(1);
        list.print();
        list.insert(2,4);
        list.print();
        list.insert(4,8);
        list.print();
    }

}
