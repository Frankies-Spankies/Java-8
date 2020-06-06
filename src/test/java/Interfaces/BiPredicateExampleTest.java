package Interfaces;

import Interfaces.predicates_consumers.BiPredicateExample;
import model.ConsumerInstructor;
import model.Instructor;
import model.Instructors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class BiPredicateExampleTest {
    List<Instructor> instructors;

    @BeforeEach
    void setUp() {
        instructors = Instructors.getInstructors();
    }

    @Test
    void onlineAndTen() {
        instructors.forEach(s1 -> {
            if (BiPredicateExample.ONLINE_AND_G_10_EXPERIENCE.test(s1.onlineCourses, s1.experience)) {
                ConsumerInstructor.NOMBRE_CURSOS.accept(s1.nombre, s1.skils);
            }
        });
    }
}