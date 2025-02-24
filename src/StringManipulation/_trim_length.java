package StringManipulation;

public class _trim_length {
    public static void main(String[] args) {

        String variavel1 = "Henrique       ";

        //utiliza o metodo length de manipulação de string para exibir o tamanho da String/variavel
        System.out.println(variavel1.length());

        System.out.println();

        //Utiliza o metodo trim de manipulação de String para remover os espaços em branco da Variavel e depois o length para imprimir o tamanho
        System.out.println(variavel1.trim().length());

    }
}
