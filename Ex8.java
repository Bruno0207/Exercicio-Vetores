import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10 ; 
        int[] A = new int[TAM];
        int[] B = new int[TAM];
         
         System.out.println ("Digite 10 numeros");
        for (int i = 0; i < TAM; i++) A[i] = in.nextInt();
        
         System. out. println("Resultado");
        for (int i = 0; i < TAM; i++) {
            int soma = 0;
            
          
            for (int j = i; j < TAM; j++) soma = soma + A[j];

            B[i] = soma;
        }

        for (int x : B) System.out.print(x + " ");
    }
}
