package javaClasses.methods;

import java.time.LocalDate;

public class Trainer {

    private String name;
    private int yearOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getNameAndYearOfBirth() {
        return "name: " + name + " year of birth: " + yearOfBirth;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }
}
