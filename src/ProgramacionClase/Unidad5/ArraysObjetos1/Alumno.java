package ProgramacionClase.Unidad5.ArraysObjetos1;

public class Alumno {
    private int nMatricula;
    private String nombre;
    private char opcion;

    public Alumno(int nMatricula, String nombre, char opcion) {
        this.nMatricula = nMatricula;
        this.nombre = nombre;
        this.opcion = opcion;
    }

    public Alumno(int nMatricula, String nombre) {
        this.nMatricula = nMatricula;
        this.nombre = nombre;
    }

    public Alumno(char opcion) {
        this.opcion = opcion;
        this.nombre = "";
        this.nMatricula = 0;
    }

    public Alumno() {

    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getOpcion() {
        return opcion;
    }

    public void setOpcion(char opcion) {
        this.opcion = opcion;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nMatricula=" + nMatricula +
                ", nombre='" + nombre + '\'' +
                ", opcion=" + opcion +
                '}';
    }
}
