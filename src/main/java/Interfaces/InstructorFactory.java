package Interfaces;

import model.Instructor;

import java.util.List;

public interface InstructorFactory {
    public abstract Instructor getInstructor(String nombre, Integer experience, List<String> skils, String genero, Boolean onlineCourses);
}
