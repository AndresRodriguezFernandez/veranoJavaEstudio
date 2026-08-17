package ProgramacionClase.Unidad2.EjsNavidad.EJ2Objetos;

import java.util.Scanner;

public class Trabajador {
    private String nombre;
    private byte edad;
    private String categoria;
    private String antiguedad;

    public void setNombre(Scanner sc) {
        System.out.println("Introduce un nombre para el empleado: ");
        this.nombre = sc.next();
        sc.nextLine();
    }

    public void setEdad(Scanner sc) {
        System.out.println("Introduce una edad para el empleado: ");
        this.edad = sc.nextByte();
        sc.nextLine();
    }

    public void setCategoria(Scanner sc) {
        do {
            System.out.println("Introduce una categoría para el empleado: ");
            this.categoria = sc.nextLine().toLowerCase().trim();
        }while (!this.categoria.equals("empleado") && !this.categoria.equals("encargado") && !this.categoria.equals("directivo"));
    }

    public void setAntiguedad(Scanner sc) {
        do {
            System.out.println("Introduce la experiencia para el empleado: ");
            this.antiguedad = sc.nextLine().trim().toLowerCase();
        }while (!antiguedad.equals("novato") && !antiguedad.equals("maduro") && !antiguedad.equals("experto"));
    }

    public double calcularSueldo(){
        double sueldoBase = 607;
        double plus = 0;
        if (this.categoria.equals("encargado")) {
            plus+=35*sueldoBase/100;
        } else if (this.categoria.equals("directivo")) {
            plus+=60*sueldoBase/100;
        }else {
            plus+=15*sueldoBase/100;
        }
        if (this.antiguedad.equals("maduro")){
            plus+=300;
        } else if (this.antiguedad.equals("experto")) {
            plus+=600;
        }else {
            plus+=150;
        }
        return sueldoBase+plus;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "antiguedad='" + antiguedad + '\'' +
                ", categoria='" + categoria + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
