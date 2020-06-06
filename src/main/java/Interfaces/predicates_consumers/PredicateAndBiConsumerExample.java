package Interfaces.predicates_consumers;

import Interfaces.predicates.PredicateInstructor;
import model.ConsumerInstructor;
import model.Instructor;
import model.Instructors;

import java.util.List;


public class PredicateAndBiConsumerExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getInstructors();

        instructors.forEach(s1 -> {
            if (PredicateInstructor.ONLINE.test(s1)) {
                ConsumerInstructor.NOMBRE_CURSOS.accept(s1.nombre, s1.skils);
            }
        });

    }
}
