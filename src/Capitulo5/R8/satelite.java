package Capitulo5.R8;

public class satelite {//error 0 , falaba la s en class
    private double meridiano;
    private double paralelo; //primer error, faltaba ;
    private double distancia_tierra;

    satelite(double meridiano, double paralelo, double distancia_tierra) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia_tierra = distancia_tierra;
    }

    satelite(){//segundo error, sin tilde
        meridiano=paralelo=distancia_tierra=0;
    }

    public void setPosicion(double m, double p, double d) { //tercer error, sobran los ; en los parametros
        meridiano = m; paralelo = p; distancia_tierra = d;
    }

    public void printPosicion( ) {
        System.out.println("El satélite se encuentra en el pararelo " + paralelo + meridiano + " a una distancia de la tierra de "+distancia_tierra+" kms"); //cuarto error, había que poner doble comilla para el texto y alguna falta de ortografía
    }

    //demas errores en el libro
}
