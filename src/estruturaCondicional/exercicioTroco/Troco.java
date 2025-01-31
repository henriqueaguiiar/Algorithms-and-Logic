package estruturaCondicional.exercicioTroco;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double troco, precoProduto, dinheiroRecebido;

        System.out.print("Preço unitario produto: ");
         precoProduto = input.nextDouble();
        System.out.print("Quantidade Comprada: ");
        int quantidadeComprada = input.nextInt();
        System.out.print("Dinheiro recebido: ");
         dinheiroRecebido = input.nextDouble();

         double compra = precoProduto * quantidadeComprada;
         troco = dinheiroRecebido - compra;

         if(dinheiroRecebido < quantidadeComprada*precoProduto){
             System.out.println("DINHEIRO INSUFICIENTE PARA COMPRA");
         }
         else {
             System.out.printf("TROCO = %.2f", troco);
         }










        input.close();
    }
}
