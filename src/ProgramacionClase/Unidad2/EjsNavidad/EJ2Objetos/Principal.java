package ProgramacionClase.Unidad2.EjsNavidad.EJ2Objetos;

import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador();
        t1.setNombre(sc);
        t1.setEdad(sc);
        t1.setCategoria(sc);
        t1.setAntiguedad(sc);
        System.out.println("Sueldo: " + t1.calcularSueldo());

        Trabajador t2 = new Trabajador();
        t2.setNombre(sc);
        t2.setEdad(sc);
        t2.setCategoria(sc);
        t2.setAntiguedad(sc);
        System.out.println("Sueldo: " + t2.calcularSueldo());

        Trabajador t3 = new Trabajador();
        t3.setNombre(sc);
        t3.setEdad(sc);
        t3.setAntiguedad(sc);
        t3.setCategoria(sc);
        System.out.println("Sueldo: "+t3.calcularSueldo());
    }
}
