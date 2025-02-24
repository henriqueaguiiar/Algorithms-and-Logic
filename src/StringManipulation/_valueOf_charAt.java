package StringManipulation;

public class _valueOf_charAt {
    public static void main(String[] args) {

//Manipulação de Strings valueOf

        String variavel1 = "Henrique";
        double numero1 = 13.5;

        System.out.println("----VARIAVEIS-----");
        System.out.println(variavel1);
        System.out.println(numero1);
        System.out.println("\nUSANDO MANIPULAÇÃO DE STRING valueOf PARA CONVERTER EM STRING");

        // Transformando uma variavel em String utilizando o metodo valueOf para converter e amarzenar na variavel.
        String variavelConvertida = String.valueOf(numero1);

        System.out.println(variavel1);
        System.out.println("Variavel convertida em String: " + numero1);

        System.out.println("\n-- USANDO METODO charAT() PARA ACESSAR OS INDICES DA STRING GERADA COM valueOf");
        //usando mais um metodo para manipular string, charAt() para acessar os indices da String começando do indice 0. só é possivel porque
        //o numero foi convertido para string anteriormente utilizando o valueOf.
        System.out.println("Indice 0: "+variavelConvertida.charAt(0));
        System.out.println("Indice 1: "+variavelConvertida.charAt(1));
        System.out.println("Indice 2: "+variavelConvertida.charAt(2));
        System.out.println("Indice 3: "+variavelConvertida.charAt(3));
        System.out.println("String completa: "+ variavelConvertida);









    }
}
