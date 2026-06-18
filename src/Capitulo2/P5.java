package Capitulo2;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número a multiplicar: ");
        numero = sc.nextInt();
        if (numero == 0) {
            System.out.println("El producto de 0 por cualquier número es 0.");
        }else {
            System.out.println("Introduce el segundo número: ");
            int num2 = sc.nextInt();
            int resultado = numero*num2;
            System.out.println("El resultado es: " + resultado);
        }
    }
}
