package com.yhh.datastracture.tree;

public class LinkedNodeSumVisitor<T extends Number> implements LinkedNodeVisitor<T> {
    private Integer acc = 0;

    @Override
    public void accept(LinkedBinaryTreeNode<T> node) {
        acc += (Integer) node.getValue();

    }

    public Integer getSum() {
        return acc;
    }
}
