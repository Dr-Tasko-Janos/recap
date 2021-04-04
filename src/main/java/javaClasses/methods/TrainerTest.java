package javaClasses.methods;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TrainerTest {

    @Test
    public void testTrainerCreating() {

        Trainer trainer = new Trainer();

        assertThat(trainer.getName(), equalTo(null));
        assertThat(trainer.getYearOfBirth(), equalTo(0));
        assertThat(trainer.getAge(), equalTo(2021));

        trainer.setName("John Doe");
        trainer.setYearOfBirth(1987);
        assertEquals("John Doe", trainer.getName());
        assertEquals(1987, trainer.getYearOfBirth());
        assertEquals(34, trainer.getAge());

        System.out.println(trainer.getNameAndYearOfBirth());
        System.out.printf("%s is %d years old\n", trainer.getName(), trainer.getAge());


    }
}
