package model;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getInstructors() {
        Instructor instructor1 = new Instructor("Franki", 15, Arrays.asList("Java", "JavaScript", "C"),"M",true);
        Instructor instructor2 = new Instructor("Panki", 7, Arrays.asList("C", "Java", "HTML"),"F",false);
        Instructor instructor3 = new Instructor("Frank", 10, Arrays.asList("Assambler", "Spring", "Maven"),"M",true);
        Instructor instructor4 = new Instructor("Spanki", 9, Arrays.asList("Docker", "Kubernates", "AWS"),"F",false);
        Instructor instructor5 = new Instructor("Flank", 18, Arrays.asList("Azure", "Microservices", "Jenkins"),"M",true);
        return Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
    }

        public static List<Instructor> parameterSkills(String[] skills1, String[] skills3, String[] skills4, String[] skills5, String[] skills2) {
            Instructor instructor1 = new Instructor("Franki", 15, Arrays.asList(skills1), "M", true);
            Instructor instructor2 = new Instructor("Panki", 7, Arrays.asList(skills2), "F", false);
            Instructor instructor3 = new Instructor("Frank", 10, Arrays.asList(skills3), "M", true);
            Instructor instructor4 = new Instructor("Spanki", 9, Arrays.asList(skills4), "F", false);
            Instructor instructor5 = new Instructor("Flank", 18, Arrays.asList(skills5), "M", true);
            return Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5);
        }

}
