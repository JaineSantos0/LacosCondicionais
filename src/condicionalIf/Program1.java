package condicionalIf;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int numeroA = sc.nextInt();

        System.out.print("Digite o número B: ");
        int numeroB = sc.nextInt();

        System.out.print("Digite o número C: ");
        int numeroC = sc.nextInt();

        int calculoAB = numeroA + numeroB;

        System.out.println(numeroA + " + " + numeroB + " = " + calculoAB + " > " + numeroC);

        if (calculoAB > numeroC) {
            System.out.print("A Soma de A + B é Maior do que C");
        } else if (calculoAB < numeroC) {
            System.out.print("A Soma de A + B é Menor do que C");
        } else {
            System.out.print("A Soma de A + B é Igual a C");
        }
    }
}