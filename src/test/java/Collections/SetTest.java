package Collections;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SetTest {

    /*@Test
    public void setTes() {

        Set<String> s = new LinkedHashSet<>();

        assertThat(s.size(), equalTo(0));
        s.add("John");
        s.add("Jane");
        s.add("John");
        s.add("Jake");

        assertThat(s.size(), equalTo(3));
        System.out.println(s);


        Set<Trainer> trainers = new LinkedHashSet<>();
        trainers.add(new Trainer("John Doe"));
        trainers.add(new Trainer("John Doe"));
        trainers.add(new Trainer("Jane Doe"));
        trainers.add(new Trainer("Jack Doe"));
        assertThat(trainers.size(), equalTo(3));
        System.out.println(trainers);
    }*/
    @Test
    public void testSet() {

        Set<String> s = new HashSet<>();
        assertThat(s.size(), equalTo(0));

        s.add("John");
        s.add("Jane");
        s.add("John");
        s.add("Jack");
        assertThat(s.size(), equalTo(3));
        System.out.println(s);

        Set<Trainer> trainers = new LinkedHashSet<>(List.of(
                new Trainer("John Doe"),
                new Trainer("Jane Doe"),
                new Trainer("John Doe"),
                new Trainer("Jack Doe")
        ));

        assertThat(trainers.size(), equalTo(3));
        System.out.println(trainers);


    }


}
