package com.yhh.datastracture;

public class ArrayStack<T> implements Stack<T> {
    private Object array[]=new Object[4];
    private int count=0;//计数当前数组元素的个数

    public int size(){
        return count;
    }//O(1)
    //O(n)
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    //O(1)
    public void push(T value){
        if (count<array.length){
            array[count++]=value;
        }else{
            Object newArray[]=new Object[array.length*2];
            for (int i = 0; i < count; i++) {
                newArray[i]=array[i];
            }
            newArray[count++]=value;
            array=newArray;

        }
    }
    //O(1)
    public T pop(){
        T frist=(T)array[count-1];
        count--;
        System.out.println("删除的元素为："+frist);
        return frist;
    }
    //O(1)
    public T peek(){
        System.out.println("Stack中表头个元素为："+array[count-1]);
        return (T)array[count-1];
    }

    public static void main(String[] args) {
        ArrayStack arrayStack=new ArrayStack();
        arrayStack.push("S");
        arrayStack.push(24);
        arrayStack.push(25);
        arrayStack.push(26);
        arrayStack.push(27);
        arrayStack.print();
        System.out.println(arrayStack.pop());
        arrayStack.print();
        arrayStack.peek();
    }
}
