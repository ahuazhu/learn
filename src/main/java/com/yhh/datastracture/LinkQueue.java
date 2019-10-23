package com.yhh.datastracture;

class LinkNode_03{
    private int value;
    private LinkNode_03 next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkNode_03 getNext() {
        return next;
    }

    public void setNext(LinkNode_03 next) {
        this.next = next;
    }
}
public class LinkQueue implements List_02{
    LinkNode_03 head=null;
    int count=0;
    public int size(){
        return count;
    }
    public void print(){
        LinkNode_03 next=head;
        for (int i = 0; i < count; i++) {
            System.out.print(next.getValue()+"\t");
            next=next.getNext();
        }
        System.out.println();
    }
    public void enqueue(int value){
        LinkNode_03 node_03=new LinkNode_03();
        node_03.setValue(value);
        if (count==0){
            head=node_03;
            count++;
        }else{
            LinkNode_03 next=head;
            head=node_03;
            node_03.setNext(next);
            count++;
        }
    }
    public int take(){
        if (count==1){
            LinkNode_03 next=head;
            head=null;
            System.out.println("取出的元素为："+next.getValue());
            count--;
            return next.getValue();
        }else{
            LinkNode_03 pre=head;
            for (int i = 0; i < count-1; i++) {
                pre=pre.getNext();
            }
            LinkNode_03 next=pre;
            pre.setNext(null);
            System.out.println("取出的元素为："+next.getValue());
            count--;
            return next.getValue();

        }


    }

    public static void main(String[] args) {
        LinkQueue linkQueue=new LinkQueue();
        linkQueue.enqueue(45);
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
