package Capitulo5.P8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la fecha de nacimiento(dd/mm/aaaa): ");
        String fecha = sc.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha, formato);

        Personaa p1 = new Personaa(fechaNacimiento);
        System.out.println("La persona tiene " + p1.anios() + " años.");
    }
}
