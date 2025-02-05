package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números vocÊ vai digitar? ");
        int n = input.nextInt();

        while(n < 0 || n > 10){
            System.out.print("Digite um número valido entre 0 e 10: ");
            n = input.nextInt();
        }

        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = input.nextInt();
        }

        System.out.println("\nNúmeros Digitados: ");
        for(int i = 0; i < n; i++){
            System.out.println(vect[i]);
        }

        input.close();
    }
}
