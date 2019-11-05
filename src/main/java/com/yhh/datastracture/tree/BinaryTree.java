package com.yhh.datastracture.tree;

import com.yhh.datastracture.ArrayQueue;
import com.yhh.datastracture.Queue;


public class BinaryTree<T> {

    private LinkedBinaryTreeNode<T> root;

    public LinkedBinaryTreeNode<T> setRoot(T value) {
        root = new LinkedBinaryTreeNode<T>(value);
        return root;
    }

    public LinkedBinaryTreeNode<T> insertLeftChild(LinkedBinaryTreeNode<T> node, T value) {
        LinkedBinaryTreeNode<T> node1 = new LinkedBinaryTreeNode<T>(value);
        node.setLeftChild(node1);
        return node1;
    }

    public LinkedBinaryTreeNode<T> insertRightChild(LinkedBinaryTreeNode<T> node, T value) {
        LinkedBinaryTreeNode<T> node2 = new LinkedBinaryTreeNode<T>(value);
        node.setRightChild(node2);
        return node2;
    }

    public void PreOrderTraverse(LinkedBinaryTreeNode<T> node, LinkedNodeVisitor visitor) {
        if (node != null) {
            visitor.accept(node);
            PreOrderTraverse(node.getLeftChild(), visitor);
            PreOrderTraverse(node.getRightChild(), visitor);
        }
    }

    public void InOrderTraverse(LinkedBinaryTreeNode<T> node) {
        if (node != null) {
            InOrderTraverse(node.getLeftChild());
            System.out.print(node.getValue() + "\t");
            InOrderTraverse(node.getRightChild());
        }
    }

    public void PostOrderTraverse(LinkedBinaryTreeNode<T> node) {
        if (node != null) {
            PostOrderTraverse(node.getLeftChild());
            PostOrderTraverse(node.getRightChild());
            System.out.print(node.getValue() + "\t");
        }
    }

    public int biTreeDepth(LinkedBinaryTreeNode<T> root) {
        if (root == null) {
            return 0;
        } else {
            int rightDepth = biTreeDepth(root.getLeftChild());
            int leftDepth = biTreeDepth(root.getRightChild());
            if (rightDepth > leftDepth) {
                return rightDepth + 1;
            } else {
                return leftDepth + 1;
            }
        }
    }

    public LinkedBinaryTreeNode<T> findParent(LinkedBinaryTreeNode<T> node) {
        return findParent(root, node);
    }

    /**
     * 给定一个节点subRoot， 以此节点为根节点的子树中，找到一个节点n，他的leftChild或rightChild为node，如果n存在返回n，否则返回null
     *
     * @param subRoot
     * @param node
     * @return
     */
    public LinkedBinaryTreeNode<T> findParent(LinkedBinaryTreeNode<T> subRoot, LinkedBinaryTreeNode<T> node) {

        if (subRoot == null) {
            return null;
        }

        if (subRoot.getLeftChild() == node || subRoot.getRightChild() == node) {
            return subRoot;
        }

        LinkedBinaryTreeNode<T> parent = findParent(subRoot.getLeftChild(), node);
        if (parent != null) {
            return parent;
        }

        parent = findParent(subRoot.getRightChild(), node);

        if (parent != null) {
            return parent;
        }
        return null;
    }

    /**
     * 传入一个节点node，删除节点node以及它的子树
     *
     * @param node
     */
    public void delete(LinkedBinaryTreeNode<T> node) {
        if (node == root) {
//            if (node.getLeftChild() != null) {
//                node.setLeftChild(null);
//            }
//            if (node.getRightChild() != null) {
//                node.setRightChild(null);
//            }
            root = null;
        } else {
            LinkedBinaryTreeNode<T> parent = findParent(node);
            if (parent.getLeftChild() == node) {
                parent.setLeftChild(null);
            }
            if (parent.getRightChild() == node) {
                parent.setRightChild(null);
            }
        }
    }

    /**
     * 用队列实现树以层序的方式遍历
     */
    public void LevelTraverse() {
        if (root == null) {
            return;
        }
        Queue<LinkedBinaryTreeNode> queue = new ArrayQueue<LinkedBinaryTreeNode>();
        queue.enqueue(root);
        while (queue.size() > 0) {
            LinkedBinaryTreeNode node = queue.take();
            System.out.print(node.getValue() + "\t");
            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }
        System.out.println();
    }

    /**
     * 传入一个节点node和一个值value，找到当前节点node并赋值为value，然后返回当前节点的值
     *
     * @param node
     * @return
     */
    public T findNodeValue(LinkedBinaryTreeNode<T> node, T value) {
        node.setValue(value);
        return node.getValue();
    }

    //返回当前树节点的个数
    public int size() {
        LinkedNodeCountVisitor visitor = new LinkedNodeCountVisitor();
        this.PreOrderTraverse(root, visitor);
        return visitor.getCount();
    }

    //比较节点数相同并且以node1为根节点的树1和以node2位根节点的树2是否相等
    public boolean compare(LinkedBinaryTreeNode<T> node1, LinkedBinaryTreeNode<T> node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 != null && node2 != null && node1.getValue() == node2.getValue()) {
            return compare(node1.getLeftChild(), node2.getLeftChild())
                    && compare(node1.getRightChild(), node2.getRightChild());
        }
        return false;

    }

    /**
     * 比较两棵树是否相等
     *
     * @param tree2
     * @return
     */
    public boolean equals(BinaryTree tree2) {
            return compare(this.root, tree2.root);
    }
}
