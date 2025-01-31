package estruturaSequencial.exercicioRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double  base, altura, area, perimetro, diagonal;

        System.out.print("Digite o valor da Base: ");
        base = input.nextDouble();
        System.out.print("Digite o valor da Altura: ");
        altura = input.nextDouble();

        area = base * altura;
        perimetro = (2 * base ) + (2 * altura);
        diagonal = Math.sqrt((base*base)+(altura*altura));

        System.out.printf("Area do retangulo = %.2f%nPerimetro = %.2f%nDiagonal = %.2f",area, perimetro,diagonal);


        input.close();
    }
}
