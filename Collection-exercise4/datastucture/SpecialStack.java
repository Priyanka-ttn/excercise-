package datastucture;

import java.util.*;

class NewStack
{
    Stack<Integer> s;
    int minElement;


    NewStack() {
        s = new Stack<Integer>();
    }

    void getMin()
    {

        if (s.isEmpty())
            System.out.println("Stack is empty");

        else
            System.out.println("Minimum Element in the stack is: " + minElement);
    }


    // Removes the top element
    void pop()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        if (t < minElement)
        {
            System.out.println(minElement);
            minElement = 2*minElement - t;
        }

        else
            System.out.println(t);
    }

    // Insert new number
    void push(Integer x)
    {
        if (s.isEmpty())
        {
            minElement = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        // If new number is less than original minElement
        if (x < minElement)
        {
            s.push(2*x - minElement);
            minElement = x;
        }

        else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }
};

class Main
{
    public static void main(String[] args)
    {
        NewStack s = new NewStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();

    }
}