package vetores;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = input.nextInt();

        double[] arrayA= new double[n];
        double[] arrayB= new double[n];
        double[] arrayC = new double[n];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < arrayA.length; i++){
            arrayA[i] = input.nextDouble();
        }
        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < arrayB.length; i++){
            arrayB[i] = input.nextDouble();
        }

        System.out.println("VETOR RESULTANTE: ");
        for(int i = 0; i < arrayC.length; i++){
            arrayC[i] = arrayA[i] + arrayB[i];
            System.out.println((int)arrayC[i]);
        }
        input.close();
    }
}
