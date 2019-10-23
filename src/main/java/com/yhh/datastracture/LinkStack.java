package com.yhh.datastracture;

class LinkNode_01{
    private int value1;
    private LinkNode_01 next1;

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public LinkNode_01 getNext1() {
        return next1;
    }

    public void setNext1(LinkNode_01 next1) {
        this.next1 = next1;
    }
}
public class LinkStack implements List_01{
    LinkNode_01 head=null;
    int count=0;
    public void push(int value){
        LinkNode_01 node_01=new LinkNode_01();
        node_01.setValue1(value);
        if (count==0){
            head=node_01;
            count++;
        }else{
            LinkNode_01 next=head;
            head=node_01;
            node_01.setNext1(next);
            count++;
        }
    }
    public int pop(){
        int element=0;
        element=head.getValue1();
        if (count==1){
            head=null;
            count--;
        }else{
            head=head.getNext1();
            count--;
        }
        System.out.println("删除的元素为："+element);
        return element;
    }
    public int peek(){
        System.out.println("Stack中第一个元素为："+head.getValue1());
        return head.getValue1();
    }
    public int size(){
        return count;
    }
    public void print(){
        LinkNode_01 next=head;
        for (int i = 0; i < count; i++) {
            System.out.print(next.getValue1()+"\t");
            next=next.getNext1();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkStack linkStack=new LinkStack();
        linkStack.push(12);
        linkStack.push(13);
        linkStack.push(14);
        linkStack.push(15);
        System.out.println(linkStack.size());
        linkStack.print();
        System.out.println(linkStack.peek());
        linkStack.pop();
        linkStack.print();
    }
}
