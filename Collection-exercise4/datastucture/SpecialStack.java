package datastucture;

import java.util.*;

class NewStack
{
    List<Integer> list = null;
    private int stackSize;
    private int min = Integer.MAX_VALUE;
    private int top = -1;

    NewStack(int stackSize) {
        this.stackSize = stackSize;
        try{
            if (stackSize < 1) {
                throw new Exception("Stack size cannot be less than 1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        list = new ArrayList<>(stackSize);
    }

    void push(int ele){
        try{
            if (!isFull()) {
                top++;
                list.add(ele);
                min = Math.min(ele, min);
            } else {
                throw new Exception("Stack is full cannot add more elements");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean isFull() {
        return top == stackSize-1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    int getMin(){
        return min;
    }

    Integer pop(){
        try{
            if (!isEmpty()) {
                int popped = list.remove(top);
                if(popped==min){
                    changeMin();
                }
                top--;
                return popped;
            } else {
                throw new Exception("Stack is empty cannot delete more elements");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void changeMin(){
        min = Integer.MAX_VALUE;
        for (Integer ele : list) {
            min = Math.min(min,ele);
        }
    }
    @Override
    public String toString() {
        return list.toString();
    }
}

class Stack {
    public static void main(String[] args) {
       NewStack stack = new NewStack(10);
        stack.push(100);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(10);

        System.out.println(stack);
        System.out.println("Min: " + stack.getMin());
        System.out.println("Pop :" + stack.pop());
        System.out.println("Current Stack :" + stack);
        System.out.println("Min :" + stack.getMin());
    }}
