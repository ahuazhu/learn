package com.yhh.datastracture;


public class LinkStack<T> implements Stack<T>{

    private class Node {
        private T value1;
        private Node next1;

        public T getValue1() {
            return value1;
        }

        public void setValue1(T value1) {
            this.value1 = value1;
        }

        public Node getNext1() {
            return next1;
        }

        public void setNext1(Node next1) {
            this.next1 = next1;
        }
    }

    Node head=null;
    int count=0;
    //O(1)
    public void push(T value){
        Node node_01=new Node();
        node_01.setValue1(value);
        if (count==0){
        }else{
            Node next=head;
            node_01.setNext1(next);
        }
        head=node_01;
        count++;
    }
    //O(1)
    public T pop(){
        T element=head.getValue1();
        if (count==1){
            head=null;
        }else{
            head=head.getNext1();
        }
        count--;
        System.out.println("删除的元素为："+element);
        return element;
    }
    //O(1)
    public T peek(){
        System.out.println("Stack中第一个元素为："+head.getValue1());
        return head.getValue1();
    }
    //O(1)
    public int size(){
        return count;
    }
    //O(n)
    public void print(){
        Node next=head;
        for (int i = 0; i < count; i++) {
            System.out.print(next.getValue1()+"\t");
            next=next.getNext1();
        }
        System.out.println();
    }



    public static void main(String[] args) {
        LinkStack linkStack=new LinkStack();
        linkStack.push("S");
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
