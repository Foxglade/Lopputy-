package Components;

public class Kurssi {
    private static int idCounter = 0;

    private int id;
    private String name;
    private int opintop;

    public Kurssi(String name){
        this.name = name;
        this.id = idCounter++;
        opintop = 5;
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
    public void setOpintop(int opintop) {
        this.opintop = opintop;
    }
    public int getOpintop() {
        return opintop;
    }

    public Kurssi() {
    }

    public Kurssi(int id, String name, int opintop) {
        this.id = id;
        this.name = name;
        this.opintop = opintop;
    }

    public Kurssi id(int id) {
        setId(id);
        return this;
    }

    public Kurssi name(String name) {
        setName(name);
        return this;
    }

    public Kurssi opintop(int opintop) {
        setOpintop(opintop);
        return this;
    }
}