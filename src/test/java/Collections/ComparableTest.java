package Collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

    @Test
    public void testComparable() {

        List<String> names = new ArrayList<>(Arrays.asList("Joe", "Jack", "Jane", "John"));
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);


        List<Trainer3> trainers = new ArrayList<>(List.of(
                new Trainer3("Joe", 95),
                new Trainer3("Jack", 62),
                new Trainer3("Jane", 43),
                new Trainer3("John",15)
        ));

        System.out.println(trainers);

        Collections.sort(trainers);
        System.out.println(trainers);
    }
}