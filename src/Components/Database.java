package Components;

import java.util.*;
import java.io.*;

public class Database {
    private static Scanner input = new Scanner(System.in);

    private static String tiedostonNimi = "Oppilaat.txt";
    //private static String tiedostonNimi2 = "Kurssit.txt";
    private static ArrayList<String> lista = new ArrayList<String>();
    private static ArrayList<String> kurssi = new ArrayList<String>();
    

    
    private static void lisaaoppilas() {
        System.out.print("Oppilaan nimi: ");
        String oppilas = input.nextLine();
        lista.add(oppilas);
        }





    private static void tulostaLista() {
        System.out.println("Oppilaat:");
        for (String oppilas : lista) {
           System.out.println(oppilas);
           System.out.println("------------------");
        }
    }

    private static void lisaakurssi() {
        System.out.print("Kurssin nimi: ");
        String Kurssi = input.nextLine();
        kurssi.add(Kurssi);
      
}
    private static void tulostakurssi() {
        System.out.println("Kurssit:");
        for (String Kurssi : kurssi)
         {
           System.out.println(Kurssi);
           System.out.println("------------------");
        }
    }

    private static void tallennaLista() throws Exception {
        PrintWriter tiedosto = new PrintWriter(new File(tiedostonNimi));
        int oppilasmaara = lista.size();
        tiedosto.println(oppilasmaara);
        for (String Kurssi : kurssi) {
            tiedosto.println(Kurssi);
        }
        for (String oppilas : lista) {
            tiedosto.println(oppilas);
        }
        tiedosto.close();
    }

    private static void lataaLista() throws Exception {
        Scanner tiedosto = new Scanner(new File(tiedostonNimi));
        lista.clear();
        int oppilasmaara = Integer.parseInt(tiedosto.nextLine());
        for (int i = 0; i < oppilasmaara; i++) {
            String oppilas = tiedosto.nextLine();
            lista.add(oppilas);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("1: Lisää oppilas");
        System.out.println("2: Näytä oppilaat");
        System.out.println("3: Tallenna lista");
        System.out.println("4: Lataa lista");
        System.out.println("5: Sulje ohjelma");
        System.out.println("6: Näytä kurssit");
        System.out.println("7: Lisää kurssi");
        while (true) {
            System.out.print("Anna komento: ");
            String komento = input.nextLine();
            if (komento.equals("1")) {
                lisaaoppilas();
            }
            if (komento.equals("2")) {
                tulostaLista();
            }
            if (komento.equals("3")) {
                tallennaLista();
            }
            if (komento.equals("4")) {
                lataaLista();
            }
            if (komento.equals("5")) {
                return;
            }
            if (komento.equals("6")) {
                tulostakurssi();
            }
            if (komento.equals("7")) {
                lisaakurssi();
            }
        }
    }
}