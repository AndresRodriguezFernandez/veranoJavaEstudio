/*Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna.*/
package Capitulo3;

public class P24 {
    public static void main(String[] args) {
        int[][] tabla = new int[10][10];

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                tabla[f][c] = (int) (Math.random()*10);
            }
        }

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print(tabla[f][c] + " ");
            }
            System.out.println();
        }

        int filasSuma = 0;
        for (int filas = 0; filas < tabla.length; filas++) {
            for (int col = 0; col < tabla[filas].length; col++) {
                filasSuma += tabla[filas][col];
            }
            System.out.println("Suma de la fila " + filas + " : " + filasSuma);
            filasSuma = 0;
        }

        System.out.println("----------------");
        int sumaColumnas = 0;
        for (int col = 0; col < tabla.length; col++) {
            for (int fila = 0; fila < tabla[col].length; fila++) {
                sumaColumnas += tabla[fila][col];
            }
            System.out.println("Suma de la columna " + col + " : " + sumaColumnas);
            sumaColumnas = 0;
        }


    }
}
