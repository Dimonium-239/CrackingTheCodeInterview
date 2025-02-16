package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_4_QueueViaStack;

import com.github.dimonium_239.Chapter_3_StackAndQueues.StackAndQueuesUtils.Queue;
import com.github.dimonium_239.Chapter_3_StackAndQueues.StackAndQueuesUtils.Stack;

public class QueueViaStack<T> extends Queue<T> {
    private Stack<T> first;
    private Stack<T> second;

    public QueueViaStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    @Override
    public void add(T item) {
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        first.push(item);
    }

    @Override
    public T remove() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        return second.pop();
    }

    @Override
    public T peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        return second.peek();
    }

    @Override
    public boolean isEmpty() {
        return first.isEmpty() && second.isEmpty();
    }
}
