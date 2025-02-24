package VariablesAndConstants;

public class Ex4 {
    public static void main(String[] args) {

        // operando com variaveis com valores ja inicializados (Soma)

        int num1 = 5,
            num2 = 10,
            sum = 0;

        //sobrescrevendo variavel  inicializada com 0 com o resultado da soma.
        sum = num1 + num2;
        System.out.println(sum);

        //sobrescrevendo variavel sum novamente com resultado da multiplicação das variaveis
        sum = num1 * num2;
        System.out.println(sum);

        //sobrescrevendo variavel sum novamente com resultado da divisao das variaveis
        //Console vai imprimir apenas um número inteiro, visto que a divisão realizada é de dois numeros inteiros
        //Caso queria as casas decimais deve fazer um casting no resultado
        sum = num1 / num2;
        System.out.println(sum);

    }
}
