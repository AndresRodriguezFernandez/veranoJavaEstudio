package Capitulo3;

public class TP8 {
    public static void main(String[] args) {
        int [][] arr = {{2,7,9},{1,2,3},{3,3,3}};

        for (int fila = 0; fila < 3;fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(arr[fila][columna] + " ");
            }
            System.out.println();
        }

    }
}
