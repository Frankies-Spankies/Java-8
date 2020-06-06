package streams;

import model.Instructor;
import model.Instructors;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExampleTest {
    @Test
    void toList() {
        Set<String> nombres = Instructors.getInstructors().stream()
                .map(Instructor::getNombre)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(nombres);

    }

    @Test
    void flatMap() {
        Set<String> skills = Instructors.getInstructors().stream()
                .map(Instructor::getSkils)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        System.out.println(skills);
    }
}
