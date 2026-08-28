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

        int numLlamadas;
        System.out.println("Introduce el número de llamadas recientes: ");
        numLlamadas = sc.nextInt();

        Tipo tip;
        if (tipo.equalsIgnoreCase("MOVIL")) {
            tip = Tipo.MOVIL;
        }else {
            tip = Tipo.FIJO;
        }

        return new Telefono(tip,numLlamadas);
    }
    public static void gestionarLlamadas(Scanner sc, Telefono tel) {
        for (int i = 0; i < tel.getLlamadasRecientes().length; i++){
            System.out.println("Introduce el número: ");
            tel.apuntarLlamada(sc.nextInt(), i);
        }
    }

    public static void main(String[] args) {
        Telefono tel = crearObjeto(sc);
        gestionarLlamadas(sc, tel);
        tel.visualirzar();
    }
}
