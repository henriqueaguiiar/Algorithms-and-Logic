package VariablesAndConstants;

public class Ex1 {
    public static void main(String[] args) {
        //Declaração de Constantes com valores Imutaveis utilizando a palavra 'final'.
        final String nome = "Henrique";
        final int idade = 26;
        final double altura = 1.70;
        System.out.printf("Nome: %s%nIdade: %d%nAltura: %.2f",nome, idade, altura);
    }
}
// impressão de texto com concatenação print f:   %s = String,  %d = Inteiro, %.2f = Double com 2 casas decimais.
//Adicionar as variaveis na ordem que deseja que seja substituido pelos placeholders '%'.