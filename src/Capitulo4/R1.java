/*Crea un programa que nos genere una cantidad de números enteros aleatorios que nostros
* le pasaremos por teclado. Crea un metodo donde pasamos como parámetros entre qué números
* queremos que los genere, podemos pedirlas por teclado antes de generar los números.
* Este metodo devolverá un número aleatorio. Muestra estos números por pantalla.
**/
package Capitulo4;

import java.util.Enumeration;
import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, limiteMin, limiteMax;

        System.out.print("Introduce el número de números que quieras generar: ");
        num = sc.nextInt();
        System.out.println("Entre qué números quieres que los genere? Limite mínimo: ");
        limiteMin = sc.nextInt();
        System.out.println("Límite máximo: ");
        limiteMax = sc.nextInt();


        for (int i = 0; i < num; i++) {
            System.out.println(generador(limiteMin, limiteMax));
        }
    }

    public static int generador(int limiteMin, int limiteMax) {
        return (int) Math.floor(Math.random()*(limiteMax-limiteMin)+limiteMin);
    }
}
