package Capitulo3;

import java.util.Scanner;
/*crea un programa que pida diez numeros reales por el teclado, los almacene en un array y luego lo recorra para averiguar el maximo y el minimo y mostrarlos
* por pantalla*/
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double a;
        double b;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextDouble();
        }

        //calculamos el número más grande
        a = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > a) {
                a = numeros[i];
            }
        }

        //calculamos en número más pequeño
        b = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < b) {
                b = numeros[i];
            }
        }
        System.out.println("El numero mas grande es:" + a + "\nEl numero mas pequeño es: " + b);
    }
}
