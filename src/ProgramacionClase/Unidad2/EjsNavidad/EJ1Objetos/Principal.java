package ProgramacionClase.Unidad2.EjsNavidad.EJ1Objetos;

public class Principal {
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera("lunes");
        c1.llenarCafetera();
        c1.servir_TazaCafe(250);
        c1.servir_TazaCafe(150);
        System.out.println(c1.toString());
        c1.vaciarCafetera();


        Cafetera c2 = new Cafetera("martes");
        c2.llenarCafetera();
        c2.servir_TazaCafe(150);
        System.out.println(c2.toString());
        c2.vaciarCafetera();

        Cafetera c3 = new Cafetera("miércoles");
        c3.llenarCafetera();
        c3.servir_TazaCafe(250);
        System.out.println(c3.toString());
        c3.vaciarCafetera();

        Cafetera c4 = new Cafetera("jueves");
        c4.llenarCafetera();
        System.out.println(c4.toString());
        c4.vaciarCafetera();

        Cafetera c5 = new Cafetera("viernes");
        c5.llenarCafetera();
        c5.servir_TazaCafe(250);
        c5.servir_TazaCafe(150);
        System.out.println(c5.toString());
        c5.vaciarCafetera();

    }
}
