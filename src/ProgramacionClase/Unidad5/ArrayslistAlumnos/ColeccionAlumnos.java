package ProgramacionClase.Unidad5.ArrayslistAlumnos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionAlumnos {
    ArrayList<Alumno> alumnos = new ArrayList<>();
    public void menu() {
        System.out.println("1. Añadir"
        +"\n2. Borrar"
        +"\n3. Modificar"
        +"\n4. Visualizar"
        +"\n5. Salir");
    }

    public int devoler_opcion(Scanner sc) {
        System.out.println("Introduce una opción: ");
        return sc.nextInt();
    }

    public void tramitar_opcion(int opc) {

    }

    public Alumno leerDatos(Scanner sc) {
        Alumno alum = new Alumno();
        System.out.print("Introduce un nombre para el alumno: ");
        alum.setNombre(sc.nextLine().toUpperCase());
        System.out.print("Introduce una edad para el alumno: ");
        alum.setEdad(sc.nextInt());
        System.out.print("Introduce un año de nacimiento: ");
        int anio = sc.nextInt();
        System.out.print("Introduce un mes de nacimiento (en número): ");
        int mes = sc.nextInt();
        System.out.println("Introduce un día de nacimiento: ");
        int dia = sc.nextInt();
        alum.setFechaNacimiento(LocalDate.of(anio, mes, dia));
        return alum;
    }

    public void anadir(Alumno alum, ArrayList<Alumno> alumnos) {
        alumnos.add(alum);
    }
}
