package com.github.dimonium_239.Chapter_2_LinkedLists.Task_5_SumLists;

import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.LinkedListUtils;
import com.github.dimonium_239.Chapter_2_LinkedLists.LinkedListUtils.Node;

public class Main {
    public static void main(String[] args) {
        Node a = LinkedListUtils.initLinkedList(6, 0, 7);
        Node b = LinkedListUtils.initLinkedList(2, 9, 5);
        LinkedListUtils.print(a);
        LinkedListUtils.print(b);
        System.out.println();
        Node c1 = SumInNormalOrder.sumList(a, b);
        Node c2 = SumInReversOrder.sumList(a, b);
        LinkedListUtils.print(c1);
        LinkedListUtils.print(c2);
    }


    static class SumInReversOrder extends Sum{
        public static Node sumList(Node a, Node b) {
            Node c = makeEqualLength(a, b, new Node(0));
            sumTwoEqualLists(a, b, c);
            return c;
        }

        public static void sumTwoEqualLists(Node a, Node b, Node c) {
            if (a == null) {
                return;
            }
            c.data += a.data + b.data;
            if (c.data >= 10) {
                c.data %= 10;
                if (c.next != null) {
                    c.next.data += 1;
                } else {
                    a.next = new Node(0);
                    b.next = new Node(0);
                    c.next = new Node(1);
                }
            }
            sumTwoEqualLists(a.next, b.next, c.next);
        }
    }

    static class SumInNormalOrder extends Sum{
        public static Node sumList(Node a, Node b) {
            Node c = sumTwoEqualLists(a, b);
            if(c.data == 0){
                c = c.next;
            }
            return c;
        }

        public static Node sumTwoEqualLists(Node a, Node b) {
            if (a == null) {
                return new Node(0);
            }
            Node head = sumTwoEqualLists(a.next, b.next);
            Node newHead = new Node(0);
            head.data += a.data + b.data;
            if (head.data >= 10) {
                head.data %= 10;
                newHead.data += 1;
            }
            newHead.next = head;
            return newHead;
        }
    }

    static class Sum{
        public static Node makeEqualLength(Node a, Node b, Node c) {
            while (a.next != null || b.next != null) {
                if (a.next == null && b.next != null) {
                    a.next = new Node(0);
                }
                if (a.next != null && b.next == null) {
                    b.next = new Node(0);
                }
                Node newHeadC = new Node(0);
                newHeadC.next = c;
                c = newHeadC;
                a = a.next;
                b = b.next;
            }
            return c;
        }
    }
}
