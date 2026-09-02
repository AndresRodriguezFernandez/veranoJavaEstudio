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

    public static Alumno[] pasar(Alumno[] alumnos) {
        Alumno[] alumnos2 = new Alumno[alumnos.length];
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getOpcion() == 'A') {
                System.out.println("Introduce el número de matricula: ");
                alumnos2[i].setnMatricula(sc.nextInt());
                System.out.println("Introduce el nombre del alumno: ");
                alumnos2[i].setNombre(sc.nextLine());
            }
            if (alumnos[i].getOpcion() == 'B') {
                alumnos2[i] = alumnos[i];
            }
            if (alumnos[i].getOpcion() == 'M') {
                System.out.println("Introduce el nombre del alumno: ");
                alumnos2[i].setNombre(sc.nextLine());
                System.out.println("Introduce el número de matricula: ");
                alumnos2[i].setnMatricula(sc.nextInt());
            }
        }
        return alumnos2;
    }

    public static void visualizar(Alumno[] alu1, Alumno[] alu2) {
        for (int i = 0; i < alu1.length; i++) {
            System.out.println(alu1[i].toString());
        }
    }
}
