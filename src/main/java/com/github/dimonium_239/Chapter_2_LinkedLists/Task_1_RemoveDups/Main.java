package com.github.dimonium_239.Chapter_2_LinkedLists.Task_1_RemoveDups;


import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.LinkedListUtils;
import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.Node;

import java.util.HashSet;
import java.util.Set;


// 2 -> 1 -> 2 -> 4 -> 4 -> 5
public class Main {

    public static void main(String[] args) {
        Node node = LinkedListUtils.initLinkedList(2, 1, 2, 4, 4, 5);
        LinkedListUtils.print(node);
        removeDups2(node);
        LinkedListUtils.print(node);
    }

    public static void removeDups1(Node node){
        Node head = node;
        while (head.next != null){
            Node prev = node;
            Node secondHead = prev.next;
            while (secondHead != null){
                if (head != secondHead && head.data == secondHead.data){
                    prev.next = secondHead.next;
                }
                prev = secondHead;
                secondHead = secondHead.next;
            }
            head = head.next;
        }
    }

    public static void removeDups2(Node node){
        Node prev = node;
        Node current = node.next;
        Set<Integer> isPresentDup = new HashSet<>(prev.data);
        while(current.next != null){
            int currentData = current.data;
            if(isPresentDup.contains(currentData)){
                prev.next = current.next;
            } else {
                isPresentDup.add(currentData);
            }
            current = current.next;
            prev = prev.next;
        }
    }
}


