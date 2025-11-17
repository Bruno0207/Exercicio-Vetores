import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int TAM = 10 ;
        int[] A = new int[TAM];
        int[] B = new int[TAM];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < TAM; i++) A[i] = in.nextInt();

        for (int i = 0; i < TAM; i++) {
            B[i] = (A[i] % 2 == 0) ? 1 : 0;
        }

        for (int x : B) System.out.print(x + " ");
    }
}





