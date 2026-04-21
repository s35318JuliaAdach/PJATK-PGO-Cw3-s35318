import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private Klient klient;
    private ArrayList<Menu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;
    public Zamowienie(Klient klient) {
        this.numerZamowienia = kolejnyNumer++;
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }
    public void dodajProdukt(Menu p) {
        produkty.add(p);
    }
    public double policzWartosc() {
        double suma = 0;
        for (Menu p : produkty) {
            suma += p.getCena();
        }
        return suma;
    }
    public void oznaczJakoOplacone() {
        this.oplacone = true;
    }
    public String toString() {
        String status = oplacone ? "OPŁACONE" : "DO ZAPŁATY";
        return "Zamówienie #" + numerZamowienia + " [" + status + "]\nDla: " + klient;
    }
}
