package ProgramacionClase.Unidad4.FigurasGeometricas;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static char devolverCaracter(Scanner sc) {
        char op;
        do {
            System.out.print("Introduce un carácter (c/r): ");
            op = sc.next().charAt(0);
        }while (op != 'c' && op != 'r');
        return op;
    }

    public static void tratarCaracter(char caracter, Figura circulo, Figura rectangulo) {
        switch (caracter) {
            case 'c':
                circulo.imprimir();
                break;
            case 'r':
                rectangulo.imprimir();
                break;
        }
    }

    public static void main(String[] args) {
        Figura circ = new Circulo(2,3, 5);
        Figura rect = new Rectangulo(2, 3, 5, 5);
        tratarCaracter(devolverCaracter(sc), circ, rect);
    }
}
