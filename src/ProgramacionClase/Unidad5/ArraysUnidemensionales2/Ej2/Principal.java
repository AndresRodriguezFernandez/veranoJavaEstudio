package ProgramacionClase.Unidad5.ArraysUnidemensionales2.Ej2;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static Telefono crearObjeto(Scanner sc) {
        String tipo;
        do {
            System.out.println("Introduce el tipo de teléfono: ");
            tipo = sc.nextLine();
        }while (!tipo.equalsIgnoreCase("MOVIL") && !tipo.equalsIgnoreCase("FIJO"));

        Tipo tip;
        if (tipo.equalsIgnoreCase("MOVIL")) {
            tip = Tipo.MOVIL;
        }else {
            tip = Tipo.FIJO;
        }
        return new Telefono(tip);
    }
    public static void gestionarLlamadas(Scanner sc, Telefono tel) {
        int numLlamadas;
        System.out.println("Introduce el número de llamadas: ");
        numLlamadas = sc.nextInt();

        for (int i = 0; i < numLlamadas; i++){
            System.out.println("Introduce el número: ");
            tel.apuntarLlamada(sc.nextInt());
        }
    }

    public static void main(String[] args) {
        Telefono tel = crearObjeto(sc);
        gestionarLlamadas(sc, tel);
        tel.visualizar();
    }
}
