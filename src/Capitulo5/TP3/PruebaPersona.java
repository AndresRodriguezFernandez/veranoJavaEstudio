package Capitulo5.TP3;
/**
 * Esta clase se creó con el fin de comprobar el funcionamiento de la clase Persona
 * @author Andrés
 * @version 1.0
 * */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona unaPersona = new Persona("Andrés", "Rodríguez", "123456789");
        Persona otraPersona = new Persona();

        System.out.println("Muestra información utilizando getters (que es la manera corecta):");
        System.out.println("Nombre: " + unaPersona.getNombre());
        System.out.println("Apellidos: " + unaPersona.getApellidos());
        System.out.println("Teléfono: " + unaPersona.getTelefono());
        System.out.println();

        otraPersona.setNombre("Andrew");
        otraPersona.setApellidos("R");
        otraPersona.setTelefono("987654321");

        System.out.println(otraPersona.getNombre());
        System.out.println(otraPersona.getApellidos());
        System.out.println(otraPersona.getTelefono());

    }
}
