package Capitulo5.P8;


import java.time.LocalDate;
import java.time.Period;

public class Personaa {
    private LocalDate fecha;

    public Personaa(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int anios(){
        return Period.between(fecha, LocalDate.now()).getYears();
    }
}
