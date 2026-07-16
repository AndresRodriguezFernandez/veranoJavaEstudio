package Capitulo5.TP21yTP22;

public class DemoLibro {
    public static void main(String[] args) {
        Libros[] libros = new Libros[5];

        libros[0] = new Libros("Aprendiendo a programar en java", "Sonia Jaramillo", 2015);
        libros[1] = new Libros("Estrctuturas de datos en java", "Mark Allen Weis", 2013);
        libros[2] = new Libros("Fundamentos de programación java", "Ricardo", 2012);
        libros[3] = new Libros("Introducción a la programación orientada a objetos", "Francisco", 2014);
        libros[4] = new Libros("Java cómo programar", "Paul", 2017);

        for (int i = 0; i < libros.length; i++) {
            System.out.println("Índice: " + i);
            libros[i].mostrarPar();
        }
    }
}
