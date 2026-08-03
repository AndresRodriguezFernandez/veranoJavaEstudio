package Capitulo7.P3;

public class EdificioOficinas implements Edificio{
    protected int numOficinas;
    protected double superficieEdificio;

    public EdificioOficinas(int numOficinas, double superficie){
        this.numOficinas=numOficinas;
        this.superficieEdificio=superficie;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficieEdificio;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    @Override
    public String toString() {
        return "EdificioOficinas{" +
                "numOficinas=" + numOficinas +
                ", superficieEdificio=" + superficieEdificio +
                '}';
    }
}
