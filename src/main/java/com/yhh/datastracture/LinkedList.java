package com.yhh.datastracture;

public class LinkedList<T extends Comparable> implements List<T> {
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
    LinkNode head=null;
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
        list.insertSort();
        list.print();
        System.out.println(list.contain(32));
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
    public void insert(int index,T element)  {
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
                throw new IndexOutOfBoundsException("index超出链表长度");
            }
        }
    }
    public int getIndexOf(T value){
        LinkNode p=head;
        for (int i = 0; i < count; i++) {
            if (p.getValue().equals(value)){
                return i;
            }
            p=p.getNext();
        }
        return -1;
    }
    public boolean contain(T value){
        LinkNode p=head;
        for (int i = 0; i < count; i++) {
            if (p.getValue().equals(value)){
                return true;
            }
            p=p.getNext();
        }
        return false;
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

    @Override
    public boolean equals(Object l2) {
        if (l2 == null || ! (l2 instanceof LinkedList)) {
            return false;
        }
        LinkedList l = (LinkedList) l2;
        LinkedList l1 = this;
        if (l1.count!=l.count){
            return false;
        }else{
            LinkNode p1=l1.head;
            LinkNode p2=l.head;

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

    public void insertSort(){
        for (int i = 0; i < count; i++) {
            insertElement(i);
        }
    }

    private void insertElement(int i){
        T value = get(i);
        int to=findRoom(i-1, value);
        if (to < i) {
            insert(to, value);
            remove(i + 1);
        }

    }

    private int findRoom(int end, T value){
        for (int i = 0; i <=end; i++) {
            if (get(i).compareTo(value) > 0){
                return i;
            }
        }
        return end + 1;
    }
}
