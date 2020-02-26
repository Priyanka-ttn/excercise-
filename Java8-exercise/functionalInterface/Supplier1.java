package functionalInterface;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();


        System.out.println(randomValue.get());
    }
}
