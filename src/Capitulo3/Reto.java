package Capitulo3;

import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte casosPrueba;

        System.out.println("Introduce el número de casos de prueba: ");
        casosPrueba = sc.nextByte();

        String[] nombre = new String[casosPrueba];
        String[] parentesco = new String[casosPrueba];

        for (int i = 0; i < casosPrueba; i++) {
            nombre[i] = sc.next();
            parentesco[i] = sc.next();
        }

        for (int i = 0; i < casosPrueba; i++) {
            if (nombre[i].equals("Luke") && parentesco[i].equals("padre")) {
                System.out.println("TOP SECRET");
            }else {
                System.out.println(nombre[i] + ", yo soy tu " + parentesco[i]);
            }
        }
    }
}
