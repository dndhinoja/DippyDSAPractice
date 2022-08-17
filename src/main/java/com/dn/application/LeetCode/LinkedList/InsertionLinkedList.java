package com.dn.application.LeetCode.LinkedList;

import java.util.Stack;

public class InsertionLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public void add(int data){

        if(head==null){
            head = new Node(data);
            return;
        }
        Node current  = head;

        while (current.next!=null){
            current = current.next;
        }
        Node newNode = new Node(data);
        current.next = newNode;

    }

    public void addP(int data){
        if(head==null){
            head = new Node(data);
            return;
        }
        else {
            Node current = head;
            if(current.next!=null){
                current = current.next;
            }
            Node newNode = new Node(data);
            current.next = newNode;
        }
    }

    public void frontInsert(int data){
        Node node = new Node(data);
        if(head==null){
            return;
        }
        node.next = head;
        head = node;
    }
    public void lastInsert(int data){
        Node node = new Node(data);
        if(head==null){return;}
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = node;
    }

    public void middleInsert(int preData,int postData,int data){
        Node node = new Node(data);
        if(head==null){return;}

        Node current = head;
        while(current.data!=preData && current.next.data!=postData){
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }

    public void deleteNode(int data){
        if(head==null){return;}

        Node current = head;
        if(head.data==data){
            head = head.next;
            return;
        }
        Node pre = head;
        while(current.data != data){
            pre = current;
            current = current.next;
        }
        pre.next = current.next;
    }

    public boolean isPalindrome(Node head){
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while(true) {
            stack.push(current.data);
            if(current.next==null)
                break;
            current = current.next;
        }

        //again traverse
        Node current1 = head;
        while(true) {
            int a = stack.pop();
            if(a != current1.data){
                flag = false;
                return flag;
            }
            if(current1.next==null)
                break;
            current1 = current1.next;
        }
        return flag;
    }

    public void removeNthNode(int key,int length){
        if(key>length){
            return;
        }
        int i = 1;
        Node current = head;
        Node pre = null;
        while (i != length-key+1){
            i++;
            pre = current;
            current = current.next;
        }
        pre.next = current.next;
    }

    public static void main(String[] args) {
        InsertionLinkedList insertionLinkedList = new InsertionLinkedList();
        insertionLinkedList.add(3);
        insertionLinkedList.add(1);
        insertionLinkedList.add(2);
        insertionLinkedList.add(1);
        insertionLinkedList.add(3);
        System.out.println(insertionLinkedList.isPalindrome(insertionLinkedList.head));
        insertionLinkedList.removeNthNode(2,5);
        //insertionLinkedList.frontInsert(4);
        //insertionLinkedList.lastInsert(5);
        //insertionLinkedList.middleInsert(1,2,6);
        //insertionLinkedList.deleteNode(1);
    }
}
