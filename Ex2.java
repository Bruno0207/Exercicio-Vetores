package prjAula1;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o elemento do vetor A: ");
        int TAM = in.nextInt();
        int[] A = new int[TAM];

        System.out.println("Digite " + TAM + "Números inteiros:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Vetor A" +(1+i)+": ");
            A[i] = in.nextInt();
        }

        int contadorPrimos = 0;
        System.out.println("Resultado da verificação de primos:");

        for (int num : A) {
            if (num <= 1) {
                System.out.println("num" + " não é um número primo.");
                continue;
            }

            int divisores = 0; 
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 0) {
                System.out.println(num + "É um número primo.");
                contadorPrimos++;
            } else {
                System.out.println(num + "Não é um numero primo.");
            }
        }

        System.out.println("Total de numeros primos no vetor: " + contadorPrimos);
        
    }
}
