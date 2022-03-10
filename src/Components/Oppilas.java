package Components;

public class Oppilas {
    private static int idCounter = 0;

    private int id;
    private String name;

    public Oppilas(String name){
        this.id = idCounter++;
    }
}