package Collections;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class QueueTest {

    /*   @Test
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
   */
    @Test
    public void testQueue() {
        Queue<String> names = new LinkedList<>();
        names.add("John Doe");
        names.add("Jane Doe");
        names.add("Jack Doe");
        names.add("Jane Doe");
        assertThat(names.size(), equalTo(4));

        System.out.println(names);

        String name = names.element();
        System.out.println(name);
        name = names.peek();
        System.out.println(name);

        String i = names.poll();
        assertEquals("John Doe", i);
        System.out.println(i);

        i = names.remove();
        assertEquals("Jane Doe", i);
        System.out.println(i);

        i = names.remove();
        assertEquals("Jack Doe", i);
        System.out.println(i);
        assertThat(names.isEmpty(), equalTo(false));

        i = names.remove();
        assertEquals("Jane Doe", i);
        System.out.println(i);
        assertEquals(true, names.isEmpty());


        Deque <String> animals = new LinkedList<>();

        animals.push("zebra");
        animals.push("elephant");
        animals.add("lion");
        animals.push("baboon");

        System.out.println(animals.size());
        assertThat(animals.size(), equalTo(4));
        i = animals.pop();
        System.out.println(i);
        assertThat(i, equalTo("baboon"));
        System.out.println(animals.size());
        assertEquals(3, animals.size());
        assertThat(animals.isEmpty(), equalTo(false));
        System.out.println("Animals is Empty? " + animals.isEmpty());

        i = animals.pop();
        System.out.println(i);
        assertThat(i, equalTo("elephant"));

        i = animals.pop();
        System.out.println(i);
        assertThat(i, equalTo("zebra"));

        System.out.println(animals.size());
        i = animals.pop();
        System.out.println(i);
        assertThat(i, equalTo("lion"));
        System.out.println("Animals is empty? " + animals.isEmpty());
        assertEquals(true, animals.isEmpty());
        System.out.println(animals.size());

    }
}