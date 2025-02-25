package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();

        double[] array = new double[n];

        for(int i = 0; i < array.length; i++){
            System.out.print("Digite um numero: ");
            array[i] = input.nextDouble();
        }

        double maiorNumero = array[0];
        int posicao = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > maiorNumero){
                maiorNumero = array[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%n", maiorNumero);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicao);

        input.close();
    }
}
