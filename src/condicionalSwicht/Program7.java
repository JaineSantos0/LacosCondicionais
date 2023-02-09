package condicionalSwicht;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        float numero1 = sc.nextFloat();

        System.out.print("Digite o 2º número: ");
        float numero2 = sc.nextFloat();

        System.out.print("Operação: ");
        int operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                float calculoSoma = numero1 + numero2;
                System.out.printf("%.1f + %.1f = %.1f",numero1,numero2,calculoSoma);
                break;
            case 2:
                float calculoSubtracao = numero1 - numero2;
                System.out.printf("%.1f + %.1f = %.1f",numero1,numero2,calculoSubtracao);
                break;
            case 3:
                float calculoMultiplicacao = numero1 * numero2;
                System.out.printf("%.1f + %.1f = %.1f",numero1,numero2,calculoMultiplicacao);
                break;
            case 4:
                float calculoDivisao = numero1 / numero2;
                System.out.printf("%.1f + %.1f = %.1f",numero1,numero2,calculoDivisao);
                break;
            default:
                System.out.print("Operação Inválida!");
        }
    }
}