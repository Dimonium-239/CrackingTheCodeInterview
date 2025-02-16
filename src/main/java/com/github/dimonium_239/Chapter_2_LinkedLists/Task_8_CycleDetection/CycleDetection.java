package com.github.dimonium_239.Chapter_2_LinkedLists.Task_8_CycleDetection;

import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.LinkedListUtils;
import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.Node;

public class CycleDetection {
    public static void main(String[] args) {
        Node a = LinkedListUtils.initLinkedList(1,2,3,4,5,6,7,8,9);
        createLoopInIndex(a, 8);
        cycle(a);
    }

    private static void createLoopInIndex(Node node, int index){
        Node newNode = node;
        while (index > 0){
            newNode = newNode.next;
            index--;
        }
        newNode.next = node;
    }

    private static void cycle(Node head){
        Node node1 = head;
        Node node2 = head.next.next;
        while (node2.next.next != null && node1 != node2){
            node1 = node1.next;
            node2 = node2.next.next;
        }
        Node nodeOfIntersection = node2.next;
        System.out.println(nodeOfIntersection.data);
        //LinkedListUtils.print(nodeOfIntersection);
    }
}
