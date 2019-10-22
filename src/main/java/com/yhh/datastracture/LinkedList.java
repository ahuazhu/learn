package com.yhh.datastracture;



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
            }else if (index<count){
                for (int i = 1; i <index-1; i++) {
                    p=p.getNext();
                    p2=p2.getNext();

                }
                p.setNext(node);
                node.setNext(p2);
                count++;
            }else {
                throw new Exception("index超出链表长度");
            }
        }
    }
    public void remove(int index){
        LinkNode p=head;
        LinkNode p1=p.getNext();
        LinkNode p2 =p1.getNext();
            if (count==1){
            head=null;
            count--;
        }else if (index<count){
                if (index==0){
                    head=p1;
                    count--;
                }else {
                    for (int i = 1; i < index; i++) {
                        p=p.getNext();
                        p1=p1.getNext();
                        p2=p2.getNext();
                    }
                    p.setNext(p2);
                    count--;
                }
        }
    }

    public static void main(String[] args)  {
        LinkedList list=new LinkedList();
        //System.out.println(list.size());
        //list.print();
        list.append(33);
        list.append(22);
        list.append(34);
        list.append(36);
        System.out.println(list.size());
        list.print();
        try {
            list.insert(23, 3);
            list.print();
        }catch (Exception e){
            System.out.println(e);
        }
        list.remove(4);
        list.print();

    }
}
