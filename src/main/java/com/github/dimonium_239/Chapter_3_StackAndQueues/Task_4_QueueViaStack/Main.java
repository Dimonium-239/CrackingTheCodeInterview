package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_4_QueueViaStack;

public class Main {
    public static void main(String[] args) {
        QueueViaStack<Integer> queueViaStack = new QueueViaStack<>();
        queueViaStack.add(1);
        queueViaStack.add(2);
        queueViaStack.add(3);
        queueViaStack.add(4);
        queueViaStack.add(5);
        System.out.println(queueViaStack.peek());
        System.out.println(queueViaStack.remove());
        System.out.println(queueViaStack.remove());
        System.out.println(queueViaStack.remove());
        System.out.println(queueViaStack.remove());
    }
}
