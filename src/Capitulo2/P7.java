package Capitulo2;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para comprobar si es múltiplo de 2 o de 3 o ambos: ");
        num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El número introducido es múltiplo de 2 y de 3.");
        } else if (num % 2 == 0) {
            System.out.println("El número introducido es múltiplo de 2.");
        } else if (num % 3 == 0) {
            System.out.println("El número introducido es múltiplo de 3.");
        }else {
            System.out.println("El número introducido no es múltiplo ni de 2 ni de 3.");
        }
    }
}
