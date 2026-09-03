package ProgramacionClase.Unidad5.ArraysObjetos1;

import java.util.Scanner;

public class Principal {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        Alumno[] alumnos1 = cargar();
        Alumno[] alumnos2 = pasar(alumnos1);
        visualizar(alumnos1, alumnos2);
    }

    public static Alumno leerDatos(Scanner sc) {
        char opcion;
        System.out.print("Introduce una nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce un número de matrícula: ");
        int numMatr = sc.nextInt();
        do {
            System.out.println("Introduce una opción (A/B/M): ");
            opcion = sc.next().toUpperCase().charAt(0);
        }while (opcion != 'A' && opcion != 'B' && opcion != 'M');
        sc.nextLine();
        return new Alumno(numMatr, nombre, opcion);
    }

    public static Alumno[] cargar() {
        System.out.println("Introduce un número de alumnos: ");
        int numAlumnos = sc.nextInt();
        sc.nextLine();
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
                alumnos2[i] = new Alumno(alumnos[i].getnMatricula(), alumnos[i].getNombre(), alumnos[i].getOpcion());
            }
            if (alumnos[i].getOpcion() == 'B') {
                alumnos2[i] = null;
            }
            if (alumnos[i].getOpcion() == 'M') {
                System.out.print("Introduce el nuevo nombre: ");
                String nuevoNombre = sc.nextLine();
                alumnos2[i] = new Alumno (alumnos[i].getnMatricula(), nuevoNombre, alumnos[i].getOpcion());
            }
        }
        return alumnos2;
    }

    public static void visualizar(Alumno[] alu1, Alumno[] alu2) {
        System.out.println("----Primer vector-----");
        for (int i = 0; i < alu1.length; i++) {
            System.out.println(alu1[i].toString());
        }
        System.out.println("---Segundo vector----");
        for (int i = 0; i < alu2.length; i++) {
            if (alu2[i] != null) {
                System.out.println(alu2[i].toString());
            }
        }
    }
}
