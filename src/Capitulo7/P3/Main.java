package Capitulo7.P3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();
        lista.add(new EdificioOficinas(20, 500));
        lista.add(new EdificioOficinas(45, 780.6));
        lista.add(new Polideportivo(650.5, "Polideportivo Ramón y Cajal", 1));
        lista.add(new Polideportivo(450, "Polideportivo Severo Ochoa", 2));
        lista.add(new Polideportivo(760.7, "Polideportivo Margarita Salas", 3));

        Iterator<Object> it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
