package javaClasses.objectAndAttributes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestObjectAndAttributes {

    @Test
    public void testObjectAndAttributesCreating() {
        Trainer trainer = new Trainer();
        assertEquals(true, trainer instanceof Trainer);

        assertThat(trainer.getName(), equalTo(null));
        assertThat(trainer.getAge(), equalTo(0));
        System.out.println(trainer.getName() + " " + trainer.getAge());

        trainer.setName("John Doe");
        trainer.setAge(30);
        assertThat(trainer.getName(), equalTo("John Doe"));
        assertEquals(30, trainer.getAge());

        trainer.setAge(32);
        assertEquals(32, trainer.getAge());

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.setName("Jack Doe");
        System.out.println(anotherTrainer.getName());
        assertEquals("Jack Doe", anotherTrainer.getName());
        anotherTrainer.setName("John Doe");
        assertEquals("John Doe", anotherTrainer.getName());

        assertThat(trainer.getName(), equalTo(anotherTrainer.getName()));
        anotherTrainer.setName("JohN dOE");
        System.out.println(trainer.getName().equals(anotherTrainer.getName()));
        System.out.println(trainer.getName().equalsIgnoreCase(anotherTrainer.getName()));
    }
}
