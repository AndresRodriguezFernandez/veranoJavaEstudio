package Capitulo2;

import java.util.Scanner;

public class R6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        do {
            System.out.println("Introduzca un número. \n0 para parar:");
            numero = sc.nextInt();
            suma += numero;
        }while (numero != 0);
        System.out.println("El resultado de la suma de los valores introducidos es: " + suma);
        if (suma < 0){
            System.out.println("El resultado de la suma es negativo");
        } else if (suma == 0) {
            System.out.println("El resultado de la suma es igual a 0.");
        }else {
            System.out.println("El resultado de la suma es positivo.");
        }
    }
}
