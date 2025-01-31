package estruturaCondicional.exercicioGlicose;


import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a media da glicose: ");
        double glicose = input.nextDouble();

        if(glicose > 140.00){
            System.out.println("Diabetes");
        }
        else if(glicose >= 100.00){
            System.out.println("Elevada");
        }
        else {
            System.out.println("Normal");
        }

        input.close();
    }
}
