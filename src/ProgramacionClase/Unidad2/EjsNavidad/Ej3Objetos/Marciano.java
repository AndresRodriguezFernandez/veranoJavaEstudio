package ProgramacionClase.Unidad2.EjsNavidad.Ej3Objetos;

public class Marciano {
    private boolean vivo = true;
    private String nombre;
    private static int num_marcianos;
    private final String SOY = "marciano";

    public Marciano(String nombre) {
        this.nombre = nombre;
        num_marcianos++;
    }

    public void indicar_nacimiento(){
        System.out.println("Hola, he nacido y soy el "+SOY +" "+ this.nombre);
    }

    public void indicar_muerte() {
        if (this.vivo) {
            this.vivo=false;
            System.out.println("El marciano "+this.nombre+ " ha muerto.");
            num_marcianos--;
        }else {
            System.out.println("El marciano ya está muerto.");
        }
    }

    public boolean comprobar_vivo(){
        return this.vivo;
    }

    public int contarMarcianos(){
        return num_marcianos;
    }


    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
