package com.dn.application.LeetCode.BinaryTree;

import java.util.ArrayList;

public class BST {
    static Node head;

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public Node insert(Node node,int key){
        if(node==null){
            return new Node(key);
        }
        if(node.data>key){
            node.left = insert(node.left,key);
        }
        else if(node.data<key){
            node.right = insert(node.right,key);
        }
        return node;
    }

    public Node insertNode(Node node, int key){
        if(node==null){
            node = new Node(key);
        }
        if(key<node.data){
            node.left = insertNode(node.left,key);
        }
        else if(key> node.data){
            node.right = insertNode(node.right,key);
        }
        return node;
    }

    public void inOrder(Node head){
        if(head!=null){

            System.out.println(head.data);
            inOrder(head.left);
            //System.out.println(head.data);
            inOrder(head.right);
        }
    }

    public Node deleteNode(Node root,int key){
        if(root==null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left,key);
        }
        else if(key > root.data){
            root.right = deleteNode(root.right,key);
        }
        else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right,key);

            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    private int minValue(Node root, int key) {
        int min = 0;
        while (root.left!=null){
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public boolean validBST(Node root){
        boolean flag = true;
        if(root==null){
            return true;
        }
        if(root.left!=null && root.left.data>root.data) {
            return  false;
        }
        else if(root.right!=null && root.right.data<root.data){
            return false;
        }
        else if(!validBST(root.left) || !validBST(root.right)){
            return false;
        }
        return true;
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
        //tree.insertNode(head,35);
        head.left.right.left = new Node(45);
        tree.inOrder(head);
        //tree.validBST(head);
    }
}
