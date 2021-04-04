package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeIterator {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        for(Iterator<Integer> i = numbers.iterator(); i.hasNext();) {
            int value = i.next();
            System.out.print(value + ", ");
            if(value % 2 == 0) {
                i.remove();
            }
        }
        System.out.println("\n" + numbers);








    }
}