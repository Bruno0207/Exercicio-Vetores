package prjAula1;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 20;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int i, j = 0;

        
        System.out.println("Digite os 20 elementos do vetor A:");
        for (i = 0; i < TAM; i++) {
            System.out.print("Vetor A" +(1+i)+": ");
            A[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            if (A[i] % 2 == 0) {
                B[j] = A[i];
                j++;
            }
        }

        for (i = 0; i < TAM; i++) {
            if (A[i] % 2 != 0) {
                B[j] = A[i];
                j++;
            }
        }

        
        System.out.println("Vetor B (Pares seguidos dos ímpares):");
        for (i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println(); 
        
    }
}
