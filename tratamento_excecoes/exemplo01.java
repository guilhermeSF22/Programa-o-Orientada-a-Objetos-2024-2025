package tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
      try {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = teclado.nextInt();
        System.out.println("numero: " + num);

        teclado.close();
       } catch (InputMismatchException e) {
        System.out.println("Dados Inválidos");
       } finally{
        System.out.println("Tente novamente.");
       }
 
    }
}
