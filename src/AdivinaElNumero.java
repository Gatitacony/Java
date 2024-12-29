package src;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 100
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);

        // Crear el escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar las variables
        int intentos = 0;
        int maxIntentos = 5;
        boolean adivinado = false;

        System.out.println("Bienvenido al juego de adivinanzas!");
        System.out.println("Intenta adivinar el número secreto entre 0 y 100.");
        System.out.println("Tienes " + maxIntentos + " intentos.");

        // Bucle para controlar los intentos del usuario
        while (intentos < maxIntentos) {
            System.out.print("Ingresa tu intento: ");
            int intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                adivinado = true;
                break;
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número secreto es menor. Intenta de nuevo.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}