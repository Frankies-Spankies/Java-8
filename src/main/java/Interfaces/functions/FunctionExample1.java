package Interfaces.functions;

import java.util.function.Function;

public class FunctionExample1 {
    public static Function<Integer,Double> SQRT = n -> Math.sqrt(n);
    public static Function<String,String> LOWERCASE = s -> s.toLowerCase();
    public static Function<String,String> CONCAT = s -> s.concat(" IN JAVA");

}
