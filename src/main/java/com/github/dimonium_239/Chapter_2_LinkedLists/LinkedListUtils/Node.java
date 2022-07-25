package com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils;

public class Node {
    public Node next = null;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
        Node end = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
        }
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    @Override
    public String toString() {
//        try {
//            return "[" + data + "] -> [" + (next != null ? next.toString() : "null") + "]";
//        } catch (StackOverflowError stackOverflowError){
            return "[" + data + "] -> [" + next.data + "] -> [...]";
//        }
    }
}
