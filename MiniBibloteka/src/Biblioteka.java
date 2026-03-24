public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Biblioteka pełna!");
        }
    }
    public void wypiszDostepneKsiazki() {
        System.out.println("\nDostępne książki:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }
    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }
        return licznik;
    }
    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);
        if (ksiazka != null && ksiazka.isDostepna()) {
            ksiazka.wypozycz();
            czytelnik.zwiekszLiczbeWypozyczen();
        } else {
            System.out.println("Nie można wypożyczyć książki: " + tytul);
        }
    }
    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);
        if (ksiazka != null && !ksiazka.isDostepna()) {
            ksiazka.zwroc();
            czytelnik.zmniejszLiczbeWypozyczen();
        } else {
            System.out.println("Nie można zwrócić książki: " + tytul);
        }
    }
}