package condicionalSwicht;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do produto: ");
        int codigo = sc.nextInt();;
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        switch (codigo) {
            case 1 :
                System.out.println("Produto: Cachorro Quente");
                float calculo = 10.00f * quantidade;
                System.out.printf("Valor total: R$ %.2f",calculo);
                break;
            case 2 :
                System.out.println("Produto: X-Salada");
                calculo = 15.00f * quantidade;
                System.out.printf("Valor total: R$ %.2f",calculo);
                break;
            case  3:
                System.out.println("Produto: X-Bacon");
                calculo = 18.00f * quantidade;
                System.out.printf("Valor total: R$ %.2f",calculo);
                break;
            case 4:
                System.out.println("Produto: Bauru");
                calculo = 12.00f * quantidade;
                System.out.printf("Valor total: R$ %.2f",calculo);
                break;
            case 5:
                System.out.println("Produto: Refrigerante");
                calculo = 8.00f * quantidade;
                System.out.printf("Valor total: R$ %.2f",calculo);
                break;
            case 6:
                System.out.println("Produto: Suco de laranja");
                calculo = 13.00f * quantidade;
                System.out.printf("Valor total: R$ %.2f",calculo);
                break;
            default:
                System.out.println("Código inválido!");
        }
    }
}