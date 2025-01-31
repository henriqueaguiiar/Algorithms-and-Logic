package estruturaCondicional.exercicioDardo;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double distancia1, distancia2, distancia3;

        System.out.println("Digite as 3 distancias: ");
         distancia1 = input.nextDouble();
         distancia2 = input.nextDouble();
         distancia3 = input.nextDouble();

         double maiorDistancia = distancia1;

         if(distancia2>distancia1){
             maiorDistancia = distancia2;
         }
         else {
             maiorDistancia = distancia3;
         }
        System.out.printf("Maior Distancia  = %.2f", maiorDistancia);

        input.locale();
    }
}
