package Capitulo6;

import java.util.HashMap;
import java.util.Map;

public class P2 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapaLista = new HashMap<>();

        //anadir elementos
        mapaLista.put(1, "Hola");
        mapaLista.put(2, "Adios");

        System.out.println(mapaLista.get(1));

        //quitar elementos
        mapaLista.remove(1);

        System.out.println(mapaLista.get(2));

        mapaLista.put(3, "Hola de nuevo");

        //iterar
        System.out.println("---Iteración----");
        for (Map.Entry<Integer, String> entrada : mapaLista.entrySet()){
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }
    }
}
