package estruturaSequencial.exercicioMedidas;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a,b,c, areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.println("Digite o valor de A, B, C: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        areaQuadrado = a * a;
        areaTriangulo = a * b / 2;
        areaTrapezio = (a + b) * c / 2;

        System.out.printf("AREA DO QUADRADO = %.4f%nAREA DO TRIANGULO = %.4f%nAREA DO TRAPEZIO = %.4f",areaQuadrado, areaTriangulo,areaTrapezio);


        input.close();
    }
}
