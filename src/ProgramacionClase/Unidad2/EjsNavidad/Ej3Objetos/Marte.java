package ProgramacionClase.Unidad2.EjsNavidad.Ej3Objetos;

public class Marte {
    public static void main(String[] args) {
        Marciano et1 = new Marciano("ET");
        et1.indicar_nacimiento();
        System.out.println(et1.contarMarcianos());
        Marciano et2 = new Marciano("ET 2.0");
        et2.indicar_nacimiento();
        System.out.println(et2.contarMarcianos());
        Marciano et3 = new Marciano("ET 3.0");
        et3.indicar_nacimiento();
        System.out.println(et3.contarMarcianos());
        et2.indicar_muerte();
        Marciano et4 = new Marciano("ET 4.0");
        et4.indicar_nacimiento();
        System.out.println(et1.getNombre() + " vivo: "+ et1.comprobar_vivo());
        System.out.println(et2.getNombre() + " vivo: "+ et2.comprobar_vivo());
        System.out.println(et3.getNombre() + " vivo: "+ et3.comprobar_vivo());
        System.out.println(et4.getNombre() + " vivo: "+ et4.comprobar_vivo());
    }

}
