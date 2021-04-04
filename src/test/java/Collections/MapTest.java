package Collections;

import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MapTest {

   /* @Test
    public void testMap() {
        Map<String, String> codes = new HashMap<>();

        assertThat(codes.isEmpty(), equalTo(true));
        assertThat(codes.size(), equalTo(0));

        codes.put("404","Not found");
        codes.put("200","OK");
        codes.put("304","Unmodified");

        assertThat(codes.isEmpty(), equalTo(false));
        assertThat(codes.size(), equalTo(3));

        System.out.println(codes);

        codes.put("404", "Not Found");

        System.out.println(codes);

        System.out.println(codes.get("304"));

        codes.remove("404");

        assertThat(codes.containsKey(404), equalTo(false));
        assertThat(codes.containsValue("Not Found"), equalTo(false));
        assertThat(codes.containsValue("OK"), equalTo(true));

        System.out.println("Here are the keys: " + codes.keySet());
        System.out.println("Here are the values: " + codes.values());


        List<Trainer2> trainers = new ArrayList<>();
        trainers.add(new Trainer2(1L, "John Doe"));
        trainers.add(new Trainer2(2L, "Jane Doe"));
        trainers.add(new Trainer2(3L, "Jack Doe"));
        trainers.add(new Trainer2(4L, "Joe Doe"));

        for(Trainer2 trainer : trainers) {
            if(trainer.getId() == 3L) {
                System.out.println(trainer.getName());
            }
        }

        Map<Long, Trainer2> trainer2Map = new HashMap<>();

        for(Trainer2 trainer : trainers) {
            trainer2Map.put(trainer.getId(), trainer);
        }

        System.out.println(trainer2Map.get(3L).getName());

    }*/

    @Test
    public void testMap() {

        Map<String, String> codes = new LinkedHashMap<>();
        System.out.println(codes);
        assertThat(codes.size(), equalTo(0));
        codes.put("404", "Not found");
        codes.put("200", "OK");
        codes.put("304", "Unmodified");
        assertEquals(3, codes.size());

        System.out.println(codes);
        System.out.println(codes.size());

        System.out.println(codes.get("404"));
        System.out.println(codes);

        System.out.println(codes.values());
        System.out.println(codes.keySet());

        assertEquals(true, codes.containsValue("Not found"));
        codes.put("404", "Not Found");
        assertThat(codes.containsValue("Not found"), equalTo(false));
        assertThat(codes.containsValue("Not Found"), equalTo(true));
        System.out.println(codes);

        codes.remove("404");
        System.out.println(codes);
        assertThat(codes.containsValue("Not Found"), equalTo(false));
        assertThat(codes.containsKey("304"), equalTo(true));
    }

    @Test
    public void testMap2() {
        List<Trainer2> trainers = new ArrayList<>(List.of(
           new Trainer2(1, "Jane Doe"),
           new Trainer2(2, "John Doe"),
           new Trainer2(3, "Jack Doe"),
           new Trainer2(4, "Joe Doe"),
           new Trainer2(5, "Emily Doe")
        ));

        for(Trainer2 item : trainers) {
            System.out.println(item);
        }

        Map<Integer, Trainer2> trainersMap = new HashMap<>();
        System.out.println("Is trainersMap is empty? " + trainersMap.isEmpty());
        for(Trainer2 trainer : trainers) {
            trainersMap.put(trainer.getId(), trainer);
        }

        assertThat(trainersMap.get(3).getName(), equalTo("Jack Doe"));

        for(Map.Entry item : trainersMap.entrySet()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
    }

 }
