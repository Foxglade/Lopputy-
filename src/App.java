import Components.Kurssi;
import Components.Oppilas;

public class App {
    public static void main(String[] args) throws Exception {
     Kurssi kurssi = new Kurssi();
        int id = kurssi.getId();
        String name = kurssi.getName();
        int opintop = kurssi.getOpintop();
          System.out.println(id + name + opintop);
    }
}
