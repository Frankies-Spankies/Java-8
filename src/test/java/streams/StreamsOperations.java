package streams;

import Interfaces.predicates.PredicateInstructor;
import model.Instructor;
import model.Instructors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsOperations {

    Stream<Instructor> instructors;

    @BeforeEach
    void setUp() {
        instructors = Instructors.getInstructors().stream();
    }

    @Test
    void coutTest() {
        Long count = instructors
                .map(Instructor::getSkils)
                .flatMap(List::stream)
                .count();

        System.out.println(count);
    }

    @Test
    void distinct() {
        List<String> count = instructors
                .map(Instructor::getSkils)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(count);
    }

    @Test
    void sorted() {
        List<String> skills = instructors
                .map(Instructor::getSkils)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(skills);
    }

    @Test
    void anyMatch() {
        Boolean contains_J = instructors
                .map(Instructor::getSkils)
                .flatMap(List::stream)
                .distinct()
                .anyMatch(skill -> skill.startsWith("J"));

        System.out.println(contains_J);
    }

    @Test
    void nonMatch() {
        Boolean contains_J = instructors
                .map(Instructor::getSkils)
                .flatMap(List::stream)
                .distinct()
                .noneMatch(skill -> skill.startsWith("J"));

        System.out.println(contains_J);
    }

    @Test
    void allMatch() {
        Boolean contains_J = instructors
                .map(Instructor::getSkils)
                .flatMap(List::stream)
                .distinct()
                .allMatch(skill -> skill.startsWith("J"));

        System.out.println(contains_J);
    }

    @Test
    void comparator() {
        List<String> skills = Instructors.getInstructors().stream()
                .sorted(Comparator.comparing(Instructor::getExperience).reversed())
                .map(Instructor::getNombre)
                .collect(Collectors.toList());


        System.out.println(skills);
    }

    @Test
    void filter() {
        List<Instructor> instructors = Instructors.getInstructors().stream()
                .filter(PredicateInstructor.EXP_10)
                .sorted(Comparator.comparing(Instructor::getNombre))
                .collect(Collectors.toList());
        instructors.forEach(System.out::println);
    }

    @Test
    void reduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .reduce((x, y) -> x + y).ifPresent(System.out::println);

        int resultado = numbers.stream()
                .reduce((x,y) -> x + y).get();
        System.out.println(resultado);
    }

    @Test
    void reduceIdentity() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int result = numbers.stream()
                .reduce(10, (x, y) -> x + y);
        System.out.println(result);

    }

    @DisplayName("Instructor higest years of Exp")
    @Test
    void reduce3() {
        Instructors.getInstructors().stream()
                .reduce((x,y)->x.experience>y.experience?x:y).ifPresent(System.out::println);
    }

    @DisplayName("Count the exprience of Instructors with online courses")
    @Test
    void countExp() {
        Instructors.getInstructors().stream()
                .filter(Instructor::getOnlineCourses)
                .map(Instructor::getExperience)
                .reduce(Integer::sum).ifPresent(System.out::println);
    }

    @Test
    void max() {
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .max(Integer::compareTo).ifPresent(System.out::println);
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().
                reduce(Integer::max).ifPresent(System.out::println);
    }

    @Test
    void min() {
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .min(Integer::compareTo).ifPresent(System.out::println);
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().
                reduce(Integer::min).ifPresent(System.out::println);
    }

    @Test
    void limit() {
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .limit(5).forEach(System.out::println);
    }

    @Test
    void skip() {
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream()
                .skip(4).forEach(System.out::println);
    }

    @Test
    void findFirst() {
        Instructors.getInstructors().stream()
        .findFirst().ifPresent(System.out::println);
    }

    @Test
    void findAny() {
        Instructors.getInstructors().stream()
                .findAny().ifPresent(System.out::println);
    }

    @Test
    void of() {
        Stream.of(1,2,3,4,5,6,7,8,9).forEach(System.out::println);
    }

    @Test
    void iterate() {
        Stream.iterate(1,i->i+1).limit(5).forEach(System.out::println);
    }

    @Test
    void iterateFor() {
        Stream.iterate(1,n->n<10, i -> i + 1).forEach(System.out::println);
    }

    @Test
    void generate() {
        Stream.generate(Math::random).
                map(i->(int) Math.round(i*1000))
                .limit(5).forEach(System.out::println);

        Stream.generate(new Random()::nextInt)
                .limit(5).forEach(System.out::println);
    }

    @Test
    void intStream() {
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }

    @Test
    void intStreamSum() {
        int sum = Instructors.getInstructors().stream().mapToInt(Instructor::getExperience).sum();
        System.out.println(sum);

    }

    @Test
    void intStreamAverage() {
        Instructors.getInstructors().stream().mapToInt(Instructor::getExperience).average().ifPresent(System.out::println);
    }

    @Test
    void boxing() {
        List<Integer> integers = IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList());
        integers.forEach(System.out::println);
    }

    @Test
    void mapToObject() {
        List<Numero> numeros = IntStream.rangeClosed(1,5).mapToObj(Numero::new).collect(Collectors.toList());
        numeros.forEach(System.out::println);
    }
}

class Numero{
    int numero;
    String nombre;

    public Numero(int numero) {
        this.numero = numero;
        this.nombre = "El numero es: "+ this.numero;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
