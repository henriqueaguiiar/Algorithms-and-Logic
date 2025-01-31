package estruturaCondicional.exercicioOperadora;

import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = input.nextInt();

        double valorPagar = 50.00;

        if(minutos > 100) {
            valorPagar = valorPagar + 2.00 * (minutos - 100);
            System.out.println("Valor a pagar: "+ valorPagar);
        }
        else{
            System.out.println("Valor a pagar: "+ valorPagar);
        }
        input.close();
    }
}
