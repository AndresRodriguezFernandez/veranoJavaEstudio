package Capitulo6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        List<Integer> lista= new LinkedList<>();

        for (int i = 0; i < 10 ; i++){
            lista.add(i);
        }
        System.out.println(calcularLongitud(lista));
    }

    public static int calcularLongitud(List<Integer> lista) {
        Iterator<Integer> it = lista.iterator();
        int cont = 0;
        while (it.hasNext()){
            cont++;
            it.next();
        }
        return cont;
    }
}
