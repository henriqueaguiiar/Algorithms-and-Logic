package vetores;

public class ArraySimples {
    public static void main(String[] args) {

//Estrutura de dados: Lista / Array Simples

        //uma lista sempre começa do indice 0 e sempre são criados ja com tamanho fixo.

        //formas primitiva de criar um array e ja atribuir seus valores aos indices e o tamanho.

        int[] array1 = {0,1,2,3,4};
        System.out.println(array1[2]); // acessando a posição 2 do array

        //int []array2 = {0,1,2,3,4};
        //int array3[] = {0,1,2,3,4};

        //----------------------------------

        int[] array4 = new int[6];
        array4[0] = 2000;
        array4[1] = 2001;
        array4[2] = 2002;
        array4[3] = 2003;
        array4[4] = 2004;
        array4[4] = 2005;

        System.out.println(array4[3]);





    }
}
