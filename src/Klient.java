import java.util.Objects;

public class Klient {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;
    public Klient(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public String getPelneDane() {
        return imie + " " + nazwisko;
    }
    public String toString() {
        return "Klient: " + getPelneDane() + " (ID: " + idKlienta + ")";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient that = (Klient) o;
        return idKlienta == that.idKlienta || Objects.equals(email, that.email);
    }
}
