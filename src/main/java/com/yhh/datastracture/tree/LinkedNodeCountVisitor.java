package com.yhh.datastracture.tree;

public class LinkedNodeCountVisitor<T> implements LinkedNodeVisitor{
    private int count = 0;
    @Override
    public void accept(LinkedBinaryTreeNode node) {
        count ++;
    }

    public int getCount() {
        return count;
    }
}
