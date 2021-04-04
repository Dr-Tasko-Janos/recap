package Collections;

public class Trainer2 {

    /*private Long id;
    private String name;

    public Trainer2(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }*/

    private int id;
    private String name;

    public Trainer2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Id: " + id + " - Name: " + name;
    }
}
