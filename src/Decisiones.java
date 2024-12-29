package src;

public class Decisiones {
    public static void main(String[] args) {
        int fechaLanzamiento = 2023;
        boolean incluidoEnPlan = true;  
        double notaPelicula = 8.2;
        String plan ="plus";

        // codigo que prueba los operadores relacionales
        if (fechaLanzamiento >2024){
            System.out.println("Peliculas más populares");

        }else { 
            System.out.println("Peliculas que aun vale la pena ver");
        }


        if (incluidoEnPlan || plan.equals("plus")){
            System.out.println("Disfrute de su película");
        } else {
            System.out.println("Película no disponible en su plan");
        }
    }
}
