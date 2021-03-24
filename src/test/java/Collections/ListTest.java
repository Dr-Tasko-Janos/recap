package Collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ListTest {

    @Test
    public void testList() {
        List<String> l = new ArrayList<>();

        l.add("Jane");
        l.add("John");
        System.out.println(l);

        Collection<String> c = l;
        assertThat(c, equalTo(l));

        System.out.println(l);

        l.add("Jack");
        System.out.println(l);
        l.add(0, "Jack");
        System.out.println(l);

        l.remove("Jack");
        System.out.println(l);

        l.add(0, "Jack");
        System.out.println(l);
        l.removeAll(Arrays.asList("Jack"));
        System.out.println(l);

        assertThat(l.size(), equalTo(2));
        System.out.println(l.size());

        l.set(0, "Joe");
        assertThat(l, equalTo(Arrays.asList("Joe", "John")));
        System.out.println(l);

        assertThat(l.get(0), equalTo("Joe"));

        assertThat(l.indexOf("John"), equalTo(1));
        System.out.println(l.indexOf("John"));


        c.clear();
        assertThat(l.size(), equalTo(0));
        System.out.println(l.size());

        c.add("Simon");
        assertThat(l.size(), equalTo(1));
        assertThat(l.get(0), equalTo("Simon"));
        System.out.println(c);
        System.out.println(l);

    }
}
