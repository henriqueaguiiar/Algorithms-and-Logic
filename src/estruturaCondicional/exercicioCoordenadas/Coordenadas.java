package estruturaCondicional.exercicioCoordenadas;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double  x, y;
        System.out.println("Leia os valores de X e Y");
        x = input.nextDouble();
        y = input.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if(x > 0 && y >0){
            System.out.println("Quadrante Q1");
        }
        else if(x < 0 && y > 0){
            System.out.println("Quadrante Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Quadrante Q3");
        }
        else if(x > 0 && y < 0){
            System.out.println("Quadrante Q4");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        }
        input.close();
    }
}
