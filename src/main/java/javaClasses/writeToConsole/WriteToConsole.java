package javaClasses.writeToConsole;

import java.time.LocalDate;
import java.util.Scanner;

public class WriteToConsole {

    public static void main(String[] args) {

        String message = "Hello World!";
        System.out.println(message);

        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.println("What is the year of your birth?");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Year of birth: " + yearOfBirth);

        int age = LocalDate.now().getYear() - yearOfBirth;
        System.out.printf("You are %d years old.\n", age);
    }
}