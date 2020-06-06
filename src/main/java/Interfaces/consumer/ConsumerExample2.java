package Interfaces.consumer;

import model.Instructor;
import model.Instructors;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getInstructors();

/*        Consumer<List<Instructor>> consumer = (instructorList) -> System.out.println(instructorList.toString());
        consumer.accept(instructors);*/

        Consumer<Instructor> c1 = (instructor) -> System.out.println(instructor.toString());
        instructors.forEach(c1);
        System.out.println("--------------------------------------------------------");
        Consumer<Instructor> c2 = (instructor) -> System.out.println(instructor.getNombre());
        instructors.forEach(c2);
        System.out.println("--------------------------------------------------------");
        Consumer<Instructor> c3 = (instructor) -> System.out.println(instructor.getSkils());
        instructors.forEach(c2.andThen(c3));
        System.out.println("--------------------------------------------------------");
        instructors.forEach((acceptElement)-> {
            if (acceptElement.experience > 10){
                c2.accept(acceptElement);
            }
        });
        System.out.println("--------------------------------------------------------");
        instructors.forEach((acceptElement) -> {
            if (acceptElement.experience > 5 && !acceptElement.onlineCourses ) {
                c1.andThen(c2).accept(acceptElement); //c1 ni c2 son parametros por eso el parametro que se les pasa es por el accept
            }
        });







    }
}
