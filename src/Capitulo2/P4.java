package Capitulo2;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero entero: ");
        numero = sc.nextInt();
        if (numero % 10 == 0) {
            System.out.println("El número introducido es múltiplo de 10. \nIntroduzca un nuevo número para comprobar si este es también múltiplo de 10: ");
            int num2 = sc.nextInt();
            if (num2 % 10 == 0) {
                System.out.println("Ambos números son múltiplos de 10.");
            }else {
                System.out.println("Este último número no es múltiplo de 10.");
            }
        }else {
            System.out.println("El número introducido no es múltiplo de 10. \nFin del programa.");
        }
    }
}
