package com.github.dimonium_239.Chapter_2_LinkedLists.Task_6_Palindrom;

import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.LinkedListUtils;
import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.Node;

public class Palindrom {
    public static void main(String[] args) {
        Node a = LinkedListUtils.initLinkedList(1,2,3,2,1);
        System.out.println(isPalindrom(a));
    }

    public static boolean isPalindrom(Node node){
        return traverser(node, node) == null;
    }

    private static Node traverser(Node l, Node r){
        if(r == null){
            return l;
        }

        l = traverser(l, r.next);

        if(l.data != r.data){
            return l;
        }

        return l.next;
    }
}
