package Interfaces.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Random;

public class OptionalTest {

    @Test
    void withArray() {
        Integer a[] = new Integer[10];
        Optional<Integer> value = Optional.ofNullable(a[0]);
        System.out.println(value);

    }

    @Test
    void optionalNull() {
        Optional<String> hola = Optional.of(null);
        System.out.println(hola);

    }

    @Test
    void optionalEmpty() {
        Optional<String> hola = Optional.empty();
        hola.ifPresentOrElse(System.out::println, () -> System.out.println("Aca no toy"));
    }

    @Test
    void orELSE() {
        Optional<String> hola = Optional.of("Wola");
        System.out.println(hola.orElse("La usrpadora tururu"));
    }

    @Test
    void orGET() {
        Optional<Integer> hola = Optional.of(7);
        System.out.println(hola.orElseGet(new Random()::nextInt));
    }

    @Test
    void orThrow() {
        Optional<String> hola = Optional.empty();
        try {
            hola.orElseThrow();
        }catch (Exception e){
            System.out.println("Se ha lanzado la excepcion");
        }
    }
}
