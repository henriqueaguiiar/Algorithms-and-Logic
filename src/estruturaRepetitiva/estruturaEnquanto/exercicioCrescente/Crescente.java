package estruturaRepetitiva.estruturaEnquanto.exercicioCrescente;

import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois numeros: ");
        x = input.nextInt();
        y = input.nextInt();

        while(x != y){
            if(x > y){
                System.out.println("Decrescente");
            }
            else{
                System.out.println("Crescente");
            }
            System.out.println("Digite outros dois numeros: ");
            x = input.nextInt();
            y = input.nextInt();
        }
        input.close();
    }
}
