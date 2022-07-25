package com.github.dimonium_239.Chapter_2_LinkedLists.Task_2_ReturnKthToLast;

import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.LinkedListUtils;
import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.Node;

public class Main {
    public static void main(String[] args) {
        Node node = LinkedListUtils.initLinkedList(2, 1, 2, 4, 4, 5);
        LinkedListUtils.print(kthToLast(node, 0));
        LinkedListUtils.print(kthToLast(node, 1));
        LinkedListUtils.print(kthToLast(node, 2));
        LinkedListUtils.print(kthToLast(node, 3));
        LinkedListUtils.print(kthToLast(node, 4));
        LinkedListUtils.print(kthToLast(node, 5));
        LinkedListUtils.print(kthToLast(node, 6));
        LinkedListUtils.print(kthToLast(node, 7));
        LinkedListUtils.print(kthToLast(node, 8));
    }

    // TODO: Compare my solution with hints
    public static Node kthToLast(Node node, int k){
        Node kth = node;
        int i = 0;
        while (kth.next != null){
            if(i == k){
                return kth;
            }
            i++;
            kth = kth.next;
        }
        return (i == k) ? kth : null;
    }
}
