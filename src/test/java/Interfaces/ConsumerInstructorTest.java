package Interfaces;

import model.ConsumerInstructor;
import model.Instructor;
import model.Instructors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;


class ConsumerInstructorTest {
    List<Instructor> instructors;

    @BeforeEach
    void setUp() {
        instructors = Instructors.getInstructors();
    }

    @Test
    void nombre_genero() {
        instructors.forEach((s1) -> ConsumerInstructor.NOMBRE_GENERO.accept(s1.nombre, s1.genero));
    }

    @Test
    void nombre_cursos() {
        instructors.forEach((s1) -> ConsumerInstructor.NOMBRE_CURSOS.accept(s1.nombre, s1.skils));
    }

    @Test
    void cursosOnline() {
        instructors.forEach((s1) -> {
            if (s1.onlineCourses) {
                ConsumerInstructor.NOMBRE_GENERO.accept(s1.nombre, s1.genero);
            }
        });
    }
}