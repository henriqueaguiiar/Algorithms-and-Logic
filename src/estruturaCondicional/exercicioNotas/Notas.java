package estruturaCondicional.exercicioNotas;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double nota1, nota2, notaFinal;


        System.out.print("Digite a primeta nota: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        notaFinal = nota1 + nota2;

        if(notaFinal >= 60.0){
            System.out.printf("NOTA FINAL = %.1f",notaFinal);
        }
        else {
            System.out.printf("NOTA FINAL = %.1f%nREPROVADO",notaFinal);
        }

        input.close();
    }
}
