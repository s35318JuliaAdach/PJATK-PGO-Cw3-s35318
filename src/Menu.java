import java.util.Objects;

public class Menu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow = 0;
    public Menu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }
    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }
    public double getCena() { return cena; }
    public String toString() {
        return nazwa + " (" + kod + ") - " + cena + " zł";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu that = (Menu) o;
        return Objects.equals(kod, that.kod);
    }
}