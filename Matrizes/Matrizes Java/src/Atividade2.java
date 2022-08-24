import java.util.Random;

public class Atividade2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int M[][] = new int[3][4];
        int soma[] = new int[3];
        int R[][] = new int[3][4];
        int i,j;

        for(i = 0; i < M.length; i++){
            for(j = 0; j < M[0].length; j++){
                M[i][j] = rand.nextInt(10)+1;
                soma[i] = soma[i] + M[i][j];
            }
        }

        for(i = 0; i < R.length; i++) {
            for (j = 0; j < R[0].length; j++) {
                R[i][j] = soma[i] * M[i][j];
            }
        }

        System.out.println("\nM[][]= ");
        for(i = 0; i < M.length; i++){
            for(j = 0; j < M[0].length; j++){
                System.out.print("\t"+M[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nSoma[]=");
        for(i = 0; i < soma.length; i++) {
            System.out.print(soma[i] + "\t");
        }

        System.out.println();

        System.out.println("\nR[][]= ");
        for(i = 0; i < R.length; i++){
            for(j = 0; j < R[0].length; j++){
                System.out.print("\t"+R[i][j]);
            }
            System.out.println();
        }

    }
}
