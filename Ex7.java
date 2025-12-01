import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 15; 
        int[] A = new int[TAM];
        int[] B = new int[TAM];

         System. out. println("Digite 15 numeros :");
        for (int i = 0; i < TAM; i++) A[i] = in.nextInt();
        
        System. out. println("Fatoração") ;
        for (int i = 0; i < TAM; i++) {
            int r = 1;
            for (int j = 1; j <= A[i]; j++) r = r * j;
            B[i] = r;
        }

        for (int x = B) System.out.println(x);
       
    }

}
