public class Czytelnik {
    String imie;
    String nazwisko;
    String numerKarty;
    int liczbaWypozyczen;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumerKarty() {
        return numerKarty;
    }

    public void setNumerKarty(String numerKarty) {
        this.numerKarty = numerKarty;
    }

    public int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }

    public void setLiczbaWypozyczen(int liczbaWypozyczen) {
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public Czytelnik(String imie, String nazwisko, String numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void wypiszdane(){
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(numerKarty);
        System.out.println(liczbaWypozyczen);
    }
}
