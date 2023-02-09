package condicionalSwicht;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Operação: ");
        int operacao = sc.nextInt();

        float saldo = 1000.00f;

        switch (operacao) {
            case 1:
                System.out.println("Operação - Saldo");
                System.out.printf("Saldo: R$ %.2f",saldo);
                break;
            case 2:
                System.out.print("Valor: R$ ");
                float valorSaque = sc.nextFloat();
                float calculoSaque = saldo - valorSaque;
                System.out.println("Operação - Saque");
                if (calculoSaque < 0.0f) {
                    System.out.print("Saldo Insuficiente!");
                } else {
                    System.out.printf("Novo saldo: R$ %.2f",calculoSaque);
                }
                break;
            case 3:
                System.out.print("Valor: R$");
                float valorDeposito = sc.nextFloat();
                float calculoDeposito = saldo + valorDeposito;
                System.out.println("Operação - Depósito");
                System.out.printf("Novo saldo: R$ %.2f",calculoDeposito);
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
}