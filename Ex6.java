import java.util.Scanner;    
    public class Ex6 {

    public static void main(String[] args) {
     
       final  int  TAM =11 ;
        int[] vetorA = new int[TAM];

         System.out.println ("Digite 10 numeros");
        for (int i = 0; i < TAM; i++) {
            // 1 << i é a formula para calucular  2^i em Java
            vetorA[i] = 1 << i;
        }
         
        System.out.println("Vetor A :");
        System.out.print("[");
        
        for (int i = 0; i < TAM; i++) {
            System.out.print(vetorA[i]);
        
            if (i < TAM- 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}