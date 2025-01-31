package estruturaSequencial.exercicioTroco;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double precoUnitario, valorEmDinheiro, troco;
        int quantidade;

        System.out.println("Preço unitario do produto: ");
        precoUnitario = input.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = input.nextInt();

        System.out.print("Dinheiro Recebido: ");
        valorEmDinheiro = input.nextDouble();

        troco = (precoUnitario * quantidade) - valorEmDinheiro;

        System.out.printf("TROCO = %.2f", troco);


        input.close();
    }
}
