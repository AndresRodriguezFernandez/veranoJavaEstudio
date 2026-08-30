package ProgramacionClase.Unidad5.ArraysBidimensionales.Ej2;
import java.util.Scanner;

public class Matriz {
    private int[][] primera = new int[3][3];

    public int[][] cargar(Scanner sc) {
        for (int i = 0; i < primera.length; i++){
            for (int j = 0; j < primera[i].length; j++) {
                System.out.print("Introduce un valor: ");
                primera[i][j] = sc.nextInt();
            }
        }
        return primera;
    }

    public int[][] crear() {
        int[][] segunda = new int[2][3];
        int fila = 0;
        int colum = 0;
        for (int i = 0; i < segunda.length; i++){
            for (int j = 0; j < segunda[i].length; j++) {
                if (i == 0) {
                    segunda[i][j] = primera[fila][colum];
                    fila++;
                    colum++;
                } else if (i == 1) {
                    segunda[i][j] = primera[fila][colum];
                    fila++;
                    colum--;
                }
            }
            colum = primera.length-1;
            fila = 0;
        }
        return segunda;
    }
}
