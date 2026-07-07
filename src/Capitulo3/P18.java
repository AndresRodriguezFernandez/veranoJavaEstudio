/*Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma:
* la posición T[n,m] debe contener n+m. Después se debe mostrar su contenido.*/
package Capitulo3;

public class P18 {
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];

        for (int fila = 0; fila < tabla.length; fila++) {
            for (int col = 0; col < tabla[fila].length; col++) {
                tabla[fila][col] = fila+col;
            }
        }

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print(tabla[f][c] + " ");
            }
            System.out.println();
        }

    }
}
