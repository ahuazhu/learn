package com.yhh.datastracture;

import com.obnormal.MyException;

class LinkNode{
    private int value;
    private LinkNode next;

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public LinkNode getNext() {
        return next;
    }
}
public class LinkedList implements List{
    LinkNode head=null;
    int count=0;

    public int size(){
        return count;
    }
    public void print(){
        LinkNode p=head;
        for (int i = 0; i < count; i++) {
            System.out.print(p.getValue()+"\t");
            p=p.getNext();
        }
        System.out.println();
    }
    public void append(int element){
        LinkNode node=new LinkNode();
        node.setValue(element);
        if(head==null){
            head=node;
            count++;
        }else{
            LinkNode p=head;
            while (p.getNext()!=null){
                p=p.getNext();
            }
            p.setNext(node);
            count++;
        }
    }
    public void insert(int element,int index)throws Exception {
        LinkNode node=new LinkNode();
        node.setValue(element);
        if (head==null){
            head=node;
            count++;
        } else{
            LinkNode p=head;
            LinkNode p2=p.getNext();
            if (index==0){
                head=node;
                node.setNext(p);
                count++;
            }else if (index<=count){
                for (int i = 1; i <index; i++) {
                    p=p.getNext();
                    p2=p2.getNext();
                }
                p.setNext(node);
                node.setNext(p2);
                count++;
            }else {
                throw new MyException("index超出链表长度");
            }
        }
    }

    public static void main(String[] args)  {
        LinkedList list=new LinkedList();
        System.out.println(list.size());
        list.print();
        list.append(33);
        list.append(22);
        list.append(34);
        list.append(36);
        System.out.println(list.size());
        list.print();
        try {
            list.insert(23, 4);
        }catch (Exception e){
            System.out.println(e);
        }
        list.print();
    }
}
