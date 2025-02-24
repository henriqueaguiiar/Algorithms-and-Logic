package StringManipulation;

public class _indexOf_lastIndexOf {
    public static void main(String[] args) {

    // metodo indexOf() que retorna um indice de uma ocorrencia passada como parametro ou seja ele busca dentro da string
        //o parametro digitado e caso tenha retorna o indice do mesmo, caso não encontre sempre vai retornar -1.

        //Teste para retornar -1
        String variavel1 = "Henrique";
        System.out.println(variavel1.indexOf("a"));

        System.out.println();

        //teste para retornar o indice da ocorrencia / caracter especificado como parametro.
        System.out.println(variavel1.indexOf("r"));

        System.out.println();

        //teste para retornar o indice da ocorrencia digitada, partindo/iniciando a busca pelo indice 2
        String variavel2 = "banana";
        System.out.println(variavel2.indexOf("a", 2));


        //teste lastIndexOf
        System.out.println();

        System.out.println(variavel1.lastIndexOf("i"));
        System.out.println(variavel2.lastIndexOf("i", 2));

    }
}
