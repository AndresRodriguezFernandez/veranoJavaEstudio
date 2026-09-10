package ProgramacionClase.Unidad5.ArrayslistAlumnos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ColeccionAlumnos {
    Scanner sc = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList<>();
    public void menu() {
        System.out.println("1. Añadir"
        +"\n2. Borrar"
        +"\n3. Modificar"
        +"\n4. Visualizar"
        +"\n5. Salir");
    }

    public int devoler_opcion() {
        System.out.println("Introduce una opción: ");
        int opc = sc.nextInt();
        sc.nextLine();
        return opc;
    }

    public void tramitar_opcion(int opc) {
        switch (opc) {
            case 1:
                anadir(leerDatos());
                break;
            case 2:
                borrar(introducir_dni());
                break;
            case 3:
                modificar(introducir_dni());
                break;
            case 4:
                visualizar();
                break;
            default:
                break;
        }
    }

    public Alumno leerDatos() {
        Alumno alum = new Alumno();
        System.out.print("Introduce el DNI del alumno: ");
        alum.setDni(sc.nextLine().toUpperCase());
        System.out.print("Introduce un nombre para el alumno: ");
        alum.setNombre(sc.nextLine());
        System.out.print("Introduce un año de nacimiento: ");
        int anio = sc.nextInt();
        System.out.print("Introduce un mes de nacimiento (en número): ");
        int mes = sc.nextInt();
        System.out.print("Introduce un día de nacimiento: ");
        int dia = sc.nextInt();
        sc.nextLine();
        alum.setFechaNacimiento(LocalDate.of(anio, mes, dia));
        System.out.println("Alumno creado.");
        return alum;
    }

    public void anadir(Alumno alum) {
        alumnos.add(alum);
    }

    public String introducir_dni() {
        System.out.print("Introduce el DNI del alumno: ");
        return sc.nextLine().toUpperCase();
    }

    public void borrar(String dni) {
        Iterator<Alumno> it = alumnos.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            if (it.next().getDni().equals(dni)) {
                it.remove();
                encontrado = true;
            }
            if (encontrado) {
                System.out.println("Proceso completado.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el DNI en la base de datos de los alumnos.");
        }
    }

    public void modificar(String dni) {
        Iterator<Alumno> it = alumnos.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            Alumno al = it.next();
            if (al.getDni().equals(dni)) {
                System.out.print("Introduce un nuevo nombre: ");
                al.setNombre(sc.nextLine());
                encontrado=true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Proceso completado.");
        }else {
            System.out.println("No se ha encontrado el DNI del del alumno en la base de datos.");
        }
    }

    public void visualizar() {
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
