package functionalInterface;


import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String args[])
    {

        Consumer<Integer> consumer = (value) -> System.out.println(value);
         consumer.accept(10);
    }
}

