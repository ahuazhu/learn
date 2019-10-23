package com.yhh.datastracture;

public class ArrayStack implements List_01 {
    private int array[]=new int[4];
    private int count=0;//计数当前数组元素的个数

    public int size(){
        return count;
    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public void push(int value){
        if (count==0){
            array[0]=value;
            count++;
        }else if(count<array.length){
            for (int i=count;i>0;i--){
                array[i]=array[i-1];
            }
            array[0]=value;
            count++;
        }else{
            int newArray[]=new int[array.length*2];
            for (int i = 0; i < count; i++) {
                newArray[i]=array[i];
            }
            for (int i = count; i >0 ; i--) {
                newArray[i]=newArray[i-1];
            }
            newArray[0]=value;
            count++;
            array=newArray;

        }
    }

    public int pop(){
        int frist=array[0];
        for (int i = 0; i < count; i++) {
            array[i]=array[i+1];
        }
        count--;
        System.out.println("删除的元素为："+frist);
        return frist;
    }
    public int peek(){
        System.out.println("Stack中第一个元素为："+array[0]);
        return array[0];
    }

    public static void main(String[] args) {
        ArrayStack arrayStack=new ArrayStack();
        arrayStack.push(23);
        arrayStack.push(24);
        arrayStack.push(25);
        arrayStack.push(26);
        arrayStack.push(27);
        arrayStack.print();
        arrayStack.pop();
        arrayStack.print();
        arrayStack.peek();
    }
}
