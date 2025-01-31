package estruturaCondicional.exercicioAumento;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("===== Menu de Aumento Salarial =====");
        System.out.println("Faixa Salarial           | Percentual de Aumento");
        System.out.println("Até R$ 1000.00           | 20%");
        System.out.println("R$ 1000.01 a R$ 3000.00  | 15%");
        System.out.println("R$ 3000.01 a R$ 8000.00  | 10%");
        System.out.println("Acima de R$ 8000.00      | 5%");
        System.out.println("=====================================");

        double salario, novoSalario,aumento, porcentagem;


        System.out.print("Digite o salario: ");
        salario = input.nextDouble();

        if(salario <= 1000.00){
            porcentagem = 0.20;
        }
        else if(salario <= 3000.00){
            porcentagem = 0.15;
        }
        else if(salario <= 8000.00){
            porcentagem =  0.10;
        }
        else{
            porcentagem = 0.05;;
        }

        aumento = salario * porcentagem;
        novoSalario = salario + aumento;

        System.out.printf("Novo Salario: %.2f%n", novoSalario);
        System.out.printf("Aumento: %.2f%n", aumento);
        System.out.printf("Porcentagem: %.0f%%%n", porcentagem * 100);

        input.close();
    }
}
