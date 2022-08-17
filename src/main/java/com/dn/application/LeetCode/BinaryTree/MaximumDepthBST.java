package com.dn.application.LeetCode.BinaryTree;

public class MaximumDepthBST {

    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int maxDepthBST(Node root){

        if(root==null){
            return 0;
        }

        int leftCount = 0;
        int rightCount = 0;
        Node node1 = root;
        while (node1.left!=null){
            leftCount++;
            node1 = node1.left;
        }
        Node node2 = root;
        while (node2.right!=null){
            rightCount++;
            node2 = node2.right;
        }

        if(leftCount>rightCount)
            return leftCount+1;
        else
            return rightCount+1;
    }

    public static void main(String[] args) {
        MaximumDepthBST tree = new MaximumDepthBST();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.maxDepthBST(tree.root));
    }
}
