package vetores;

import java.util.Locale;
import java.util.Scanner;

public class VectSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();

        double[] array = new double[n];

        for(int i= 0; i < array.length; i++){
            System.out.print("Digite um numero: ");
            array[i] = input.nextDouble();
        }

        System.out.print("\nVALORES = ");
        for(int i = 0; i < array.length; i++){
            System.out.printf("%.1f  ",  array[i]);
        }

        double sum = 0;

        for(int i = 0; i< array.length; i++){
            sum = sum + array[i];
        }

        double media = sum / n;

        System.out.printf("\nSOMA = %.2f%nMEDIA = %.2f%n",sum, media);

        input.close();
    }
}
