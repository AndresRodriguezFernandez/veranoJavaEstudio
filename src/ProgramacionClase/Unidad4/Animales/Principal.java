package ProgramacionClase.Unidad4.Animales;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el peso del perro: ");
        double pesoPerro = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce la raza del perro: ");
        String razaPerro = sc.nextLine();
        Perro p = new Perro(pesoPerro, "perro", razaPerro);



        System.out.println("Introduce el peso de la serpiente: ");
        double pesoSerpiente = sc.nextDouble();
        sc.nextLine();
        System.out.println("Es la serpiente venenosa? (S/N)");
        char resultado = sc.next().toUpperCase().charAt(0);
        boolean vennosa;
        if (resultado == 'S') {
            vennosa=true;
        }else {
            vennosa = false;
        }
        Serpiente s = new Serpiente(pesoSerpiente, "serpiente", vennosa);


        System.out.println(p.toString());
        p.emitir_sonido();
        System.out.println(s.toString());
        s.emitir_sonido();
    }
}
