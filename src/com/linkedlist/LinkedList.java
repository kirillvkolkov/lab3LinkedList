package com.linkedlist;

public class LinkedList {
    public static class Node {
        public int data;
        public Node next;
        public void printInfo() {
            System.out.print( data +  " ---- ");
        }
    }
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public int returnWithoutDeleteFromHead() {
        return getHead().data;
    }

    public int returnAndDeleteFromHead() {
        int returnValue = head.data;
        setHead(head.next);
        return returnValue;
    }

    public void addLast(int data) {
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        Node node = new Node();
        node.data = data;
        current.next = node;
    }
    public int returnWithoutDeleteFromTail() {
        Node current = head;
        Node temp = head;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        return current.data;
    }

    public int returnAndDeleteFromTail() {
        Node current = head;
        Node temp = head;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
        return temp.data;
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            current.printInfo();
            current = current.next;
        }
        System.out.print("END\n");
    }
}