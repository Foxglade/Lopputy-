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

}