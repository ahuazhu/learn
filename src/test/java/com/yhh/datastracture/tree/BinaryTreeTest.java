package com.yhh.datastracture.tree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void biTreeDepth() {
        BinaryTree tree=new BinaryTree();
        LinkedBinaryTreeNode node=tree.setRoot(1);
        LinkedBinaryTreeNode node2=tree.insertLeftChild(node,12);
        LinkedBinaryTreeNode node3=tree.insertRightChild(node,3);
        LinkedBinaryTreeNode node4=tree.insertLeftChild(node2,14);
        LinkedBinaryTreeNode node5=tree.insertRightChild(node2,5);
        LinkedBinaryTreeNode node6=tree.insertLeftChild(node3,16);
        LinkedBinaryTreeNode node7=tree.insertRightChild(node3,7);
        tree.PreOrderTraverse(node, new LinkedNodePrintVisitor());
        System.out.println();

        LinkedNodeCountVisitor countVisitor = new LinkedNodeCountVisitor();
        tree.PreOrderTraverse(node, countVisitor);
        System.out.println(countVisitor.getCount());

        LinkedNodeSumVisitor sumVisitor = new LinkedNodeSumVisitor();
        tree.PreOrderTraverse(node,sumVisitor);
        System.out.println(sumVisitor.getSum());

//        System.out.println();
//        System.out.println(tree.BiTreeDepth(node));
//        Assert.assertEquals(tree.BiTreeDepth(node),3);
//        System.out.println(tree.findNodeValue(node2,13));
//        tree.LevelTraverse();
        tree.delete(node);
        tree.LevelTraverse();
        /*try{
            tree.LevelTraverse();
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }

    @Test
    public void size() {
        BinaryTree tree=new BinaryTree();
        LinkedBinaryTreeNode node=tree.setRoot(1);
        LinkedBinaryTreeNode node2=tree.insertLeftChild(node,12);
        LinkedBinaryTreeNode node3=tree.insertRightChild(node,3);
        LinkedBinaryTreeNode node4=tree.insertLeftChild(node2,14);
        LinkedBinaryTreeNode node5=tree.insertRightChild(node2,5);
        LinkedBinaryTreeNode node6=tree.insertLeftChild(node3,16);
        LinkedBinaryTreeNode node7=tree.insertRightChild(node3,7);

        Assert.assertEquals(7, tree.size());
        tree.delete(node3);
        Assert.assertEquals(4, tree.size());

    }

    @Test
    public void testEquals() {
        BinaryTree tree=new BinaryTree();
        LinkedBinaryTreeNode node=tree.setRoot(1);
        LinkedBinaryTreeNode node2=tree.insertLeftChild(node,12);
        LinkedBinaryTreeNode node3=tree.insertRightChild(node,3);
        LinkedBinaryTreeNode node4=tree.insertLeftChild(node2,14);
        LinkedBinaryTreeNode node5=tree.insertRightChild(node2,5);
        BinaryTree tree2=new BinaryTree();
        LinkedBinaryTreeNode node0=tree2.setRoot(1);
        LinkedBinaryTreeNode node02=tree2.insertLeftChild(node0,12);
        LinkedBinaryTreeNode node03=tree2.insertRightChild(node0,3);
        LinkedBinaryTreeNode node04=tree2.insertLeftChild(node02,14);
        LinkedBinaryTreeNode node05=tree2.insertRightChild(node02,5);
        System.out.println(tree.equals(tree2));
    }
}