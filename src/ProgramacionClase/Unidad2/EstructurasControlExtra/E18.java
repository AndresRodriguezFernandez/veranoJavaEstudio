package ProgramacionClase.Unidad2.EstructurasControlExtra;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int importeTotal = 0;
        int agua = 0;
        int zumo = 0;
        int cafe = 0;
        int aguaPrecio = 0;
        int zumoPrecio = 0;
        int cafePrecio = 0;
        System.out.println("1. Agua - 1€"
                +"\n2. Zumo - 2€"
                +"\n3. Café - 1€"
                +"\n4. Terminar");
        int opc;
        do {
            System.out.print("Opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    importeTotal+=1;
                    System.out.println("Has añadido: Agua (1€). " + "Total:"+importeTotal);
                    agua++;
                    aguaPrecio+=1;
                    break;
                case 2:
                    importeTotal+=2;
                    System.out.println("Has añadido: Zumo (2€). " + "Total:"+importeTotal);
                    zumo++;
                    zumoPrecio+=2;
                    break;
                case 3:
                    importeTotal+=1;
                    System.out.println("Has añadido: Café (1€). " + "Total:"+importeTotal);
                    cafe++;
                    cafePrecio+=1;
                case 4:
                    break;
                default:
                    System.out.println("Error. Opción no válida.");
            }
        }while (opc != 4);
        System.out.println("--- RESUMEN ---");
        System.out.println("Agua: " + agua + " ud -> "+ aguaPrecio+"€");
        System.out.println("Zumo: " + zumo + " ud -> "+ zumoPrecio+"€");
        System.out.println("Café: " + cafe + " ud -> "+ cafePrecio+"€");
        System.out.println("TOTAL: "+ importeTotal + "€");
    }
}
