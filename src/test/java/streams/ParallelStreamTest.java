package streams;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class ParallelStreamTest {

    @Test
    void A() {
        System.out.println(measure(()->IntStream.rangeClosed(1, 10000).sum(),20));
        System.out.println(measure(()->IntStream.rangeClosed(1, 10000).parallel().sum(),20));

    }

    @Test
    void B() {
        System.out.println(measure(()->IntStream.rangeClosed(1, 10000).parallel().sum(),20));
    }


    public  Long measure(Supplier<Integer> accion, int reapeated){
        Long start = System.currentTimeMillis();
        for (int i = 0; i < reapeated; i++) {
            accion.get();
        }
        return System.currentTimeMillis() - start;

    }


}
