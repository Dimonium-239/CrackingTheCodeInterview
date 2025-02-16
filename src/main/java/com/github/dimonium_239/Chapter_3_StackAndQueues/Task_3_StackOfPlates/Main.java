package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_3_StackOfPlates;

public class Main {

    public static void main(String[] args) {
        StackOfPlates<Integer> stackOfPlates = new StackOfPlates<>();
        stackOfPlates.push(1);
        stackOfPlates.push(2);
        stackOfPlates.push(3);
        stackOfPlates.push(4);
        stackOfPlates.push(5);
        stackOfPlates.push(11);
        stackOfPlates.push(12);
        stackOfPlates.push(13);
        stackOfPlates.push(14);
        stackOfPlates.push(15);
        stackOfPlates.push(111);
        stackOfPlates.push(112);
        stackOfPlates.push(113);
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.peek());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.peek());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
    }
}
