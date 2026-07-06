//Recuento de cuántas "a" tiene la palabra. Mismo ejercicio base que el P10/P11.
package Capitulo3;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Introduce una palabra: ");
        palabra = sc.next();

        char[] cadena = palabra.toCharArray();

        int contador = 0;
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == 'a') {
                contador++;
            }
        }
        System.out.println("El número de 'a' encontradas en la palabra es : " + contador);
    }
}
