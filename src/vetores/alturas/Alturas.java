package vetores.alturas;

import vetores.alturas.entities.Pessoas;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();

        Pessoas[] array = new Pessoas[n];

        for (int i = 0; i < array.length; i++){
            input.nextLine();
            int posicao = i;
            System.out.printf("Dados da %d pessoa: ",posicao + 1);
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            array[i] = new Pessoas(nome, idade, altura);
        }

        double sum = 0.0;
        int menores = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i].getIdade() < 16){
                menores = menores +1;
            }
            sum = sum + array[i].getAltura();
        }

        double avg = sum / array.length;
        double percentualMenores = ((double)menores / array.length) * 100.0;

        System.out.printf("Altura média: %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores);

        for(int i = 0; i < array.length; i++){
            if(array[i].getIdade() < 16){
                System.out.println(array[i].getNome());
            }
        }

        input.close();
    }
}
