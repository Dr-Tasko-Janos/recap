package javaOO.l1;

import java.util.List;

public class Trainer {

    private final String name;
    private final int yearOfBirth;
    private final List<String> courses;

    public Trainer(String name, int yearOfBirth, List<String> courses) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getYearOFBirth() {
        return yearOfBirth;
    }

    public List<String> getCourses() {
        return courses;
    }
}