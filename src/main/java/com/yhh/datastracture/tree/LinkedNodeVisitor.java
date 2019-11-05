package com.yhh.datastracture.tree;

public interface LinkedNodeVisitor<T> {
    void accept(LinkedBinaryTreeNode<T> node);
}
