package src;

import java.util.Scanner;
public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaLanzamiento = teclado.nextInt();
        System.out.println("Dinos que nota le das a esta Pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaLanzamiento);
        System.out.println(nota);
    }
}
