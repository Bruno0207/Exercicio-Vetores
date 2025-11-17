package prjAula1;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        int[] A = new int[TAM];

        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < TAM; i++) {
                  System.out.print("Vetor A" +(1+i)+": ");

            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println("Tabuada do número " + A[i] + ":");
            
            int t = 1;
            while (t <= 10) {
                System.out.println(A[i] + " x " + t + " = " + (A[i] *t)); 
                t++; 
            }
        }

        
    }
}

