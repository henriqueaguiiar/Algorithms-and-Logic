package vetores;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos números você vai digitar? (minimo 1 maximo 10): ");
            n = input.nextInt();
        } while (n < 1 || n > 10);

        int[] array = new int[n];

        for(int i = 0; i< array.length; i++){
            System.out.print("Digite um numero: ");
            array[i] = input.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for(int i = 0; i< array.length; i++){
            if(array[i] < 0){
                System.out.println(array[i]);
            }
        }
        input.close();
    }
}


