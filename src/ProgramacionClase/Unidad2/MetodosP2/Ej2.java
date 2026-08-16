package ProgramacionClase.Unidad2.MetodosP2;

import java.util.Scanner;

public class Ej2 {
    static Scanner sc = new Scanner(System.in);
    public static int leerEntero(){
        ;
        System.out.print("Introduzca un número por pantalla: ");
        return sc.nextInt();
    }

    public static boolean comprobarNumero(int num) {
        if (num > 999 && num <= 9999 || num == 0) {
            return true;
        }else {
            return false;
        }
    }

    //si devuelve true es que es impar, si devuelve false es que es par
    public static boolean determinarParImpar(int num) {
        boolean impar = false;
        while (num > 0){
            int cifra = num % 10;
            num/=10;
            if (cifra % 2 != 0) {
                impar = true;
            }
        }
        return impar;
    }

    public static void visualizarResultado(int num, boolean impar) {
        if (impar) {
            System.out.println("El número " + num + " tiene dígitos impares.");
        }else {
            System.out.println("El número " +num + " tiene todos los dígitos pares.");
        }
    }

    public static void run(){
        int num;
        boolean seguir = true;
        while (seguir){
            do {
                num =leerEntero();
            }while (!comprobarNumero(num));
            if (num != 0) {
                visualizarResultado(num, determinarParImpar(num));
            } else if (num == 0) {
                seguir = false;
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
