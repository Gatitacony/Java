package src;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Franciny Huaiquil";
        String tipoCuenta = "Corriente";
        double saldo = 10000;
        int option = 0;

        // Crear un formateador para moneda en la configuración regional de Chile
        NumberFormat formatoCLP = NumberFormat.getCurrencyInstance(new Locale("es", "CL"));

        System.out.println("*******************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo disponible es: " + formatoCLP.format(saldo));
        System.out.println("\n*******************");
        
        String menu = 
        """
                *** Escriba el número de la opción deseada ***
                1 - Consultar Saldo 
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (option != 9) {
            System.out.println(menu);
            option = teclado.nextInt();

            switch (option) {
                case 1:
                    
                    System.out.println("El saldo actualizado es:" + formatoCLP.format(saldo));
                    break;

                case 2:
                System.out.println("¿Cual es el valor que desea retirar?" );
                double valorRetirar = teclado.nextDouble();
                if (valorRetirar > saldo) {
                    System.out.println("Saldo insuficiente");
                    
                } else{
                    saldo = saldo - valorRetirar;
                    System.out.println("El saldo actualizado es:"+ formatoCLP.format(saldo));
                }
                    break;

                case 3:
                    System.out.println("¿Cual es e valor que desea depositar?");
                    double valorDepositar = teclado.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("El saldo actualizado es:"+ formatoCLP.format(saldo));
                    break;
                
                case 9:
                 System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }        
}
}
