package Capitulo7.P1;

public class Principal {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro();

        l1.setAutor("Cervantes");
        l1.setTitulo("El quijote");
        l1.setIsbn("123456ABCD");
        l1.setNumPags(450);

        l2.setAutor("Bosch");
        l2.setTitulo("Cómo reparar tu lavadora");
        l2.setIsbn("9875432CBA");
        l2.setNumPags(100);

        System.out.println(l1.toString());
        System.out.println(l2.toString());

        if (l1.getNumPags() > l2.getNumPags()) {
            System.out.println(l1.getTitulo() + " tiene mas páginas que " + l2.getTitulo());
        } else if (l2.getNumPags() > l1.getNumPags()) {
            System.out.println(l2.getTitulo() + " tiene mas páginas que " + l1.getTitulo());
        }else {
            System.out.println("Ambos libros tienen el mismo números de páginas.");
        }
    }
}
