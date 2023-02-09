package condicionalIf;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int numeroParOuImpar = numero % 2;
        if (numeroParOuImpar == 0 & numero >= 0){
            System.out.print("O número " + numero + " é par e positivo!");
        } else if (numeroParOuImpar == 0 & numero < 0) {
            System.out.print("O número " + numero + " é par e negativo!");
        } else if (numero >=0) {
            System.out.print("O número " + numero + " é ímpar e positivo!");
        } else {
            System.out.print("O número " + numero + " é ímpar e negativo!");
        }
    }
}