package Capitulo6;

import java.util.ArrayList;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,3);
        System.out.println("lista l1: " + l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        System.out.println("lista l2: " + l2);

        l1.addAll(1, l2);
        System.out.println("lista l1: " + l1);

        List sublist1 = l1.subList(0,3);
        System.out.println(sublist1);
        sublist1 = l1.subList(2, l1.size());
        System.out.println(sublist1);

        //eliminar
        l1.remove(1);
        System.out.println(l1);

        //ver
        System.out.println(l1.get(3));

        //reemplazar
        l1.set(0, 5);
        System.out.println(l1);

        //lista a array
        List<String> milista = new ArrayList<>();

        milista.add("elemento1");
        milista.add("elemento2");
        milista.add("elemento3");

        String[] listaVector = new String[milista.size()];
        milista.toArray(listaVector);
        for (String s : listaVector) {
            System.out.println(s);
        }

    }
}
