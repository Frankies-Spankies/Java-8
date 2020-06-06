package Interfaces.functions;

import Interfaces.BeforeTest;
import Interfaces.predicates.PredicateInstructor;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class BiFunctionExampleTest extends BeforeTest {

    @Test
    void addFilterTest() {
        Map<String,Integer> map= new HashMap<>();
        this.instructors.forEach(s1->BiFunctionExample.ADD_FILTER.apply(BiFunctionExample.PUT_MAP).apply(PredicateInstructor.ONLINE).apply(s1).apply(map));
        System.out.println(map);
    }



}