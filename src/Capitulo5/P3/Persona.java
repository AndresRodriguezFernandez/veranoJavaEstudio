package Capitulo5.P3;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    public Persona(){}

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        if (edad > 18){
            return nombre + " " + apellidos + " con DNI " +dni + " es mayor de edad.";
        }else {
            return nombre + " " + apellidos + " con DNI " +dni + " no es mayor de edad.";
        }
    }
}
