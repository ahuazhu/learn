package com.yhh.datastracture;

public class LinkedList<T> implements List<T> {
    private static class LinkNode<T> {
        private T value;
        private LinkNode next;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public LinkNode getNext() {
            return next;
        }

        public void setNext(LinkNode next) {
            this.next = next;
        }
    }
    LinkNode head = null;
    int count = 0;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //System.out.println(list.size());
        //list.print();
        list.append(33);
        list.append(22);
        list.append(34);
        list.append(23);
        System.out.println(list.size());
        list.print();
        try {
            list.insert(23, 3);
            list.print();
        } catch (Exception e) {
            System.out.println(e);
        }
        list.remove(4);
        list.print();
        LinkedList l2=new LinkedList();
        l2.append(33);
        l2.append(22);
        l2.append(34);
        l2.append(23);

        list.print();
        l2.print();
        System.out.println(list.equals(l2));
        System.out.println(list.getIndexOf(23));
    }
    //O(1)
    public int size() {
        return count;
    }
    //O(n)
    public void print() {
        LinkNode p = head;
        for (int i = 0; i < count; i++) {
            System.out.print(p.getValue() + "\t");
            p = p.getNext();
        }
        System.out.println();
    }
    //O(n)
    public void append(T element) {
        LinkNode node = new LinkNode();
        node.setValue(element);
        if (head == null) {
            head = node;
        } else {
            LinkNode p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(node);
        }
        count++;
    }
    //O(n)
    public void insert(int index,T element) throws Exception {
        LinkNode<T> node = new LinkNode<T>();
        node.setValue(element);
        if (head == null) {
            head = node;
            count++;
        } else {
            LinkNode pre = head;
            if (index == 0) {
                head = node;
                node.setNext(pre);
                count++;
            } else if (index < count) {
                for (int i = 0; i < index - 1; i++) {
                    pre = pre.getNext();
                }
                LinkNode next = pre.getNext();
                pre.setNext(node);
                node.setNext(next);
                count++;
            } else {
                throw new Exception("index超出链表长度");
            }
        }
    }
    public int getIndexOf(T value){
        LinkNode p=head;
        int index=0;
        for (int i = 0; i < count; i++) {
            if (p.getValue().equals(value)){
                index=i;
                break;
            }else{
                index=-1;
            }
            p=p.getNext();
        }
        return index;
    }

    public T get(int index){
        LinkNode p=head;
        for (int i = 0; i < index; i++) {
            p=p.getNext();
        }
        return (T)p.getValue();
    }

    public T gettail(){
        return (T)head.getValue();
    }

    public T gethead(){
        LinkNode p=head;
        for (int i = 0; i < count; i++) {
            p=p.getNext();
        }
        return (T)p.getValue();
    }

    //O(n)
    public void remove(int index) {
        if (count == 1) {
            head = null;
            count--;
        } else if (index < count) {
            if (index == 0) {
                head = head.getNext();
                count--;
            } else {
                LinkNode pre = head;

                for (int i = 0; i < index -1 ; i++) {
                    pre = pre.getNext();
                }
                LinkNode toRemove = pre.getNext();
                LinkNode next = toRemove.getNext();

                pre.setNext(next);
                count--;
            }
        }
    }

    public boolean equals(LinkedList l2) {
        LinkedList l1 = this;
        if (l1.count!=l2.count){
            return false;
        }else{
            LinkNode p1=l1.head;
            LinkNode p2=l2.head;

            for (int i = 0; i < count; i++) {
                if (!(p1.getValue().equals(p2.getValue()))){
                    return false;
                } else {
                    p1 = p1.getNext();
                    p2 = p2.getNext();
                }
            }

            return true;
        }
    }
}
