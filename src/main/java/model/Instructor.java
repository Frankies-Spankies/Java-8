package model;

import java.util.List;

public class Instructor {

    public String nombre;
    public Integer experience;
    public List<String> skils;
    public String genero;
    public Boolean onlineCourses;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public List<String> getSkils() {
        return skils;
    }

    public void setSkils(List<String> skils) {
        this.skils = skils;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getOnlineCourses() {
        return onlineCourses;
    }

    public void setOnlineCourses(Boolean onlineCourses) {
        this.onlineCourses = onlineCourses;
    }

    public Instructor(String nombre, Integer experience, List<String> skils, String genero, Boolean onlineCourses) {
        this.nombre = nombre;
        this.experience = experience;
        this.skils = skils;
        this.genero = genero;
        this.onlineCourses = onlineCourses;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "nombre='" + nombre + '\'' +
                ", experience=" + experience +
                ", skils=" + skils +
                ", genero='" + genero + '\'' +
                ", onlineCourses=" + onlineCourses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Instructor that = (Instructor) o;

        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (experience != null ? !experience.equals(that.experience) : that.experience != null) return false;
        if (skils != null ? !skils.equals(that.skils) : that.skils != null) return false;
        if (genero != null ? !genero.equals(that.genero) : that.genero != null) return false;
        return onlineCourses != null ? onlineCourses.equals(that.onlineCourses) : that.onlineCourses == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (experience != null ? experience.hashCode() : 0);
        result = 31 * result + (skils != null ? skils.hashCode() : 0);
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        result = 31 * result + (onlineCourses != null ? onlineCourses.hashCode() : 0);
        return result;
    }
}
