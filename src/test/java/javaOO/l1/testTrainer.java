package javaOO.l1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class testTrainer {

    @Test
    public void testTrainer() {

        List<String> coursesName = new ArrayList<>();
        coursesName.add("Java");
        coursesName.add("Python");
        Trainer trainer = new Trainer("John Doe", 32, coursesName);

        assertEquals(2, trainer.getCourses().size());

        System.out.println(trainer.getCourses());
        trainer.getCourses().add("C#");


        List<String> names = List.of("");


}}
