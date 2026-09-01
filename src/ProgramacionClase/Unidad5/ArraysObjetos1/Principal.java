package ProgramacionClase.Unidad5.ArraysObjetos1;

import java.util.Scanner;

public class Principal {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static Alumno leerDatos(Scanner sc) {
        char opcion;
        do {
            System.out.println("Introduce una opción (A/B/M): ");
            opcion = sc.next().toUpperCase().charAt(0);
        }while (opcion != 'A' && opcion != 'B' && opcion != 'C');
        return new Alumno(opcion);
    }

    public static Alumno[] cargar() {
        System.out.println("Introduce un número de alumnos: ");
        int numAlumnos = sc.nextInt();
        Alumno[] alumnos = new Alumno[numAlumnos];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = leerDatos(sc);
        }
        return alumnos;
    }
}
