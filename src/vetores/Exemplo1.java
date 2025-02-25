package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);



        System.out.printf("Digite o numero de pessoas: ");
        int n = input.nextInt();

        double[] array = new double[n]; // Cria um array com o nº de posições digitados usando a variavel n.

        //for realiza as repetições para digitar o valor de cada indice do array.
        for(int i = 0; i < n; i++) {
            System.out.println("Digite a altura: ");
            array[i] = input.nextDouble();
        }

        //for percorre o array somando os valores na variavel soma
        double soma = 0.0;
        for(int i = 0; i< n; i++){
            soma += array[i];
        }
        //calcula média das variaveis.
        double media = soma / n;

        System.out.printf("Média: %.2f%n", media);

        input.close();
    }
}
