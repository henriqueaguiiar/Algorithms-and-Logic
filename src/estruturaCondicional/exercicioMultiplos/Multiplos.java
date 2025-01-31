package estruturaCondicional.exercicioMultiplos;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite dois numeros: ");

        num1 = input.nextInt();
        num2 = input.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Os números são multiplos");
        }
        else {
            System.out.println("Os números não são multiplos");
        }

        input.close();
    }
}
