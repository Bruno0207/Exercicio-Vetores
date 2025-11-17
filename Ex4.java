import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         final int TAM = 10;
        int[] A = new int[TAM];
        
        for (int i = 0; i < TAM; i++) {
              System.out.print("Vetor A" +(1+i)+": ");
            A[i] = in.nextInt();
        }

        for (int num : A) {
            System.out.print("A[" + num + "]: ");
            for (int p = 0; p <= num; p += 2) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

    
    }
}
