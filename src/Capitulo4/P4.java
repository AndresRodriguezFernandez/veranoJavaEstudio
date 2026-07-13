package Capitulo4;

import java.util.Scanner;

public class P4 {
    int[][] grupos = new int[4][3];
    static Scanner sc = new Scanner(System.in);

    int selectorCurso() {
        System.out.println("Introduce el curso: ");
        return sc.nextInt() - 1;
    }

    int selectorGrupo() {
        System.out.println("Ahora introduce el ggrupo: ");
        String grupo = sc.next().toUpperCase();
        int selec = 5;
        if (grupo.equals("A")) {
            selec = 0;
        } else if (grupo.equals("B")) {
            selec = 1;

        } else if (grupo.equals("C")) {
            selec = 2;
        }
        return selec;
    }

    void annadir(int fila, int columna) {
        System.out.println("¿Cuantos alumno desea añadir?");
        int alum = sc.nextInt();
        grupos[fila][columna] += alum;
        System.out.println("Alumnos añadidos con ÉXITO.");
    }

    void eliminar(int fila, int columna) {
        System.out.println("¿Cuantos alumno desea eliminar?");
        int alum = sc.nextInt();
        grupos[fila][columna] -= alum;
        System.out.println("Alumnos eliminados con ÉXITO.");
    }

    void alumnosClase(int fila, int columna) {
        System.out.println("En la clase hay " + grupos[fila][columna] + " alumnos.");
    }


    public static void main(String[] args) {
        P4 p4 = new P4();
        int opcion;
        do {
            System.out.println("1.Añadir alumno " +
                    "\n2.Eliminar alumno" +
                    "\n3.Alumnos en clase" +
                    "\n4.Salir" + "\nElige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    p4.annadir(p4.selectorCurso(), p4.selectorGrupo());
                    break;
                case 2:
                    p4.eliminar(p4.selectorCurso(), p4.selectorGrupo());
                    break;
                case 3:
                    p4.alumnosClase(p4.selectorCurso(), p4.selectorGrupo());
                    break;
                default:
                    break;
            }
        }while (opcion != 4);
        System.out.println("Proceso terminado.");
    }
}
