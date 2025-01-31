package estruturaSequencial.exercicioTerreno;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double  largura, comprimento, area, metroQuadrado, precoTerreno;

        System.out.print("Digite a largura do terreno: ");
        largura = input.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = input.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        metroQuadrado = input.nextDouble();

        area = largura * comprimento;
        precoTerreno = area * metroQuadrado;

        System.out.printf("Area do terreno = %.2f%n Preço do terreno = %.2f", area, precoTerreno);

        input.close();
    }
}
