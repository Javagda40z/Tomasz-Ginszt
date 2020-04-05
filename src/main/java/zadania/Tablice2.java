package zadania;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Tablice2 {

    // Dla zadanej tablicy intów
    // policz ile jest w niej liczb ujemnych.
    // Jeśli takie występują
    // utwórz nową tablicę,
    // do której przepisze tylko te ujemne liczby

    public static void main(String[] args) {
        int[] tablica = new int[] {-5, 3, -2, 0, 4, 4};

//        int[] tablicaMinusy // int ujemna = 0; // dodatnia = 0; // or () // (tablica[0])

        System.out.println(Arrays.toString(liczbyUjemne(tablica)));
    }

    public static int[] liczbyUjemne(int[] tablica) {
        int[] tab = new int[0];
        for (int elementTablicy : tablica) {
            if (elementTablicy < 0) {
                ArrayUtils.add(tab, elementTablicy);
            }
        }
        return tab;
    }
}