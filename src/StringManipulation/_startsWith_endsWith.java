package StringManipulation;

public class _startsWith_endsWith {
    public static void main(String[] args) {

        //manipulação de string utilizando startsWith() obs: é Case sensitive

        String variavel1 = "Henrique";

        //Usando o startsWith para verificar a variavel1 se inicia com o parametro especificado "Hen".
        boolean result = variavel1.startsWith("Hen", 1); // passando prefixo e off sete, ou seja inicia a verificação do indice 1
        boolean result2 = variavel1.startsWith("Hen");
        //Convertendo o resultado booleando em String usando valueOf para imprimir o resultado
        String booleanoConvertido = String.valueOf(result);
        System.out.println(booleanoConvertido);
        //imprimindo do jeito normal
        System.out.println(result2);

    //---------------------- endsWith -------------------------
        //verifica se a String termina com o prefixo informado. funciona semelhante com o startsWith

        System.out.println();
        String variavel2 = "Daniel";
        boolean resul3 = variavel2.endsWith("el");
        System.out.println(resul3);

        boolean result4 = variavel2.endsWith("Da");
        System.out.println(result4);

        String booleanoConvertido2 = String.valueOf(resul3);
        System.out.println(booleanoConvertido2);





    }
}
