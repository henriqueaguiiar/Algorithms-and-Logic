package estruturaSequencial.exercicioCirculo;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double raio, area;

        System.out.print("Digite o valor do raio do circulo: ");
        raio = input.nextDouble();

        area = Math.PI * raio * raio;

        System.out.printf("AREA = %.3f", area);

        input.close();
    }
}
