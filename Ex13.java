import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int TAM= 10;
        int[] A = new int[TAM];
         System.out.println("Digite 10 numeros ");
        for (int i = 0; i < TAM; i++) A[i] = in.nextInt();

        int erros = 0;

        for (int i = 0; i < 5; i++) {
            if (A[i] != A[9 - i]) erros = erros + 1;
        }

        if (erros == 0) System.out.println("É palíndromo");
        else System.out.println("Não é palíndromo");
    }
}



