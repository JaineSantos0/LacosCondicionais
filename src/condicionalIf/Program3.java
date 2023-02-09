package condicionalIf;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Nome do doador: ");
        String doador = sc.nextLine();
        System.out.print("Digite a Idade do doador: ");
        int idade = sc.nextInt();
        System.out.print("Primeira doação de sangue? ");
        boolean doacao = sc.nextBoolean();

        if (idade >= 18 & idade <60) {
            System.out.print(doador + " está apto para doar sangue!");
        } else if ((idade >= 60 & idade <= 69) & !doacao) {
            System.out.print(doador + " está apto para doar sangue!");
        } else {
            System.out.print(doador + " não está apto para doar sangue!");
        }
    }
}