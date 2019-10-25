package com.yhh.datastracture;

public class ArrayList<T> implements List<T> {

    /* 存储元素的数组 */
    private Object[] array = new  Object[4];

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
    public void append(T element) {
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
    public void insert(int index, T element) {
            if (count<array.length){
                count++;
                for (int i=count-1;i>index;i--){
                    array[i]=array[i-1];
                }
                array[index]=element;
            }else{
                Object newArray[]=new Object[array.length*2];
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
    public int getIndexOf(T value){
        int s=0;//表示数组的下标
        for (int i = 0; i < count; i++) {
            if (array[i].equals(value)){
                s=i;
                break;
            }else{
                s=-1;
            }
        }
        return s;
    }
    //O(1)
    public T get(int index){
        if (index<count){
            return (T) array[index];
        }else{
            throw new IndexOutOfBoundsException();
        }

    }
    public void resize(){
        Object newArray[]=new Object[array.length*2];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }
    public T gettail(){
        return (T) array[count-1];
    }//O(1)
    public T gethead(){
        return (T) array[0];
    }//O(1)



    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        list.append(8);
        list.append(7);
        list.append("s");
        list.append(3);
        list.append(2);
        System.out.println(list.size());
        list.print();
        System.out.println(list.getIndexOf("s"));
        System.out.println(list.get(1));
        list.remove(1);
        list.print();
        list.insert(2,4);
        list.print();
        list.insert(4,8);
        list.print();
        ArrayList l2=new ArrayList();
        l2.append(8);
        l2.append("s");
        l2.append(4);
        l2.append(3);
        l2.append(8);
        //l2.append(4);
        System.out.println(list.equals(l2));
    }

    //O(n)
    public boolean equals(ArrayList l2) {
        ArrayList l1 = this;
        if (l1.count!=l2.count){
            return false;
        }else{
            for (int i = 0; i < count; i++) {
                if (!(l1.get(i).equals(l2.get(i)))){
                    return false;
                }
            }
            return true;
        }
    }
}
