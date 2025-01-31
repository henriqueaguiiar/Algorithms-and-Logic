package estruturaRepetitiva.estruturaEnquanto.exercicioSenha;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senhaCorreta = 2002, senha = 0;

        System.out.print("Digite a senha: ");
        senha = input.nextInt();

        while(senha != senhaCorreta){
            System.out.print("Senha Invalida! Tente Novamente: ");
            senha = input.nextInt();
        }
        System.out.println("Acesso permitido!");

        input.close();
    }
}
