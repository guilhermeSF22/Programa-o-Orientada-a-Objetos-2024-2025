package tratamento_excecoes.excecoes_personalizadas;

import java.util.Scanner;

import java.util.InputMismatchException;

public class principal {
    public static void main(String[] args) {
        
       try{
        Scanner teclado = new Scanner(System.in);

        System.out.println(" **** Informe os dados da conta: ****");

        System.out.print("Número: ");
        int num = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Cliente: ");
        String cliente = teclado.nextLine();

        System.out.print("Saldo Inicial: ");
        double saldo = teclado.nextDouble();

        System.out.print("Limite de Saque: ");
        double limiteSaque = teclado.nextDouble();

        conta c1 = new conta(num, cliente,saldo, limiteSaque);

        System.out.print("Informe o Valor Para Saque:");
        double saque = teclado.nextDouble();

        c1.saque(saque);
        System.out.println(c1.getSaldo());

        System.out.print("Informe o Valor Para Depósito: ");
        double deposito = teclado.nextDouble();

       c1.deposito(deposito);

       System.out.println(c1.getSaldo());

        teclado.close();
        
       }catch(InputMismatchException e){
        System.out.println("dado inválido");
       }
    
    }
}
