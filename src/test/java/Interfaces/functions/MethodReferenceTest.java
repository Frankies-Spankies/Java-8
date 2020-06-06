package Interfaces.functions;

import Interfaces.InstructorFactory;
import model.Instructor;
import model.Instructors;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest {

    public static Boolean greatherThan(Instructor instructor) {
        if (instructor.experience > 10)
            return true;
        return false;
    }

    @Test
    void MethodReference() {
        Predicate<Instructor> p = Instructor::getOnlineCourses;

        Function<Integer, Double> sqrt = Math::sqrt;

        Function<String, String> lower_case = String::toLowerCase;

    }

    @Test
    void convertToMethodReference() {
        Predicate<Instructor> p = MethodReferenceTest::greatherThan;
        Instructors.getInstructors().forEach(s1 -> {
            if (p.test(s1))
                System.out.println(s1);
        });
    }

    @Test
    void constructorMethodReference() {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Frani", 10, Arrays.asList("Java","Haskell","JavaScript"),"M",true);
        Consumer<Object> print = System.out::println;
        print.accept(instructor);
    }
}
