package javaClasses.objectAndAttributes;

public class ObjectAndAttributes {

    public static void main(String[] args) {

        Trainer trainer = new Trainer();
        trainer.setName("John Doe");
        trainer.setAge(41);
        System.out.println(trainer.getName());
        System.out.println(trainer.getAge());

        Trainer anotherTrainer = new Trainer();
        System.out.println(anotherTrainer.getName());
        anotherTrainer.setName("Jack Doe");
        System.out.println(anotherTrainer.getName());
    }
}
