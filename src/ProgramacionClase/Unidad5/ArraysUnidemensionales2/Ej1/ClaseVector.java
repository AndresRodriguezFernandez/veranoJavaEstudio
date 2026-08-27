package ProgramacionClase.Unidad5.ArraysUnidemensionales2.Ej1;

import java.util.Scanner;

public class ClaseVector {
    int[] vector1 = new int[7];

    public void cargar(Scanner sc) {
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Introduzca un valor para la posición "+i+" : ");
            vector1[i] = sc.nextInt();
        }
    }

    public void ordenar() {
        for (int i = 0; i < vector1.length-1; i++) {
            if (vector1[i] > vector1[i+1]) {
                int anterior = vector1[i];
                vector1[i] = vector1[i+1];
                vector1[i+1] = anterior;
            }
        }
    }

    public int meter_numero(Scanner sc){
        byte num;
        do {
            System.out.print("Introduce un número entre 3 y 10 para buscar en el vector: ");
            num = sc.nextByte();
        }while (num < 3 || num > 10);
        return num;
    }

    public void buscar(int num) {
        boolean encontrado = false;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] == num) {
                encontrado = true;
                System.out.println("El número se encuentra en la posición " + vector1[i]);
            }
        }
        if (!encontrado) {
            System.out.println("El número no se encuentra en el vector.");
        }
    }
}
