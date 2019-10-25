package com.yhh.datastracture;

public class LinkQueue<T> implements Queue<T> {

    private  class Node {
        private  T value;
        private Node next;

        public  T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node head=null;
    int count=0;
    public int size(){
        return count;
    }//O(1)
    //O(n)
    public void print(){
        Node next=head;
        for (int i = 0; i < count; i++) {
            System.out.print(next.getValue()+"\t");
            next=next.getNext();
        }
        System.out.println();
    }
    //O(1)
    public void enqueue(T value){
        Node node_03=new Node();
        node_03.setValue(value);
        if (count==0){
        }else{
            Node next=head;
            node_03.setNext(next);
        }
        head=node_03;
        count++;
    }
    //O(n)
    public T take(){
        if (count==1){
            Node next=head;
            head=null;
            System.out.println("取出的元素为："+next.getValue());
            count--;
            return next.getValue();
        }else{
            Node pre=head;
            for (int i = 0; i < count-1; i++) {
                pre=pre.getNext();
            }
            Node next=pre;
            pre.setNext(null);
            System.out.println("取出的元素为："+next.getValue());
            count--;
            return next.getValue();
        }
    }

    public static void main(String[] args) {
        LinkQueue linkQueue=new LinkQueue();
        linkQueue.enqueue("S");
        linkQueue.enqueue(46);
        linkQueue.enqueue(47);
        linkQueue.enqueue(48);
        linkQueue.enqueue(49);
        System.out.println(linkQueue.size());
        linkQueue.print();
        linkQueue.take();
        linkQueue.print();
    }

}
