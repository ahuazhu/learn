package com.yhh.datastracture.tree;

class BinaryTreeNode<T>{
    private T value;
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T value){
        this.value=value;
    }

    public BinaryTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode<T> getRightChild() {
        return rightChild;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeftChild(BinaryTreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(BinaryTreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }
}
public class BinaryTree<T> {

    BinaryTreeNode<T> root ;

    public BinaryTreeNode<T> BinaryTree(T value){
        root=new BinaryTreeNode<T>(value);
        return root;
    }

    public BinaryTreeNode<T> insertLeftChild(BinaryTreeNode<T> node, T value) {
        BinaryTreeNode<T> node1 = new BinaryTreeNode<T>(value);
        node.setLeftChild(node1);
        return node1;
    }

    public BinaryTreeNode<T> insertRightChild(BinaryTreeNode<T> node, T value) {
        BinaryTreeNode<T> node2 = new BinaryTreeNode<T>(value);
        node.setRightChild(node2);
        return node2;
    }

    public void PreOrderTraverse(BinaryTreeNode<T> node) {
        if (node != null) {
            System.out.print(node.getValue() + "\t");
            PreOrderTraverse(node.getLeftChild());
            PreOrderTraverse(node.getRightChild());
        }
    }

    public void InOrderTraverse(BinaryTreeNode<T> node) {
        if (node != null) {
            InOrderTraverse(node.getLeftChild());
            System.out.print(node.getValue() + "\t");
            InOrderTraverse(node.getRightChild());
        }
    }

    public void PostOrderTraverse(BinaryTreeNode<T> node) {
        if (node != null) {
            PostOrderTraverse(node.getLeftChild());
            PostOrderTraverse(node.getRightChild());
            System.out.print(node.getValue() + "\t");
        }
    }

    public int BiTreeDepth(BinaryTreeNode<T> root) {
        if (root == null) {
            return 0;
        } else {
            int rightDepth = BiTreeDepth(root.getLeftChild());
            int leftDepth = BiTreeDepth(root.getRightChild());
            if (rightDepth > leftDepth) {
                return rightDepth + 1;
            } else {
                return leftDepth + 1;
            }
        }
    }

    public BinaryTreeNode<T> findParent(BinaryTreeNode<T> node, T value) {
        if (node != null) {
            if (node.getLeftChild() != null && node.getLeftChild().getValue() == value) {
                return node;
            } else if (node.getRightChild() != null && node.getRightChild().getValue() == value) {
                return node;
            }
        }
        if (node.getLeftChild() != null) {
            return findParent(node.getLeftChild(), value);
        }
        if (node.getRightChild() != null) {
            return findParent(node.getRightChild(), value);
        }
        return null;
    }

    public void deleteLe(T value) {
        BinaryTreeNode<T> parent = findParent(root, value);
        if (root.getValue()==value) {
            root=null;
        }else if (parent.getLeftChild().getValue() == value) {
                parent.setLeftChild(null);
            } else if (parent.getRightChild().getValue() == value) {
                parent.setRightChild(null);
            }
        }
    }
