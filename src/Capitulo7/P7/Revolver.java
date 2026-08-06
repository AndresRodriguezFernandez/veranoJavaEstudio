package Capitulo7.P7;
//ejercicio del libro que simula la ruleta rusa
public class Revolver {
    private int posActual;
    private final int posBala;

    public Revolver() {
        this.posActual =(int) (Math.random()*(7-1)+1);
        this.posBala = (int) (Math.random()*(7-1)+1);
    }

    public boolean disparar() {
        boolean res;
        if (this.posActual == this.posBala) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public void siguienteBala(){
        if (this.posActual == 6) {
            posActual = 0;
        }
        posActual++;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posActual=" + posActual +
                ", posBala=" + posBala +
                '}';
    }
}
