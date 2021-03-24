package Collections;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueueTest {

    @Test
    public void testQueue() {

        Queue<String> names = new LinkedList<>();

     assertThat(names.isEmpty(), equalTo(true));

        names.add("John Doe");
        names.add("Jane Doe");
        names.add("Jack Doe");

        System.out.println("The result of the peek method: " + names.peek());
        System.out.println("The result of the element method: " + names.element());

        assertThat(names.isEmpty(), equalTo(false));

        System.out.println(names);
        System.out.println(names.size());

        String i = names.element();
        assertThat(i, equalTo("John Doe"));

        i = names.element();
        assertThat(i, equalTo("John Doe"));

        i = names.remove();
        assertThat(i, equalTo("John Doe"));

        i = names.remove();
        assertThat(i, equalTo("Jane Doe"));

        i = names.remove();
        assertThat(i, equalTo("Jack Doe"));

        System.out.println(names.size());

        assertThat(names.isEmpty(), equalTo(true));


        Deque <String> animals = new LinkedList<>();
        animals.push("horse");
        animals.push("camel");
        animals.push("dog");

        System.out.println("The elements of the animals Deque: " + animals);

        i = animals.element();
        System.out.println("Result element in a Deque: " + i);
        System.out.println("Result element in a Deque for the second time: " + i);

        assertThat(animals.size(), equalTo(3));

        System.out.println(i = animals.pop());
        assertThat(animals.size(), equalTo(2));

        System.out.println(i = animals.poll());
        assertThat(animals.size(), equalTo(1));
        assertThat(animals.isEmpty(), equalTo(false));

        System.out.println(i = animals.remove());
        assertThat(animals.size(), equalTo(0));

        assertThat(animals.isEmpty(), equalTo(true));

    }

}
