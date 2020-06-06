package Interfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.length() + "the Value of " + x);

        c.accept("Up in the air");

        Consumer<Integer> i = (x) -> {
            System.out.println("x*x = " + x * x);
            System.out.println("x/x = " + x / x);
        };

        i.accept(10);
    }


}

