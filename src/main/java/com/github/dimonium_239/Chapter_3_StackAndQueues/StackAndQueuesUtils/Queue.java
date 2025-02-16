package com.github.dimonium_239.Chapter_3_StackAndQueues.StackAndQueuesUtils;

import java.util.NoSuchElementException;

public class Queue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data + (next != null ? " <- " : "") + (next != null ? next : "");
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T item){
        QueueNode<T> t = new QueueNode<>(item);
        if(last != null){
            last.next = t;
        }
        last = t;
        if(first == null){
            first = last;
        }
    }

    public T remove(){
        if(first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if(first == null){
            last = null;
        }
        return data;
    }

    public T peek(){
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty(){
        return  first == null;
    }

    @Override
    public String toString() {
        return first.toString();
    }

}
