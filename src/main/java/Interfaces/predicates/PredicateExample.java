package Interfaces.predicates;

import java.util.function.Predicate;


public class PredicateExample {

    public static Predicate<Integer> MAYOR_10 = (a) -> a > 10;
    public static Predicate<Integer> MAYOR_CERO = (a) -> a > 0;
    public static Predicate<Integer> PAR =(a) -> a%2 == 0;
    public static Predicate<Integer> ES_CERO = (a) -> a == 0;

    public static void main(String[] args) {
        System.out.println(MAYOR_10.test(20));
        System.out.println("--------------------------------------------");
        System.out.println(MAYOR_10.and(PAR).test(20 ));
        System.out.println("--------------------------------------------");
        System.out.println(MAYOR_10.or(PAR).test(8));
        System.out.println("--------------------------------------------");
        System.out.println(MAYOR_CERO.and(ES_CERO.negate()).and(PAR).test(10));





    }
}


