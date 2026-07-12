package Capitulo4;

import java.util.Scanner;

public class P4 {
    void annadir() {
        System.out.println("Introduce el curso: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P4 p4 = new P4();
        int opcion;
        do {
            System.out.println("1.Añadir alumno + " +
                    "\n2.Eliminar alumno" +
                    "\n3.Alumnos en clase" +
                    "\n4.Salir" + "\nElige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    p4.annadir();
            }
        }while (opcion != 4);



    }
}
