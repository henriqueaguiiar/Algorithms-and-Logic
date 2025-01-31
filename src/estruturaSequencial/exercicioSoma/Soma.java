package estruturaSequencial.exercicioSoma;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, soma;

        x = input.nextInt();
        y = input.nextInt();

        soma = x + y;

        System.out.printf("SOMA = %d", soma);

        input.close();
    }
}
