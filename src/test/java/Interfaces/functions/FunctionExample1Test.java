package Interfaces.functions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FunctionExample1Test {

    String hola;

    @BeforeEach
    void setUp() {
        hola = "Hola Mundo";
    }

    @Test
    void sqrtTest() {
        System.out.println("Raiz cuadrada de 49: " + FunctionExample1.SQRT.apply(49));
        System.out.println("Raiz cuadrada de 81: " + FunctionExample1.SQRT.apply(81));
    }

    @Test
    void lowerCaseTest() {
        System.out.println(hola + " -> " + FunctionExample1.LOWERCASE.apply(hola));
    }

    @Test
    void concatTest() {
        System.out.println(FunctionExample1.CONCAT.apply(hola));
    }

    @Test
    void name() {
        System.out.println(FunctionExample1.CONCAT.andThen(FunctionExample1.LOWERCASE).apply(hola));
    }

    @Test
    void composeTest() {
        System.out.println(FunctionExample1.LOWERCASE.compose(FunctionExample1.CONCAT).apply(hola));
    }
}