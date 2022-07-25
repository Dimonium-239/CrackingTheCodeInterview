package com.github.dimonium_239.Chapter_2_LinkedLists.Task_7_Intersection;

import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.LinkedListUtils;
import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.Node;

public class Main {
    public static void main(String[] args) {
        Node head2 = LinkedListUtils.initLinkedList(0,1,2,3,4,5);
        Node head1 = LinkedListUtils.initLinkedList(11, 12);
        head2.next.next = head1.next.next.next.next;

        Node result = intersection(head1, head2);
        LinkedListUtils.print(result);
    }

    private static Node intersection(Node head1, Node head2){
        Node node1 = head1;
        Node node2 = head2;

        // Find len of each list
        int lenNode1 = 0;
        int lenNode2 = 0;
        while(node1 != null){
            lenNode1++;
            node1 = node1.next;
        }
        while(node2 != null){
            lenNode2++;
            node2 = node2.next;
        }

        // Make proper offset if lists have different len
        node1 = head1;
        node2 = head2;
        int difference = 0;
        if(lenNode1 > lenNode2){
            difference = lenNode1 - lenNode2;
            while(difference > 0){
                difference--;
                node1 = node1.next;
            }
        } else if (lenNode2 > lenNode1) {
            difference = lenNode2 - lenNode1;
            while(difference > 0){
                difference--;
                node2 = node2.next;
            }
        }

        // Iterate while is not equal
        while (node1.next != null && node2.next != null && node1 != node2){
            node1 = node1.next;
            node2 = node2.next;
        }

        return node1;
    }
}
