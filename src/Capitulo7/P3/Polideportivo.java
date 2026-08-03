package Capitulo7.P3;

public class Polideportivo implements Edificio, Instalacion{
    protected double superficieEdificio;
    protected String nombre;
    protected int tipoInstalacion;

    public Polideportivo(double superficieEdificio, String nombre, int tipoInstalacion){
        this.superficieEdificio=superficieEdificio;
        this.nombre=nombre;
        this.tipoInstalacion=tipoInstalacion;
    }

    @Override
    public int getTipoDeInstalacion() {
        return this.tipoInstalacion;
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
