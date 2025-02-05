package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n;
        System.out.print("Quantas linhas vai ter a matriz? ");
        m = input.nextInt();;
        System.out.print("Quantas colunas vai ter a matriz? ");
        n = input.nextInt();;

        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("ELEMENTO [" + i + "," + j + "]:");
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatriz Digitada: ");

        for(int i = 0; i< m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }

        input.close();
    }
}
