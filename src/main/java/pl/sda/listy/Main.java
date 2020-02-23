package pl.sda.listy;

public class Main {

    public static void main(String[] args) {
        Lista lista = new ListaImplementacja();

        // tak zapisujemy korzystając z interfejsu Lista - klasa Lista Implementacje implementuje z interfejsu Lista
        // ListaImplementacja lista = new ListaImplementacja();

        lista.dodajElement(212);
        lista.dodajElement(23);
        lista.dodajElement(647);
        lista.dodajElement(2458);
        lista.dodajElement(58);
        lista.dodajElement(69);
        lista.dodajElement(212);
        lista.dodajElement(23);
        lista.dodajElement(647);
        lista.dodajElement(2458);
        lista.dodajElement(58);
        lista.dodajElement(69);

        System.out.println(lista);

        Generyka<Integer> generyka = new Generyka<>();
        generyka.wyswietl(123123);

        // stworzyć nowy objekt Generyka typu String
        // wywołać metodę wyswietl przekazując Stringa

        Generyka<String> nowyString = new Generyka<>();
        nowyString.wyswietl("HELLO");
    }
}