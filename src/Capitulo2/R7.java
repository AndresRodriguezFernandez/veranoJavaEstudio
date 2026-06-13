package Capitulo2;

import java.util.Scanner;

public class R7 {
    public static boolean esArmstrong(int numero) {
        int numeroDescomponer = numero;
        int suma = 0;
        for (int i = 0; i<3; i++) {
            int digito = numeroDescomponer%10;
            numeroDescomponer/=10;
            suma += Math.pow(digito, 3);
        }
        System.out.println("El resultado de la suma es: " +suma);
        if (suma == numero) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("introduce un número de 3 cifras: ");
            numero = sc.nextInt();
        }while (numero < 100 || numero > 999);

        if (esArmstrong(numero)) {
            System.out.println("El número es Armstrong.");
        }else {
            System.out.println("El número NO es Armstrong.");
        }
    }
}
