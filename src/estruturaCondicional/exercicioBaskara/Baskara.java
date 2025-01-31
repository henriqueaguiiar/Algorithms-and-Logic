package estruturaCondicional.exercicioBaskara;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a,b,c,X1 = 0,X2 = 0, delta;

        System.out.println("Digite os 3 coeficiente da equação de 2º Grau");
        System.out.print("Coeficiente a: ");
        a = input.nextDouble();
        System.out.print("Coeficiente b: ");
        b = input.nextDouble();
        System.out.print("Coeficiente c: ");
        c = input.nextDouble();

        //calculando delta

        delta = b * b -4 * a * c;

        if(delta < 0){
            System.out.println("Essa equação não possui raizes reais");
        }
        else{
            //calculando as raizes usando baskara
          X1 = (-b + Math.sqrt(delta) / 2 * a);
          X2 = (-b - Math.sqrt(delta) / 2 * a);
        }
        System.out.printf("X1 = %.4f%nX2 = %.4f",X1, X2);

        input.close();
    }
}
