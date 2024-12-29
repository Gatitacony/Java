package src;

public class Temperatura {
    public static void main(String[] args) {
                        // Declarar la variable para la temperatura en grados Celsius
                        double celsius = 25.0; // Puedes cambiar este valor para probar diferentes temperaturas
        
                        // Convertir Celsius a Fahrenheit usando la fórmula
                        double fahrenheit = (celsius * 1.8) + 32;
                
                        // Imprimir el valor convertido con decimales
                        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit + "°F");
                
                        // Crear una variable entera para Fahrenheit sin decimales
                        int fahrenheitSinDecimales = (int) fahrenheit;
                
                        // Imprimir el valor convertido sin decimales
                        System.out.println("La temperatura en Fahrenheit sin decimales es: " + fahrenheitSinDecimales + "°F");
    }
}
