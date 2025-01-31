package estruturaSequencial.exercicioConsumo;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distanciaPercorrida;
        double combustivelGasto, consumoMedio;

        System.out.print("Distancia percorrida: ");
        distanciaPercorrida = input.nextInt();
        System.out.print("Combustivel gasto: ");
        combustivelGasto = input.nextDouble();

        consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("Consumo médio = %.3f",consumoMedio);

        input.close();
    }
}
