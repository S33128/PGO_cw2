public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }
    public void wypiszInfo() {
        System.out.println("Tytuł: " + tytul + ", Autor: " + autor + ", Strony: " + liczbaStron + ", Dostępna: " + (dostepna ? "Tak" : "Nie"));
    }
    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypożyczono książkę: " + tytul);
        } else {
            System.out.println("Książka niedostępna: " + tytul);
        }
    }
    public void zwroc() {
        dostepna = true;
        System.out.println("Zwrócono książkę: " + tytul);
    }
    public String getTytul() {
        return tytul;
    }
    public boolean isDostepna() {
        return dostepna;
    }
}