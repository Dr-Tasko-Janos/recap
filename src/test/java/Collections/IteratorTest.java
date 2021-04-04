package Collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class IteratorTest {

    @Test
    public void testIterator() {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        /*for(int i : numbers) {
            if(i % 2 == 0) {
                numbers.remove(Integer.valueOf(i));
            }
        }*/


        Iterator<Integer> i = numbers.iterator();

        while (i.hasNext()) {
            int value = i.next();
            if (value % 2 == 0) {
                i.remove();
            }
        }
        assertThat(numbers, equalTo(Arrays.asList(1, 3, 5, 7, 9)));
    }
}