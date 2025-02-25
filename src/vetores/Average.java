package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();

        double[] array = new double[n];

        for(int i = 0; i< array.length; i++){
        System.out.print("Digite um numero: ");
        array[i] = input.nextDouble();
        }

        double sum = 0.0, avg;

        for (int i =0; i < array.length; i++){
            sum = sum + array[i];

        }
        avg = sum / array.length;

        System.out.printf("MEDIA DO VETOR = %.3f%n", avg);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i < array.length; i++){
            if(array[i] < avg){
                System.out.printf("%.1f%n",array[i]);
            }
        }

        input.close();
    }
}
