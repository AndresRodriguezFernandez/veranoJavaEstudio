package Capitulo2;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce el primer número a dividir: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número entre el que se dividirá el primero: ");
        num2 = sc.nextInt();
        if (num2 == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
        }else {
            int resultado = num1/num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}
