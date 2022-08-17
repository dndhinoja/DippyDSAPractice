package com.dn.application.LeetCode.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    private static BST.Node head;
    int left = 0;
    int right = 0;
    public boolean symmetricTree(BST.Node root){

        if(root==null)
            return true;

        if(root.left==null && root.right!=null){
            return false;
        }
        if(root.right==null && root.left!=null){
            return false;
        }
        else {
            if(!symmetricTree(root.left))
                return false;

            if(!symmetricTree(root.right))
                return false;

        }
        return true;
    }

    public int maxDepthBST(BST.Node root){

        if(root==null){
            return 0;
        }

        int leftCount = 0;
        int rightCount = 0;
        BST.Node node1 = root;
        while (node1.left!=null){
            leftCount++;
            node1 = node1.left;
        }
        BST.Node node2 = root;
        while (node2.right!=null){
            rightCount++;
            node2 = node2.right;
        }

        if(leftCount>rightCount)
            return leftCount+1;
        else
            return rightCount+1;
    }

    void printLevelOrder()
    {
        int h = maxDepthBST(head);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(head, i);
    }

    void printCurrentLevel(BST.Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    void printLevelOrder1()
    {
        Queue<BST.Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {

            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/
            util/linkedlist_poll.htm */
            BST.Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public void binaryTreeLevelOrderTraversal(BST.Node root){
        //int depth = maxDepthBST(root);
        //int d = 0;

        if (root!=null){
            System.out.println("Binary Tree level Traversal: "+root.data);
            if(root.left!=null){
                System.out.println(root.left.data);
            }
            if(root.right!=null){
                System.out.println(root.right.data);
            }

            binaryTreeLevelOrderTraversal(root.left);
            binaryTreeLevelOrderTraversal(root.right);
        }
    }



    public static void main(String[] args) {
        int[] array = {50,30,20,40,70,60,80};
        BST tree = new BST();
        for(int i = 0; i<array.length; i++){
            if(head==null) {
                head = tree.insert(head, array[i]);
                continue;
            }
            tree.insertNode(head,array[i]);
        }
        //head.left.left.left = new BST.Node(45);

        SymmetricTree symmetricTree = new SymmetricTree();
        //boolean b = symmetricTree.symmetricTree(head);
        //System.out.println(b);

       // symmetricTree.printLevelOrder();
        //symmetricTree.printLevelOrder1();
       symmetricTree.binaryTreeLevelOrderTraversal(head);
    }
}
