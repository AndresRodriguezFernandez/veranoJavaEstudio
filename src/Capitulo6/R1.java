package Capitulo6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class R1 {
    public static void main(String[] args) {
        List lista1 = new LinkedList();

        lista1.add("Madrid");
        lista1.add("Sevilla");
        lista1.add("Valencia");
        Iterator iterador1 = lista1.iterator();

        while (iterador1.hasNext()){
            String elemento = (String) iterador1.next();
            System.out.println(elemento + " ");
        }
        System.out.println("---LinkedList---");

        List<String> lista2 = new ArrayList<>();

        lista2.add("Madrid");
        lista2.add("Sevilla");
        lista2.add("Valencia");
        Iterator<String> iterador2 = lista2.iterator();

        while (iterador2.hasNext()){
            String elemento = iterador2.next();
            System.out.println(elemento + " ");
        }
        System.out.println("---ArrayList---");

        /*
        * El Iterator recorre las listas sin mucha dificultad con el hasNext, preguntándose si hay elementos
        * que le sigan al de después del actual.
        * El next() lo guarda y le suma una posición al Iterator*/
    }
}
