package Capitulo6.P4;

public class Principal {
    static ColaLista cl = new ColaLista();
    static double recaudacion = 0;
    static double recaudacionNinos=0, recaudacionAdolescentes=0, recuadacionAdultos=0;
    public static void main(String[] args) throws Exception {
        generarPersonas();
        despacharPersonas();
        mostrarResultados();
    }

    public static void generarPersonas(){
        int numPersonas =(int) (Math.random()*(50-0+1)+0);
        for (int i = 0; i < numPersonas; i++) {
            Persona p = new Persona((int)(Math.random()*(60-5+1)+5));
            cl.insertar(p);
        }
    }

    public static void despacharPersonas() throws Exception {
        while (!cl.colaVacia()) {
            Persona res = cl.quitar();
            if (res.getEdad() >= 5 && res.getEdad() <= 10) {
                recaudacion += 2;
                recaudacionNinos += 2;
            } else if (res.getEdad() >= 11 && res.getEdad() <= 17) {
                recaudacion += 3.5;
                recaudacionAdolescentes += 3.5;
            } else if (res.getEdad() >= 18) {
                recaudacion += 4.5;
                recuadacionAdultos += 4.5;
            }
        }
    }

    public static void mostrarResultados(){
        System.out.println("RECAUDACIÓN TOTAL: " + recaudacion);
        System.out.println("Recaudación por parte de niños: " + recaudacionNinos);
        System.out.println("Recaudación por pare de adolescentes: "+recaudacionAdolescentes);
        System.out.println("Recaudación por parte de adultos: " + recuadacionAdultos);
    }
}
