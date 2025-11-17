import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];

        
        for (int i = 0; i < TAM; i++) {
            System.out.print("Vetor A" +(1+i)+": ");
            A[i] = in.nextInt();
        }
           System.out.println(); 
           
        for (int num : A) {
            System.out.print("Divisores de " + num + ": ");
            for (int d = 1; d <= num; d++) {
                if (num % d == 0) {
                    System.out.print(d + " ");
                }
            }
            System.out.println();
        }

        
    }
}
