package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_2_StackMin;

import com.github.dimonium_239.Chapter_3_StackAndQueues.StackAndQueuesUtils.Stack;

public class StackMin<T> extends Stack<T> {
    private final Stack<T> minElements = new Stack<>();

    @Override
    public T pop() {
        T element = super.pop();
        if(!minElements.isEmpty()){
            T minElement = minElements.peek();
            if(element == minElement){
                minElements.pop();
            }
        }
        return element;
    }

    @Override
    public void push(T item) {
         if(minElements.isEmpty()){
             minElements.push(item);
         } else {
             T minElement = minElements.peek();
             if(lt(item, minElement)){
                 minElements.push(item);
             }
         }
        super.push(item);
    }

    public T min(){
        if(!minElements.isEmpty()) return minElements.peek();
        return null;
    }

    private boolean lt(T item1, T item2){
        if(item1 instanceof Integer) return (Integer) item1 < (Integer) item2;
        else if(item1 instanceof Double) return (Double) item1 < (Double) item2;
        else if(item1 instanceof Float) return (Float) item1 < (Float) item2;
        else if(item1 instanceof String) return ((String) item1).length() < ((String) item2).length();
        else if(item1 instanceof Character) return (Character) item1 < (Character) item1;
        return false;
    }
}
