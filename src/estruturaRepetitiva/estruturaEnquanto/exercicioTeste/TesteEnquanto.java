package estruturaRepetitiva.estruturaEnquanto.exercicioTeste;

import java.util.Scanner;

public class TesteEnquanto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, soma = 0;
        System.out.println("Digite um número: ");
        numero = input.nextInt();

        while(numero != 0){
            soma += numero;
            System.out.println("Digite um número: ");
            numero = input.nextInt();
        }
        System.out.println("SOMA = " + soma);

        input.close();
    }
}
