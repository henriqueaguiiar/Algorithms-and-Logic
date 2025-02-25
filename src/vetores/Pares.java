package vetores;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = input.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < array.length; i++){
            System.out.print("Digite um número: ");
            array[i] = input.nextInt();
        }

        int contador = 0;

        System.out.println("\nNUMEROS PARES:");
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                contador++;
                System.out.printf("%d  ",array[i]);
            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d%n", contador);

        input.close();
    }
}
