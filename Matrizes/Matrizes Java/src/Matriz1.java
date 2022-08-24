import java.util.Random;
import java.util.Scanner;

public class Matriz1{
    public static final int DIM = 5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int M[][] = new int[DIM][2 * DIM];
        int R[][] = new int[DIM][2 * DIM];
        int i, j, maior;

        for (i = 0; i < M.length; i++) {
            for (j = 0; j < M[0].length; j++) {
                System.out.print("Elemento lin " + i + ", col " + j + ": ");
                M[i][j] = rand.nextInt(20) + 1;
            }
        }

        maior = M[0][0];
        for (i = 0; i < M.length; i++) {
            for (j = 0; j < M[i][j]; j++) {
                if (M[i][j] > maior) {
                    maior = M[i][j];
                }
            }
        }

        for(i = 0; i < R.length; i++) {
            for (j = 0; j < R[i].length; j++) {
                R[i][j] = maior * M[i][j];
            }
        }

        System.out.println("\nM[][]= ");
        for(i = 0; i < M.length; i++){
            for(j = 0; j < M[0].length; j++){
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nR[][]= ");
        for(i = 0; i < R.length; i++){
            for(j = 0; j < R[0].length; j++){
                System.out.print("\t" + R[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
