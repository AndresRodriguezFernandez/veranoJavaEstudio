package Capitulo2;

import java.util.Scanner;

public class R6Separado {
    public static int suma() {
        Scanner sc = new Scanner(System.in);
        int numero;
        int sumaN = 0;
        do {
            System.out.println("Introduzca un número. \n0 para parar:");
            numero = sc.nextInt();
            sumaN += numero;
        }while (numero != 0);
        System.out.println("El resultado de la suma es: " + sumaN);
        return sumaN;
    }

    public static void comprobacion(int suma) {
        if (suma < 0){
            System.out.println("El resultado de la suma es negativo");
        } else if (suma == 0) {
            System.out.println("El resultado de la suma es igual a 0.");
        }else {
            System.out.println("El resultado de la suma es positivo.");
        }
    }
    public static void main(String[] args) {
        comprobacion(suma());
    }
}
