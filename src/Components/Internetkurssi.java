package Components;

public class Internetkurssi extends Kurssi {
    private String verkkoosoite;
    int opintop;
    String name;
    public Internetkurssi (int opintop, String name, String verkkoosoite){
        super(opintop, name , verkkoosoite);
        this.verkkoosoite = verkkoosoite;
    }
}

    public Internetkurssi() {
    }

    public Internetkurssi(String verkkoosoite) {
        this.verkkoosoite = verkkoosoite;
    }

    public String getVerkkoosoite() {
        return this.verkkoosoite;
    }

    public void setVerkkoosoite(String verkkoosoite) {
        this.verkkoosoite = verkkoosoite;
    }

    public Internetkurssi verkkoosoite(String verkkoosoite) {
        setVerkkoosoite(verkkoosoite);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Internetkurssi)) {
            return false;
        }
        Internetkurssi internetkurssi = (Internetkurssi) o;
        return Objects.equals(verkkoosoite, internetkurssi.verkkoosoite);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(verkkoosoite);
    }

    @Override
    public String toString() {
        return "{" +
            " verkkoosoite='" + getVerkkoosoite() + "'" +
            "}";
    }
