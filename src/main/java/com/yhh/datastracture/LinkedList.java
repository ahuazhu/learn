package com.yhh.datastracture;


class LinkNode {
    private int value;
    private LinkNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}

public class LinkedList implements List {
    LinkNode head = null;
    int count = 0;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
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
        } catch (Exception e) {
            System.out.println(e);
        }
        list.remove(4);
        list.print();

        list.remove(2);

        list.print();

        list.remove(0);

        list.print();

        list.remove(2);

        list.print();

        list.remove(1);
        list.print();

        list.remove(0);
        list.print();

    }

    public int size() {
        return count;
    }

    public void print() {
        LinkNode p = head;
        for (int i = 0; i < count; i++) {
            System.out.print(p.getValue() + "\t");
            p = p.getNext();
        }
        System.out.println();
    }

    public void append(int element) {
        LinkNode node = new LinkNode();
        node.setValue(element);
        if (head == null) {
            head = node;
            count++;
        } else {
            LinkNode p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(node);
            count++;
        }
    }

    public void insert(int element, int index) throws Exception {
        LinkNode node = new LinkNode();
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
}
