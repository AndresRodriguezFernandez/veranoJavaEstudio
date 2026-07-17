package Capitulo5.TP21yTP22;

public class DemoProtected {
    public static void main(String[] args) {
        LibroxExt libros[] = new LibroxExt[5];

        libros[0] = new LibroxExt("Aprendindo a programar en Java", "Sonia...", 2015, "ELIZCOM");
        libros[1] = new LibroxExt("Estructuras de Datos en Java", "Mark Allen Weis", 2013, "Addison Wesley");
        libros[2] = new LibroxExt("Fundamentos...", "Ricardo...", 2012, "Macro");
        libros[3] = new LibroxExt("Introducción...", "Francisco...", 2014, "Desconocido");
        libros[4] = new LibroxExt("Java Cómo Programar", "Paul Deitel", 2017, "Pearson");

        for (int i = 0; i < libros.length; i++){
            libros[i].mostrar();
        }

        System.out.println("Mostrando todos los títulos de Paul Deitel: ");
        for (int i = 0; i < libros.length; i++){
            if (libros[i].getAutor()=="Paul Deitel") {
                System.out.println(libros[i].getTitulo());
            }
            libros[i].titulo = "Titulo de prueba";
        }


    }
}
