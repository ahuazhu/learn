package com.yhh.datastracture.tree;

public class LinkedBinaryTreeNode<T> {
    private T value;
    private LinkedBinaryTreeNode<T> leftChild;
    private LinkedBinaryTreeNode<T> rightChild;

    public LinkedBinaryTreeNode(T value) {
        this.value = value;
    }

    public LinkedBinaryTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(LinkedBinaryTreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public LinkedBinaryTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(LinkedBinaryTreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}