package com.yhh.datastracture.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void biTreeDepth() {
        BinaryTree tree=new BinaryTree();
        BinaryTreeNode node=tree.BinaryTree(1);
        BinaryTreeNode node2=tree.insertLeftChild(node,12);
        BinaryTreeNode node3=tree.insertRightChild(node,3);
        BinaryTreeNode node4=tree.insertLeftChild(node2,14);
        BinaryTreeNode node5=tree.insertRightChild(node2,5);
        BinaryTreeNode node6=tree.insertLeftChild(node3,16);
        BinaryTreeNode node7=tree.insertRightChild(node3,7);
        tree.PreOrderTraverse(node);
        System.out.println();
        System.out.println(tree.BiTreeDepth(node));
        Assert.assertEquals(tree.BiTreeDepth(node),3);
        tree.deleteLe(1);
        tree.PreOrderTraverse(node);
    }
}