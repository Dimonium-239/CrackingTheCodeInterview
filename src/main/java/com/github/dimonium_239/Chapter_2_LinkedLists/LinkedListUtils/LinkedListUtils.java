package com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils;

public class LinkedListUtils {
    public static void print(Node node) {
        if(node == null) {
            System.out.println("null");
            return;
        }
        StringBuilder str = new StringBuilder();
        while (node != null) {
            str.append(node.data);
            if (node.next != null) str.append(" -> ");
            node = node.next;
        }
        System.out.println(str);
    }


    public static Node initLinkedList(int... data){
        Node node = new Node(data[0]);
        for (int i = 1; i < data.length; i++) {
            node.appendToTail(data[i]);
        }
        return node;
    }
}
