package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_5_SortStack;

import com.github.dimonium_239.Chapter_3_StackAndQueues.StackAndQueuesUtils.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack = sortStack(stack);
        System.out.println(stack);
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> helperStack = new Stack<>();
        helperStack.push(stack.pop());
        Integer tmp1 = stack.pop();
        while(tmp1 != null){
            Integer tmp2 = helperStack.peek();
            if(tmp1 <= tmp2){
                helperStack.push(tmp1);
                if(stack.isEmpty()) break;
                tmp1 = stack.pop();
            } else {
                while (!helperStack.isEmpty() && tmp1 >= helperStack.peek()) {
                    tmp2 = helperStack.pop();
                    stack.push(tmp2);
                }
                helperStack.push(tmp1);
                if(stack.isEmpty()){
                    tmp1 = null;
                } else {
                    tmp1 = stack.pop();
                }
            }
        }
        return helperStack;
    }
}
