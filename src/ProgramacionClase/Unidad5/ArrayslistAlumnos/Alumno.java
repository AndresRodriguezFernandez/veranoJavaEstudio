package ProgramacionClase.Unidad5.ArrayslistAlumnos;

import java.time.LocalDate;

public class Alumno {
    private int edad;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Alumno() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
