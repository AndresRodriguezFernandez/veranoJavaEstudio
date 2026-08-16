package ProgramacionClase.Unidad2.EstructurasControlExtra;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        //E1
        Scanner sc = new Scanner(System.in);
        int pasosObjetivo;
        int pasosActuales = 0;
        int nRegistros = 0;
        System.out.println("====Pasos diarios=====");
        System.out.print("Introduce la meta de pasos diaria a alcanzar: ");
        pasosObjetivo = sc.nextInt();

        do {
            System.out.print("\nPasos realizados: ");
            pasosActuales+=sc.nextInt();
            System.out.println("Total:"+pasosActuales+"/"+pasosObjetivo);
            nRegistros++;
        }while (pasosActuales < pasosObjetivo);

        System.out.println("===RESUMEN===");
        System.out.print("Número de registros: "+nRegistros
        + "\nTotal de pasos: " + pasosActuales
        +"\nResultado: ");
        if (pasosActuales == pasosObjetivo) {
            System.out.print("Completado");
        } else if (pasosActuales > pasosObjetivo) {
            System.out.print("Superado en " + (pasosActuales-pasosObjetivo) + " pasos.");
        }else {
            System.out.print("No superado");
        }

    }
}
