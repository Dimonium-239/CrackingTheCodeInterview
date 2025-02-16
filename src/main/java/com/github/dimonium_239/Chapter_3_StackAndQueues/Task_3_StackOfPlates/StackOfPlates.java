package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_3_StackOfPlates;

import com.github.dimonium_239.Chapter_3_StackAndQueues.StackAndQueuesUtils.Stack;

public class StackOfPlates<T> extends Stack<T> {

    private final int STACK_THRESHOLD = 5;
    private int platesInLastStack = 0;

    private Stack<Stack<T>> stackOfStack;

    public StackOfPlates() {
        super();
        stackOfStack = new Stack<>();
    }

    @Override
    public T pop() {
        T element = stackOfStack.peek().pop();
        platesInLastStack--;
        if(stackOfStack.peek().isEmpty()){
            stackOfStack.pop();
            platesInLastStack = STACK_THRESHOLD;
        }
        return element;
    }

    @Override
    public void push(T item) {
        if (platesInLastStack >= STACK_THRESHOLD || stackOfStack.isEmpty()){
            stackOfStack.push(new Stack<>());
            platesInLastStack = 0;
        }
        stackOfStack.peek().push(item);
        platesInLastStack++;
    }

    @Override
    public T peek() {
        return stackOfStack.peek().peek();
    }

    @Override
    public boolean isEmpty() {
        return stackOfStack.isEmpty();
    }
}
