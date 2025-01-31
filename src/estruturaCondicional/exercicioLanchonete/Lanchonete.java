package estruturaCondicional.exercicioLanchonete;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("+--------------------------------------+");
        System.out.println("|        MENU DE PRODUTOS              |");
        System.out.println("+--------------------------------------+");
        System.out.printf("| %-10s | %-10s |\n", "Código", "Preço (R$)");
        System.out.println("+--------------------------------------+");
        System.out.printf("| %-10d | %-10.2f |\n", 1, 5.00);
        System.out.printf("| %-10d | %-10.2f |\n", 2, 3.50);
        System.out.printf("| %-10d | %-10.2f |\n", 3, 4.80);
        System.out.printf("| %-10d | %-10.2f |\n", 4, 8.90);
        System.out.printf("| %-10d | %-10.2f |\n", 5, 7.32);
        System.out.println("+--------------------------------------+");

        int codigoCardapio, quantidade;
        double valorPagar =0;

        System.out.print("Digite o código do produto: ");
        codigoCardapio = input.nextInt();
        System.out.print("Digite a quantidade: ");
        quantidade = input.nextInt();

        switch(codigoCardapio){
            case 1:
                valorPagar = quantidade * 5.00;
                break;
            case 2:
                valorPagar = quantidade * 3.50;
                break;
            case 3:
                valorPagar = quantidade * 4.80;
                break;
            case 4:
                valorPagar = quantidade * 8.90;
                break;
            case 5:
                valorPagar = quantidade * 7.32;
                break;
            default:
                System.out.println("Código Invalido!");
                break;
        }
        System.out.printf("Valor a pagar: %.2f", valorPagar);
        input.close();
    }
}
