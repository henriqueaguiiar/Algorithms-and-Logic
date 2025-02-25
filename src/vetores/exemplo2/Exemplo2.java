package vetores.exemplo2;

import vetores.exemplo2.entities.Product;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //inicia a quantidade de elementos que o vetor vai ter

        System.out.println("Digite o número de elementos: ");
        int n = input.nextInt();


        // cria um vetor de n posições do tipo Product(classe)
        //Cria uma variavel vetor no stack do tipo referencia onde ela aponta para um vetor com n  ponteiros de memoria vazios no heap
        // ou seja para que possa armazenar um produto no indice do vetor vocÊ vai ter que instanciar um produto e fazer apontar para este objeto

        Product[] vetor = new Product[n];


        //for para digitar os parametros do objeto produto e criar um objeto apontando para a posição i.
        for(int i = 0; i < vetor.length; i++){ // vetor.length é a mesma coisa que o valor de n
            input.nextLine();// limpa a quebra de linha pendente
            String name = input.nextLine();
            double price = input.nextDouble();
            vetor[i] = new Product(name, price);
        }

        double soma = 0.0;

        //somando os preços dos objetos usando getprice para pegar apenas este atributo
        for (int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i].getPrice();
        }

        double media = soma / vetor.length;

        System.out.printf("Media: %.2f", media);

        input.close();
    }
}
