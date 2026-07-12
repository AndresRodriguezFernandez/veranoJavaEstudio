//Contador de cifras
package Capitulo4;

import java.util.Scanner;

public class R3 {
    public static int nCifras(int num) {
        int cont = 0;
        for (int i = num; i >= 10; i/=10) {
            cont++;
        }
        cont++;
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número entero positivo: ");
            num = sc.nextInt();
        }while (num < 0);

        int numeroCifras = nCifras(num);
        if (numeroCifras == 1) {
            System.out.println("El número tiene " + numeroCifras + " cifra.");
        }else {
            System.out.println("El número tiene " + numeroCifras + " cifras.");
        }
    }
}
