import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int TAM = 9 ;
        int[] A = new int[TAM];
        
        System.out.println("Digite 10 numeros ");
        for (int i = 0; i < TAM; i++) A[i] = in.nextInt();

        int x = in.nextInt();
        int cont = 0;

        for (int i = 0; i < TAM; i++) {
            if (A[i] == x) cont = cont + 1;
        }

        if (cont > 0) System.out.println("Encontrado");
        else System.out.println("Não encontrado");
    }
}


