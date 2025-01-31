package estruturaSequencial.exercicioPagamento;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String name;
        double workHour, valueWorkHour, payment;

        System.out.print("Nome: ");
        name = input.nextLine();
        System.out.print("Valor por Hora trabalhada: ");
        valueWorkHour = input.nextDouble();
        System.out.print("Quantidade de horas trabalhadas: ");
        workHour = input.nextDouble();

        payment = valueWorkHour * workHour;

        System.out.printf("O pagamento para %s deve ser %.2f",name, payment);

        input.close();
    }
}
