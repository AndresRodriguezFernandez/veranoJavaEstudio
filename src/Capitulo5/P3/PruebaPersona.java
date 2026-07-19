package Capitulo5.P3;

import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        System.out.println("Introduce el nombre de la primera persona: ");
        p1.setNombre(sc.next());
        sc.nextLine();
        System.out.println("Introduce los apellidos de la primera persona: ");
        p1.setApellidos(sc.nextLine());
        System.out.println("Introduce la edad de la primera persona: ");
        p1.setEdad(sc.nextInt());
        System.out.println("Introduce el DNI de la primera persona: ");
        p1.setDni(sc.next());

        System.out.println("Introduce el nombre de la segunda persona: ");
        p2.setNombre(sc.next());
        sc.nextLine();
        System.out.println("Introduce los apellidos de la segunda persona: ");
        p2.setApellidos(sc.nextLine());
        System.out.println("Introduce la edad de la segunda persona: ");
        p2.setEdad(sc.nextInt());
        System.out.println("Introduce el DNI de la segunda persona: ");
        p2.setDni(sc.next());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
