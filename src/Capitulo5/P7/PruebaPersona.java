package Capitulo5.P7;

import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de la primera persona: ");
        String nombre = sc.next();
        sc.nextLine();
        System.out.println("Introduce la edad de la primera persona: ");
        int edad= sc.nextInt();
        System.out.println("Introduce el sexo de la primera persona (H/M): ");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Introduce el peso de la primera persona: ");
        double peso = sc.nextDouble();
        System.out.println("introduce la altura de la primera persona: ");
        double altura = sc.nextDouble();
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        p1.generaDNI();
        if (p1.calcularIMC()>)
        System.out.println(p1.toString());
    }
}
