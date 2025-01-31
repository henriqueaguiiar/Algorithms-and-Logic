package estruturaCondicional.exercicioMenorDeTres;

import java.util.Scanner;

public class MenoDeTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, menor;

        System.out.println("Digite os 3 valores: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a < b && a < c){
            menor = a;
        }
        else if(b < c){
            menor = b;
        }
        else{
            menor = c;
        }

        System.out.println("MENOR = " + menor);

        input.close();
    }
}
