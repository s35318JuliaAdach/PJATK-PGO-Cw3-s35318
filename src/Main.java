public class Main {
    public static void main(String[] args) {
        Menu kawa = new Menu("K01", "Latte", 13.00 , "Napoje");
        Menu ciasto = new Menu("D01", "Sernik", 12.00, "Desery");
        Menu duplikatKawy = new Menu("K01", "Inna Kawa", 9, "Napoje");

        Klient julia = new Klient(1, "Julia", "Add", "julia@cosmail.com");
        Zamowienie zam = new Zamowienie(julia);
        zam.dodajProdukt(kawa);
        zam.dodajProdukt(ciasto);
        System.out.println(zam);
        System.out.println("Do zapłaty: " + zam.policzWartosc() + " zł");
        System.out.println("Liczba produktów w systemie: " + Menu.getLiczbaProduktow());
        System.out.println("Czy kody kaw są identyczne? " + kawa.equals(duplikatKawy));
        zam.oznaczJakoOplacone();
        System.out.println("Status po płatności: " + zam);
    }
}