/*Hacer un programa que acepte un String por teclado. Por la salida queremos que nos diga cuántas letras tiene
(contando espacio en blanco si es que los tiene)*/
package Capitulo3;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Introduce una palabra: ");
        palabra = sc.nextLine();
        System.out.println(palabra.length());
    }
}
