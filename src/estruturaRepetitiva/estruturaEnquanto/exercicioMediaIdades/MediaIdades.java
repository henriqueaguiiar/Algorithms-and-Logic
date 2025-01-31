package estruturaRepetitiva.estruturaEnquanto.exercicioMediaIdades;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double media;
        int idade = 0, soma = 0, contador = 0;

        System.out.println("Digite as idades: ");
        idade = input.nextInt();

        if(idade < 0){
            System.out.println("Impossivel Calcular");
        }else{
            while(idade >= 0){
                soma += idade;
                contador = contador +1;
                idade = input.nextInt();
            }
            media = (double) soma / contador;
            System.out.printf("MEDIA = %.2f%n", media);
        }
        input.close();
    }
}
