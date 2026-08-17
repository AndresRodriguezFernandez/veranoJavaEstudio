package ProgramacionClase.Unidad2.EjsNavidad.Ej4Objetos;

import java.util.Scanner;

public class Profesor {
    private String nombre;
    private String tipo;
    private int horas_trabajadas;

    public Profesor(String nombre, int horas_trabajadas) {
        this.nombre = nombre;
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(Scanner sc) {
        String tipoActual;
        do {
            System.out.print("Introduce el tipo de profesor (Primaria/secundaria) : ");
            tipoActual = sc.nextLine().trim().toLowerCase();
        }while (!tipoActual.equals("primaria") && !tipoActual.equals("secundaria"));
        this.tipo=tipoActual;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double calcular_sueldoBruto() {
        double sueldo = 0;
        if (this.tipo.equals("secundaria")) {
            sueldo=this.horas_trabajadas*20;
        } else if (this.tipo.equals("primaria")) {
            sueldo=this.horas_trabajadas*15;
        }
        return sueldo;
    }

    public double aplicar_descuento(Scanner sc) {
        System.out.print("Introduce el descuento a aplicar: ");
        return sc.nextDouble();
    }

    public static String determinarMes(Scanner sc) {
        String mes;
        do {
            System.out.print("Introduce el mes de la nómina: ");
            mes = sc.next().trim().toUpperCase();
        }while (!mes.equals("ENERO") && !mes.equals("FEBRERO") && !mes.equals("MARZO") && !mes.equals("ABRIL") && !mes.equals("MAYO") && !mes.equals("JUNIO") && !mes.equals("SEPTIEMBRE") && !mes.equals("OCTUBRE") && !mes.equals("NOVIEMBRE") && !mes.equals("DICIEMBRE"));
        return mes;
    }

    public double retornar_sueldoNeto(double sueldoBruto, double descuento) {
        return sueldoBruto-descuento;
    }

    public void generarNomina(String mes, double sueldoBruto, double descuento, double sueldoNeto) {
        System.out.println("Nómina de: "+mes);
        System.out.println("\nTrabajador: " +this.nombre + "     Categoría: " + this.tipo);
        System.out.println("\nHoras trabajadas: "+this.horas_trabajadas);
        System.out.println("\nSueldo bruto: " + sueldoBruto);
        System.out.println("\nDescuento aplicado: " + descuento);
        System.out.println("\nSueldo neto: " + sueldoNeto);
    }
}
