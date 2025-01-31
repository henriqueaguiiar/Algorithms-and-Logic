package estruturaSequencial.exercicioDuracao;

import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);

        double duracaoEmSegundos;

        int horas, minutos, segundos;

        System.out.print("Digite a duracao em segundos: ");
        duracaoEmSegundos = input.nextDouble();

        horas = (int)duracaoEmSegundos / 3600;
        minutos =  (int)duracaoEmSegundos % 3600 / 60;
        segundos = (int)(duracaoEmSegundos % 3600) % 60;

        System.out.println(horas+":"+minutos+":"+segundos);

        input.close();
    }
}
