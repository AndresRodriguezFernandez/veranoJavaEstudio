package Capitulo5.P7;

import java.util.Scanner;

public class PruebaPersona {

    public static void resultadoIMC(Persona p){
        if (p.calcularIMC() == 1) {
            System.out.println("Esta persona tiene sobrepeso :(");
        } else if (p.calcularIMC() == 0) {
            System.out.println("Esta persona tiene un peso saludable.");
        }else if (p.calcularIMC() == -1){
            System.out.println("Esta persona tiene un peso inferior a lo recomendado.");
        }
    }

    public static void comprobarEdad(Persona p){
        if (p.esMayorDeEdad()){
            System.out.println("Esta persona es mayor de edad.");
        }else {
            System.out.println("Esta persona es menor de edad.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------Persona 1-----------");
        System.out.println("Introduce el nombre de la primera persona: ");
        String nombre = sc.nextLine();;
        System.out.println("Introduce la edad de la primera persona: ");
        int edad= sc.nextInt();
        System.out.println("Introduce el sexo de la primera persona (H/M): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        sc.nextLine();
        System.out.println("Introduce el peso de la primera persona: ");
        double peso = sc.nextDouble();
        System.out.println("introduce la altura (en metros) de la primera persona: ");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        p1.generaDNI();
        resultadoIMC(p1);
        comprobarEdad(p1);
        System.out.println(p1.toString());

        System.out.println("---------Persona 2-----------");
        System.out.println("Introduce el nombre para la persona 2: ");
        nombre = sc.nextLine();
        sc.nextLine();
        System.out.println("Introduce la edad de la persona 2: ");
        edad= sc.nextInt();
        System.out.println("Introduce el sexo de la persona 2: ");
        sexo=sc.next().toUpperCase().charAt(0);

        Persona p2 = new Persona(nombre, edad, sexo);
        p2.setPeso(70);
        p2.setAltura(200);
        p2.generaDNI();
        resultadoIMC(p2);
        comprobarEdad(p2);
        System.out.println(p2.toString());

        System.out.println("---------Persona 3-----------");
        Persona p3 = new Persona();
        p3.generaDNI();
        p3.setNombre("Paco");
        p3.setEdad(65);
        p3.setSexo('H');
        p3.setPeso(66);
        p3.setAltura(1.72);
        resultadoIMC(p3);
        comprobarEdad(p3);
        System.out.println(p3.toString());
    }
}
