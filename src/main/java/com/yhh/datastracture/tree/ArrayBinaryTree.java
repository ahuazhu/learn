package com.yhh.datastracture.tree;

public class ArrayBinaryTree<T> {
    private Object[] treeSq=new Object[10];
    int count=0;
    public int size() {
        return count;
    }
    public void setRoot(Object element){
        treeSq[0]=element;
        count++;
    }
    public void addLeftChild(int index,Object element){
        treeSq[index*2+1]=element;
        count++;
    }
    public void addRightChild(int index,Object element){
        treeSq[index*2+2]=element;
        count++;
    }
    public void delete(int index){
        if (index<treeSq.length){
            treeSq[index]=null;
            count--;
            delete(index*2+1);
            delete(index*2+2);
        }
    }
    public int depth(int index){
        if (treeSq[0]==null){
            return 0;
        }else{
            if(index<treeSq.length){
                int leftDepth=depth(index*2+1);
                int rightDepth=depth(index*2+2);
                if (leftDepth>rightDepth){
                    return leftDepth+1;
                }else{
                    return rightDepth+1;
                }
            }
            return -1;
        }
    }
    public void print(){
        for (int i = 0; i < treeSq.length; i++) {
            System.out.print(treeSq[i]+"\t");
        }
        System.out.println();
    }
}
