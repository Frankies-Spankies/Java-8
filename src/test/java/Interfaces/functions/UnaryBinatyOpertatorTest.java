package Interfaces.functions;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class UnaryBinatyOpertatorTest {

    @Test
    void BinyTest() {
        BinaryOperator<Integer> mayor = BinaryOperator.maxBy((t1,t2)-> (t1<t2)?-1:1);
        System.out.println(mayor.apply(3,2));
    }

    @RepeatedTest(5)
    void Supplier() {
        Supplier<Integer> random = () -> (int) (Math.random()*1000);
        System.out.println(random.get());
    } 
}
