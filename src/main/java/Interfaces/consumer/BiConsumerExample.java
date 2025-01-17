package Interfaces.consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println("x: "+x+" y: "+y);
        biConsumer.accept(2,5);

        BiConsumer<Integer,Integer> biConsumer1 = (x,y) -> System.out.println("x+y: "+(x+y));
        biConsumer1.accept(2,5);

        BiConsumer<String,String> biConsumer2 = (x,y) -> System.out.println(x+y);
        biConsumer2.accept("Fell on" , " deaf ears");

    }
}
