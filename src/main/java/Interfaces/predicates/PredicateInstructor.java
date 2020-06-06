package Interfaces.predicates;

import model.Instructor;
import model.Instructors;

import java.util.List;
import java.util.function.Predicate;

public class PredicateInstructor {
    public static Predicate<Instructor> ONLINE = (instructor) -> instructor.onlineCourses;
    public static Predicate<Instructor> EXP_10 = (instructor) -> instructor.experience > 10;


    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getInstructors();
        instructors.forEach((s1) -> {
            if (ONLINE.test(s1)){
                System.out.println(s1);
            }
        });

        System.out.println("----------------------------------------");

        instructors.forEach((s1) -> {
            if (ONLINE.and(EXP_10).test(s1)) {
                System.out.println(s1);
            }
        });

    }
}
