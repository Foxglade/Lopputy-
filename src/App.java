import Components.Kurssi;
import Components.Oppilas;

public class App {
    public static void main(String[] args) throws Exception {
        Oppilas op1 = new Oppilas("Kasperi");
        Oppilas op2 = new Oppilas("Sauli");
        System.out.println("_______________");
        System.out.println(op1.getName());
        System.out.println(op1.getId());
        System.out.println("_______________");
        System.out.println(op2.getName());
        System.out.println(op2.getId());
        System.out.println("_______________");
        Kurssi ku1 = new Kurssi("Pullonpyöritys");
        Kurssi ku2 = new Kurssi("Kaljan maistelu");
        System.out.println(ku1.getId());
        System.out.println(ku1.getName());
        System.out.println(ku1.getOpintop());
        System.out.println("_______________");
        System.out.println(ku2.getId());
        System.out.println(ku2.getName());
        System.out.println(ku2.getOpintop());
    }
}
