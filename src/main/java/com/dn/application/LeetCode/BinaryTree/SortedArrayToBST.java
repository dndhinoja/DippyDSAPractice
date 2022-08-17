package com.dn.application.LeetCode.BinaryTree;

public class SortedArrayToBST {

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

    static Node head;
    public static Node insertNode(Node head,int data){

        if(head==null){
            head = new Node(data);
            return head;
        }

        if(data < head.data){
            head.left = insertNode(head.left,data);
        }
        if(data> head.data){
            head.right = insertNode(head.right, data);
        }

        return head;
    }

    public static Node sortedArrayToBST(int[] arr, int start, int end){
        if(start>end){
            return null;
        }

        int mid = (end+start) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid-1);
        node.right = sortedArrayToBST(arr, mid+1, end);

        return node;
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 70};
        /*for(int i = 0; i< arr.length; i++){
            if(head == null){
                head = insertNode(head, arr[i]);
                continue;
            }
            insertNode(head, arr[i]);
        }*/
        Node root = sortedArrayToBST(arr, 0, arr.length-1);
    }
}
