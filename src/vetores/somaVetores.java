package vetores;

import java.util.Locale;
import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        double soma, media;
        System.out.print("Quantos numeros vocÊ vai digitar? ");
        n = input.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = input.nextDouble();
        }

        for(int i = 0; i < n; i++){
            System.out.print("VALORES = ");
            System.out.print(String.format("%.1f ",vect[i]));
        }

        soma = 0;
        for(int i = 0; i < n; i++){
            soma = soma + vect[i];
        }

        System.out.println("SOMA = " + String.format("%.2f ",soma));

        media = soma / n;
        System.out.println("MEDIA = " + String.format("%.2f ", media));

        input.close();
    }
}
