import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka(10);
        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 300, true);
        Ksiazka k2 = new Ksiazka("Hobbit", "Tolkien", 250, true);
        Ksiazka k3 = new Ksiazka("1984", "Orwell", 200, true);
        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);
        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 1);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 2);
        biblioteka.wypiszDostepneKsiazki();
        biblioteka.wypozyczKsiazke("Hobbit", c1);
        biblioteka.wypiszDostepneKsiazki();
        biblioteka.zwrocKsiazke("Hobbit", c1);
        biblioteka.wypiszDostepneKsiazki();
        c1.wypiszDane();
    }
}