package Interfaces.functions;

import Interfaces.predicates.PredicateInstructor;
import model.Instructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample2 {
    public static Function<List<Instructor>, Map<String, Integer>> MAP_NAME_EXP = (l) -> {
        Map<String, Integer> regreso = new HashMap<>();
        l.forEach(s1 -> regreso.put(s1.nombre, s1.experience));
        return regreso;
    };
    public static Function<List<Instructor>, Map<String, Integer>> MAP_NAME_EXP_ONLINE = (l) -> {
        Map<String, Integer> regreso = new HashMap<>();
        l.forEach(s1 -> {
            if (PredicateInstructor.ONLINE.test(s1)) {
                regreso.put(s1.nombre, s1.experience);
            }
        });
        return regreso;
    };
}
