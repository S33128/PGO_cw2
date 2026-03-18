import java.util.Scanner;

public class Ksiazka {
    String tytul;
    String autor;
    int liczbaStron;
    boolean czyDostepna;
    int numerKsiazki;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public boolean isCzyDostepna() {
        return czyDostepna;
    }

    public void setCzyDostepna(boolean czyDostepna) {
        this.czyDostepna = czyDostepna;
    }

    public int getNumerKsiazki() {
        return numerKsiazki;
    }

    public void setNumerKsiazki(int numerKsiazki) {
        this.numerKsiazki = numerKsiazki;
    }

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean czyDostepna, int numerKsiazki) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.czyDostepna = czyDostepna;
        this.numerKsiazki = numerKsiazki;
    }

    public void wypiszinfo() {
        System.out.println(tytul);
        System.out.println(autor);
        System.out.println(liczbaStron);
        System.out.println(czyDostepna);
    }

    public void wypozycz() {
        if (czyDostepna == true) {
            System.out.println("Na ile dni wypozyczasz ksiazke?");
            Scanner sc = new Scanner(System.in);
            int dni = sc.nextInt();
            System.out.println("Wyporzyczono ksiazke na " + dni + " dni.");
        } else {
            System.out.println("Ksiazka jest niedotepna");
        }
    }
}

