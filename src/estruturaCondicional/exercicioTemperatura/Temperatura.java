package estruturaCondicional.exercicioTemperatura;


import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input  = new Scanner(System.in);

        double C, F;
        char response = 'C';
        System.out.print("Deseja Calcular Celcius ou Fahrenheit ? C / F: ");
        response = input.next().charAt(0);

        if(response == 'C'){
            System.out.print("Digite Celcius: ");
            C = input.nextDouble();
            F = C * 1.8 + 32;
            System.out.printf("Temperatura equivalente a Fahrenheit: %.2f" ,F);
        }
        else {
            System.out.print("Digite Fahrenheit: ");
            F = input.nextDouble();
            C = 5.0 / 9.0 * (F  - 32);
            System.out.printf("Temperatura equivalente a Celcius: %.2f", C);
        }
        input.close();
    }
}
