package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_2_StackMin;

public class Main {
    public static void main(String[] args) {
        StackMin<Integer> stackMin = new StackMin<>();
        stackMin.push(5);
        System.out.println(stackMin.min());
        stackMin.push(3);
        System.out.println(stackMin.min());
        stackMin.push(6);
        System.out.println(stackMin.min());
        stackMin.pop();
        System.out.println(stackMin.min());
        stackMin.pop();
        System.out.println(stackMin.min());
        stackMin.pop();
        System.out.println(stackMin.min());
    }
}
