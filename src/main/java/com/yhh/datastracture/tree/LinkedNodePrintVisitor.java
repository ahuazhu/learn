package com.yhh.datastracture.tree;

public class LinkedNodePrintVisitor<T> implements LinkedNodeVisitor<T> {
    @Override
    public void accept(LinkedBinaryTreeNode node) {
        System.out.print(node.getValue() + " ");
    }
}
