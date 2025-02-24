package StringManipulation;

public class _replace_substring {
    public static void main(String[] args) {


        //metodo replace, usa para substituir um argumento passado por outro

        String varivael1 = "banana";
        System.out.println(varivael1.replace("a", "4")); // substitui caracter a por 4

        //metodo substring,  o mesmo retorna uma nova string  partir do intervalo passado como argumento.

        //o mesmo imprime tudo que esta no intervalo entre 0 e 4 ou seja 123 o segundo indice não é imprimido ou seja
        //declarando o 4 como limite só vai ser imprimido até o indice 3
        System.out.println(varivael1.substring(1, 4));



    }
}
