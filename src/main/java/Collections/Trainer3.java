package Collections;

public class Trainer3 implements Comparable<Trainer3> {

    private String name;
    private int salary;

    public Trainer3(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name: " + name + " salary: " + salary;
    }

    /*@Override
    public int compareTo(Trainer3 item) {
        return this.name.compareTo(item.name);
    }*/

    @Override
    public int compareTo(Trainer3 item) {
        return Integer.valueOf(this.salary).compareTo(Integer.valueOf(item.salary));
    }
}