package Components;

public class CourseManager{
    private String Oppilas;
    private String Kurssi;

    private static int count = 0;
    private int uid;

    public int getUid() {
        return uid;
    }


    public CourseManager( String Oppilas, String Kurssi){
        this.Oppilas = Oppilas;
        this.Kurssi = Kurssi;
        this.uid = count++;
    }

    public CourseManager(){
        this.Oppilas = "";
        this.Kurssi = "";
    }

    public String getOppilas() {
        return this.Oppilas;
    }

    public void setOppilas(String Oppilas) {
        this.Oppilas = Oppilas;
    }

    public String getKurssi() {
        return Kurssi;
    }

    public void setKurssi(String Kurssi) {
        this.Kurssi = Kurssi;
    }
}
