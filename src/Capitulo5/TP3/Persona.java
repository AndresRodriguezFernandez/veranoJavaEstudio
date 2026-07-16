package Capitulo5.TP3;

public class Persona {
    String nombre;
    String apellidos;
    String telefono;
    private int nInstancias = 0;

    /**
     * Constructor con parámetros
     * @param nombre Nombre del contacto
     * @param apellidos Apellidos del contacto
     * @param telefono Teléfono del contacto
     * */
    public Persona(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    /**
     * @return Nombre del contacto
     * */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Teléfono del contacto
     * */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @return Apellido/s del contacto
     * */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Cambia el teléfono del contacto
     * @param nuevoTelf nuevo teléfono del contacto
     */
    public void setTelefono(String nuevoTelf) {
        telefono = nuevoTelf;
    }

    /**
     * Cambia el nombre del contacto
     * @param nombre    nuevo nombre del contacto
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Cambia los apellidos del contacto
     * @param apellidos nuevos apellidos del contacto
     */
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    /**
     * Constructor por defecto
     * */
    Persona(){
        nInstancias++;
    }

    /**
     * Devuelve el número de instancias creadas
     * @return el número de instancias
     */
    public int getnInstancias(){
        return nInstancias;
    }
}
