package estruturaSequencial.exercicioAntecessor;

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();


        System.out.println("O numero digitado é: " + numero);
        int antecessor = numero -1;
        System.out.println("O seu antecessor é: " + antecessor);
        int sucessor = numero +1;
        System.out.println("O seu Sucessor é " + sucessor);

        input.close();
    }
}
