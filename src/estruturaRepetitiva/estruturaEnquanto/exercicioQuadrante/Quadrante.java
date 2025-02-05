package estruturaRepetitiva.estruturaEnquanto.exercicioQuadrante;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, y;

        System.out.println("Digite os valores de x e y: ");
        x = input.nextDouble();
        y = input.nextDouble();

        while(x != 0 || y != 0) {
           if (x > 0 && y > 0) {
                System.out.println("Quadrante Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrante Q4");
            } else if (x == 0) {
                System.out.println("Eixo Y");
            } else if (y == 0) {
                System.out.println("Eixo X");
            }
            System.out.println("Digite os valores de x e y: ");
            x = input.nextDouble();
            y = input.nextDouble();

        }
        input.close();
    }
}
