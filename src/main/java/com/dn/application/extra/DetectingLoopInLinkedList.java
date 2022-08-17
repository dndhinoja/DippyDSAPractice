package com.dn.application.extra;

public class DetectingLoopInLinkedList {

    public Node push(Node head, int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.flag = 0;
        newNode.next = head;

        return newNode;
    }

    public boolean detectingLoop(Node head){

        while (head!=null){
            if(head.flag==1){
                return  true;
            }

            head.flag = 1;
            head = head.next;
        }

        return false;
    }

    public static void main(String[] args) {
        DetectingLoopInLinkedList detectingLoopInLinkedList = new DetectingLoopInLinkedList();
        Node head = null;
        head = detectingLoopInLinkedList.push(head, 10);
        head = detectingLoopInLinkedList.push(head, 12);
        head = detectingLoopInLinkedList.push(head, 1);
        head = detectingLoopInLinkedList.push(head, 4);
        head = detectingLoopInLinkedList.push(head, 11);

        head.next.next = head;
        System.out.println(detectingLoopInLinkedList.detectingLoop(head));

    }
}

class Node{
    int data;
    int flag;
    Node next;
}