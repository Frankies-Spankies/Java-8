package Interfaces.functions;

import Interfaces.BeforeTest;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import static org.junit.jupiter.api.Assertions.*;

class FunctionExample2Test extends BeforeTest {
    BiConsumer<String,Integer> KEY_VALUE= (k,v) -> System.out.println("k: "+k+" v: "+v);

    @Test
    void mapNameExp() {
        Map<String,Integer> mapa = FunctionExample2.MAP_NAME_EXP.apply(this.instructors);
        System.out.println(mapa);;
    }
}