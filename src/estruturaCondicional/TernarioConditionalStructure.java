package estruturaCondicional;

public class TernarioConditionalStructure {
    public static void main(String[] args) {


        /*Operador ternario, equivalente ao if else, usado apenas quando se tem 2 possibilidades */

    int numero = 25;

    //sintaxe ternario a operação é armazenada em uma variavel primeira condição antes dos : verdadeiro  se não imprime a outra condição.

        // <Tipo> < nome> = (comparação) ? primeira ação caso verdadeiro : segunda ação caso falso;

    String resposta = (numero <= 18) ? "É menor de idade " : "É maior de idade";

        System.out.println(resposta);


    }
}
