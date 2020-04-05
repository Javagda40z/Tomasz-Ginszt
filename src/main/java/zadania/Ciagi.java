package zadania;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ciagi {
//Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie, różnicy ciągu
    public static void main(String[] args) {

//        List<Integer> lista = new ArrayList<>();    // ArrayList<Integer> lista2 = new ArrayList<>();
//
//        lista.add(15);
//        lista.add(20);
//        lista.add(30);
//
//        System.out.println(lista);
//        lista.add(444);
//        System.out.println(lista);
//        lista.remove(0);
//        System.out.println(lista);
        System.out.println(stworzCiagArytmetyczny(5, 1, 1));

        List<String> listaPracownikow = new LinkedList<String>();
        listaPracownikow.add("Mateusz");
        listaPracownikow.add("Mateusz2");
        listaPracownikow.add("Marika");

        List<String> listaPracownikowZInnegoDzialu = new LinkedList<String>();
        listaPracownikow.add("Mateusz1");
        listaPracownikow.add("Mateusz3");
        listaPracownikow.add("Marika2");



    }


    //Napisz funkcję tworzącą ciąg arytmetyczny o podanych:
    // długości, pierwszym elemencie, różnicy ciągu

    public static List<Integer> stworzCiagArytmetyczny(int dlugosc, int pierwszy, int roznica) {
        List<Integer> ciag = new ArrayList<>();
        ciag.add(pierwszy);
        for (int i = pierwszy; i < dlugosc; i++) {
            ciag.add(pierwszy + i * roznica);
        }
        return ciag;
    }
}