//package com.company;

public class LinkedList {
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int d){data = d;}
    }
    public static LinkedList insert(LinkedList list, int data){
        //Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
        //If the linked list is empty
        //then create a new node
        if(list.head == null){
            list.head = new_node;
        }
        else {
            //traverse till the last node is found
            //insert the new_node there
            Node last = list.head;
            while (last.next!=null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list){
        Node currNode = list.head;
        System.out.println("Linked list");
        while (currNode != null){
            System.out.println(currNode.data+" ");
            currNode = currNode.next;
        }
    }
    public static LinkedList Concatenate(LinkedList list1,LinkedList list2){
        //traversing list1 to find the last node
        Node temp = list1.head;
        while (temp.next!=null){
            temp = temp.next;
        }
        // concatenating
        temp.next = list2.head;
        return list1;
    }
    public static void main(String args[]) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1 = insert(list1,0);
        list1 = insert(list1,1);
        list1 = insert(list1,2);
        list1 = insert(list1,3);
        list1 = insert(list1,4);
        list1 = insert(list1,5);

        list2 = insert(list2,6);
        list2 = insert(list2,7);
        list2 = insert(list2,8);
        list2 = insert(list2,9);
        list2 = insert(list2,10);
        list2 = insert(list2,11);
        Concatenate(list1,list2);
        printList(list1);
    }
}
