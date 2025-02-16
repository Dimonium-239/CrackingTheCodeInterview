package com.github.dimonium_239.Chapter_2_LinkedLists.Task_3_DeleteMiddleNode;

import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.LinkedListUtils;
import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.Node;

public class DeleteMiddleNode {

    public static void main(String[] args) {
        Node node = LinkedListUtils.initLinkedList(1,2,3,4,5,6,7);
        Node middle = node;
        for (int i = 0; i < 3; i++) {
            middle = middle.next;
        }
        LinkedListUtils.print(node);
        LinkedListUtils.print(middle);
        removeInMiddle(middle);
        LinkedListUtils.print(node);
    }

    public static void removeInMiddle(Node middle){
        while (middle.next.next != null){
            middle.data = middle.next.data;
            middle = middle.next;
        }
        middle.next = null;
    }
}
