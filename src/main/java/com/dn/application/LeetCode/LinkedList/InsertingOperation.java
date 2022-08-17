package com.dn.application.LeetCode.LinkedList;

import java.util.*;

public class InsertingOperation {

    Node head = null;

    public Node insertNode(int data) {
        Node newNode = null;
        if (head == null) {
            head = new Node(data);
            return head;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        newNode = new Node(data);
        current.next = newNode;
        return head;
    }

    public void deleteNode(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current.data != data) {
            previous = current;
            current = current.next;
            if (current == null) {
                return;
            }
        }
        previous.next = current.next;
    }

    public Node nThNodeRemove(Node head, int position) {
        int count = 0;
        Node result = head;
        Node current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        int i = 1;
        current = head;
        Node previous = null;
        while (i != count - position + 1) {
            previous = current;
            current = current.next;
            i++;
        }
        previous.next = current.next;
        return result;
    }

    public void isPalindrome(Node head){
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while (current!=null){
            stack.push(current.data);
            current = current.next;
        }
        boolean flag = true;
        Node newCurrent = head;
        while (newCurrent!=null){
            if(stack.pop()!= newCurrent.data) {
                flag = false;
                break;
            }
            newCurrent = newCurrent.next;
        }
        System.out.println(flag);
    }

    public List<Integer> mergingList(List<Integer> list1, List<Integer> list2) {
        List<Integer> newList = new ArrayList<>();

        if(list1.isEmpty())
            return list2;
        if(list2.isEmpty())
            return list1;

        int j;
        int k = 0;
        for(int i = 0; i< list1.size(); i++){
            j = k;
            while(j< list2.size()){
                if(list1.get(i)<=list2.get(j)){
                    newList.add(list1.get(i));
                    break;
                }
                else {
                    newList.add(list2.get(j));
                    k++;
                }
                j++;
            }
        }
        return newList;
    }

    public boolean isLoop(Node head){
        HashSet<Node> hashSet = new HashSet<>();
        while (head!=null){
            if(hashSet.contains(head)){
                return true;
            }
            hashSet.add(head);
            head = head.next;
        }
        return false;
    }

    public void removeLoop(Node head){
        //Floyd’s Cycle-Finding Algorithm is also one solution
        HashSet<Node> hashSet = new HashSet<>();
        Node previous = null;
        while (head!=null){
            if(hashSet.contains(head)){
                previous.next = null;
                return;
            }
            previous = head;
            hashSet.add(head);
            head = head.next;
        }
    }


    public static void main(String[] args) {
        InsertingOperation insertingOperation = new InsertingOperation();
        insertingOperation.insertNode(2);
        insertingOperation.insertNode(1);
        insertingOperation.insertNode(4);
        insertingOperation.insertNode(6);
        Node h = insertingOperation.insertNode(4);

        insertingOperation.head.next.next.next.next.next = insertingOperation.head;
        boolean b = insertingOperation.isLoop(h);
        System.out.println(b);
        insertingOperation.removeLoop(h);

        //palindrome check
        //Node h = insertingOperation.insertNode(2);
        //insertingOperation.isPalindrome(h);

        //Merging lists
        //List<Integer> list1 = Arrays.asList();
        //List<Integer> list2 = Arrays.asList(0);
        //insertingOperation.mergingList(list1,list2);

       //insertingOperation.nThNodeRemove(h, 2);
        //insertingOperation.deleteNode(7);
    }

}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
