package estruturaCondicional;

public class ConditionalStructureIF {
    public static void main(String[] args) {

        // Operadores de comparação
        // == igual, >= maior igual, <= = menor igual < = menor > = maior, != = diferente, && = and, || = or, ! = not;

        // ----------------- conditional structure if / else ----------------
        //usando estrutura de decisão if else com sobrescrita de variavel
        int numero1 = 10, numero2 = 15, maior;

        if(numero1 > numero2){
            maior = numero1;
            System.out.println("Maior numero = " + maior);
        }else if (numero1 == numero2){
            System.out.println("Numeros Iguais");
        }else{
            maior = numero2;
            System.out.println("Maior numero = " + maior);
        }

    }
}
