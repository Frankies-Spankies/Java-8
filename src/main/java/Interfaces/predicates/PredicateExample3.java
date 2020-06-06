package Interfaces.predicates;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static IntPredicate INT_G_100 = (i) -> i > 100;
    public static LongPredicate LONG_G_100 = (i) -> i > 100L;
    public static DoublePredicate DOUBLE_M_1025 = (i) -> i < 100.25;
    public static DoublePredicate DOUBLE_G_1010 = (i) -> i > 100.10;
    public static void main(String[] args) {
        System.out.println(INT_G_100.test(100));
        System.out.println(LONG_G_100.test(1111111111111111L));
        System.out.println(DOUBLE_M_1025.and(DOUBLE_G_1010).test(100.15));
    }
}
