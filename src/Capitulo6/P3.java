package Capitulo6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P3 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Double> alturas = new ArrayList<>();
    public static int numerosAlumnos() {
        System.out.print("Introduce el número de alumnos de la clase: ");
        return sc.nextInt();
    }

    public static void leerAlturas(ArrayList<Double> alturas, int numAlumnos){
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduce una altura a añadir ("+ (numAlumnos-i)+ " restantes): ");
            alturas.add(sc.nextDouble());
        }
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;
        Iterator<Double> it = alturas.iterator();
        while (it.hasNext()) {
            suma += it.next();
        }
        return suma/alturas.size();
    }

    public static void mostrarResultados(ArrayList<Double> alturas, Double media) {
        Iterator<Double> it = alturas.iterator();
        int superior = 0;
        int inferior = 0;
        System.out.println("Alturas introducidas:");
        while (it.hasNext()){
            double alt = it.next();
            System.out.println(alt);
            if (alt < media) {
                inferior++;
            } else if (alt > media) {
                superior++;
            }
        }

        /*
        Mi manera
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media) {
                inferior++;
            } else if (alturas.get(i) > media) {
                superior++;
            }
        }
         */

        System.out.println("Alumnos con altura superior a la media: " + superior + "\nAlumnos con altura " +
                "inferior a la media: " + inferior + "\nMedia: " + media);

    }

    public static void main(String[] args) {
        leerAlturas(alturas, numerosAlumnos());
        mostrarResultados(alturas, calcularMedia(alturas));
    }
}
