package zadania;

public class TabliczkaMnozenia {
    //    public static final int LICZBA = 5; // dostep z zewnatrz, bez tworzenia
    private final int liczba;

    public TabliczkaMnozenia(int liczba) {        //alt + insert
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void wypiszTabliczke() {
        System.out.println("Tabliczka mnożenia dla liczbby: " + liczba);
        for (int i = 1; i <= this.liczba; i++) {
            System.out.println(liczba + " x " + i + " = " + liczba * i);
        }
    }
}
