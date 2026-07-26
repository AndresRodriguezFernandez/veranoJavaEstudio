package Capitulo6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class R2 {
    public static ArrayList leerValores() {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList<>();
        int num;
        do {
            System.out.print("Introduzca una número para añadirlo a la lista: ");
            num = sc.nextInt();
            if (num != -99) {
                lista.add(num);
            }
        }while (num != -99);
        return lista;
    }

    public static int suma(ArrayList lista) {
        Iterator<Integer> iterador = lista.iterator();
        int suma = 0;
        while (iterador.hasNext()) {
            suma += iterador.next();
        }
        return suma;
    }

    public static double media(ArrayList lista, int suma){
        return (double) suma / lista.size();
    }

    public static void mostrarResultados(ArrayList lista, int suma, double media){
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("Suma de los valores: " + suma +
                "\nMedia de los valores: " + media);
        System.out.print("Valores más grandes que la media dentro de la lista: ");
        for (int i = 0; i < lista.size(); i++){
            if ((int)lista.get(i) > media){
                System.out.print(lista.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList lista = leerValores();
        int suma = suma(lista);
        double media = media(lista, suma);
        mostrarResultados(lista, suma, media);
    }
}
