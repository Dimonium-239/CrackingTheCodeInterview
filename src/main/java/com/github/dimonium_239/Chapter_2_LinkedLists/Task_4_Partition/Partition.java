package com.github.dimonium_239.Chapter_2_LinkedLists.Task_4_Partition;

import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.LinkedListUtils;
import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.Node;

public class Partition {
    public static void main(String[] args) {
        Node node = LinkedListUtils.initLinkedList(3, 5, 8, 5, 10, 2, 1);
        LinkedListUtils.print(node);
        node = partitList(node, 5);
        LinkedListUtils.print(node);
    }

    public static Node partitList(Node node, int partition) {
        Node head = node;
        while (node.next != null){
            if(node.next.data < partition){
                Node newHead = node.next;
                node.next = node.next.next;
                newHead.next = head;
                head = newHead;
            }
            node = node.next;
        }

        if(node.data < partition){
            node.next = head;
            head = node;
        }

        return head;
    }
}
