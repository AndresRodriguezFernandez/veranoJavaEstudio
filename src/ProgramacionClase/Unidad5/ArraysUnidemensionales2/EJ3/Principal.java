package ProgramacionClase.Unidad5.ArraysUnidemensionales2.EJ3;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static Urna urna = new Urna();
    public static String decirRespuesta(Scanner sc) {
        String respuesta;
        do {
            System.out.print("¿Quieres sacar una una bola de la urna? (si/no): ");
            respuesta = sc.next().trim().toLowerCase();
        }while (!respuesta.equals("si") && !respuesta.equals("no"));

        return respuesta;
    }

    public static void continuarPrograma() {
        String respuesta = decirRespuesta(sc);
        while (respuesta.equals("si")) {
            int bola = urna.sacar_bola();
            urna.contabilizar_bola(bola);
            System.out.println("Sacaste la bola nº"+bola);
            respuesta = decirRespuesta(sc);
        }
        urna.visualizar();
    }

    public static void main(String[] args) {
        continuarPrograma();
    }
}
