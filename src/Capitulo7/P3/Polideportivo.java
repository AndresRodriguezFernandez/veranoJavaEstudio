package Capitulo7.P3;

public class Polideportivo implements Edificio, Instalacion{
    protected double superficieEdificio;
    protected String nombre;

    public Polideportivo(double superficieEdificio, String nombre){
        this.superficieEdificio=superficieEdificio;
        this.nombre=nombre;
    }

    @Override
    public int getTipoDeInstalacion() {
        return 0;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficieEdificio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "superficieEdificio=" + superficieEdificio +
                ", nombre='" + nombre + '\'' +
                getTipoDeInstalacion() + '}';
    }
}
