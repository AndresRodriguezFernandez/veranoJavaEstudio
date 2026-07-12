//devuelve si un número es positivo o negativo
package Capitulo4;

import java.util.Scanner;

public class P2 {

    boolean comprobacion(int num) {
        if (num < 0) {
            return false;
        }
        return true;
    }

    void imprimir(boolean resultado) {
        if (resultado){
            System.out.println("El número es positivo");
        }else {
            System.out.println("El número es negativo");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P2 p2 = new P2();
        System.out.println("Introduce número: ");
        int num = sc.nextInt();
        p2.imprimir(p2.comprobacion(num));
    }
}
