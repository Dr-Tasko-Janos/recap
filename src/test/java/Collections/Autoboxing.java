package Collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class Autoboxing {

    @Test
    public void autoboxingTest() {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(12);
        numbers.add(36);
        numbers.add(48);

        for(Integer i : numbers) {
            System.out.println(i);
        }

        System.out.println("\n\n");

        for(int item : numbers) {
            System.out.println(item);
        }

        assertThat(numbers.get(2), equalTo(12));

    }
}
