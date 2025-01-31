package estruturaCondicional.exercicioTempoDeJogo;

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double  horaInicial, horaFinal, duracao;

        System.out.print("Hora Inicial: ");
        horaInicial = input.nextDouble();

        System.out.print("Hora Final: ");
        horaFinal = input.nextDouble();


        if(horaInicial >= horaFinal ){
            duracao = 24 - horaInicial + horaFinal;
        }
        else{
            duracao = horaFinal - horaInicial;
        }
        System.out.println("O Jogo durou: " + duracao + " hora(s)");

        input.close();
    }
}
