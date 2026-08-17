package ProgramacionClase.Unidad2.EjsNavidad.Ej4Objetos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Profesor p1 = new Profesor("Manolo", 200);
        Profesor p2 = new Profesor("Roberto", 250);

        String mes = Profesor.determinarMes(sc);
        p1.setTipo(sc);
        double sueldoBruto = p1.calcular_sueldoBruto();
        double descuento = p1.aplicar_descuento(sc);
        double sueldoTotal1 = p1.retornar_sueldoNeto(sueldoBruto, descuento);
        p1.generarNomina(mes, sueldoBruto, descuento, sueldoTotal1);
        sc.nextLine();

        p2.setTipo(sc);
        double sueldoBruto2 = p2.calcular_sueldoBruto();
        double descuento2 = p2.aplicar_descuento(sc);
        double sueldoTotal2 = p2.retornar_sueldoNeto(sueldoBruto2, descuento2);
        p2.generarNomina(mes, sueldoBruto2, descuento2,sueldoTotal2);

        System.out.println("El total pagado por la empresa a los trabajadores de "+mes+" es de "+(sueldoTotal1+sueldoTotal2)+" euros.");
    }
}
