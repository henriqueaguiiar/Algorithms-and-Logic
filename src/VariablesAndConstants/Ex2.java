package VariablesAndConstants;

public class Ex2 {
    public static void main(String[] args) {
        final String nome = "Henrique";
        int idade = 26;
        int ano = 2025;

        System.out.printf("%s tem %d no ano de  %d%n",nome, idade, ano);

        //sobrescrita de valores de variaveis não constantes.
        idade = 27;
        ano = 2026;
        System.out.printf("No ano de %d, %s vai ter %d anos de idade", ano, nome, idade);

    }
}
