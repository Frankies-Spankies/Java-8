package model;

import java.util.List;
import java.util.function.BiConsumer;

public class ConsumerInstructor {
    public static BiConsumer<String, String> NOMBRE_GENERO = (name, gender) -> System.out.println("name: " + name + " Gender: " + gender);
    public static BiConsumer<String, List<String>> NOMBRE_CURSOS = (name, courses) -> System.out.println("name: " + name + " Courses: " + courses.toString());

}
