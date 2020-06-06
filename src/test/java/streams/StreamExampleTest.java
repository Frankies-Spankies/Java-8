package streams;

import Interfaces.BeforeTest;
import Interfaces.predicates.PredicateInstructor;
import model.Instructor;
import model.Instructors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamExampleTest extends BeforeTest {


    @DisplayName(value = "Instructors with more than 10 years of Exp")
    @Test
    void mapTest1 () {
        Map<String, List<String>> map = Instructors.getInstructors() .stream()
                .filter(PredicateInstructor.ONLINE)
                .filter(PredicateInstructor.EXP_10)
                .peek(System.out::println)
                .collect(Collectors.toMap(Instructor::getNombre, Instructor::getSkils));
        //System.out.println(map);

        //Instructors.getInstructors().stream().filter(PredicateInstructor.ONLINE).filter(PredicateInstructor.EXP_10);
    }
}