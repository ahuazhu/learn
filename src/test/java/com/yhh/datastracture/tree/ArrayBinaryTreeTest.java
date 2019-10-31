package com.yhh.datastracture.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayBinaryTreeTest {

    @Test
    public void print() {
        ArrayBinaryTree tree=new ArrayBinaryTree();
        tree.setRoot(1);
        tree.addLeftChild(0,2);
        tree.addRightChild(0,3);
        tree.addLeftChild(1,4);
        tree.addRightChild(1,5);
        tree.addLeftChild(2,6);
        tree.addRightChild(2,7);
        System.out.println(tree.size());
        tree.print();
        tree.delete(2);
        System.out.println(tree.size());
        tree.print();
        System.out.println(tree.depth(0));
    }
}