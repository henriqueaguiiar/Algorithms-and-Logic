package estruturaCondicional;

public class SwitchStructureDecision {
    public static void main(String[] args) {



        //Switch recebe um valor em uma variave, e apartir deste valor controla os tipos de retorno:

        /*  Estrutura / sintaxe do switch:

        * switch(variavel){
        *   case 1:
        *       System.out.print("Iteração);
        *       break; // necessario passar o break em cada caso se não o switch ira realizar todas as iterações
            default:
             System.out.print("Iteração);
        * }
        * */

        int numero = 18;

        switch (numero){
            case 2:
                System.out.println("teste1");
                break;
            case 18:
                System.out.println("teste 2");
                break;
            default:
                System.out.println("teste 3");
        }

    }
}
