package Components;

public class Oppilas {
    private static int idCounter = 0;

    private int id;
    private String name;

    public Oppilas(String name){
        this.name = name;
        this.id = idCounter++;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}