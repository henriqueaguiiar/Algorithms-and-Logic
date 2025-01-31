package estruturaSequencial.exercicioIdades;

import java.util.Locale;
import java.util.Scanner;

public class Idades{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome1, nome2;
        double  idade1, idade2, media;

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        nome1 = input.nextLine();
        System.out.print("Idade: ");
        idade1 = input.nextDouble();
        input.nextLine();

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        nome2 = input.nextLine();
        System.out.print("Idade: ");
        idade2 = input.nextDouble();

        media = (idade1 + idade2) / 2;

        System.out.printf("A idade media de %s e %s eh de %.1f anos.",nome1,nome2,media);

        input.close();
    }
}
