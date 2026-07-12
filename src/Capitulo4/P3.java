package Capitulo4;

import java.util.Scanner;

public class P3 {
    void cadenaIa(String cadena) {
        System.out.println(cadena+"(IA)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P3 p3 = new P3();
        String cadena;
        while (true) {
            cadena = sc.next();
            if (cadena.equals("salir")) {
                break;
            }else {
                p3.cadenaIa(cadena);
            }

        }
    }
}
