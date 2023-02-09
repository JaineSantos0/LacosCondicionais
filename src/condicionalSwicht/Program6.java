package condicionalSwicht;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do colaborador: ");
        String colaborador = sc.nextLine();

        System.out.print("Cargo: ");
        int cargo = sc.nextInt();

        System.out.print("Salário: ");
        float salario = sc.nextFloat();

        switch (cargo){
            case 1:
                System.out.println("Nome do colaborador: " + colaborador);
                System.out.println("Cargo: Gerente");
                float reajuste = 0.1f;
                float reajusteSalario = salario + (salario * reajuste);
                System.out.printf("Salário: R$ %.2f",reajusteSalario);
                break;
            case 2:
                System.out.println("Nome do colaborador: " + colaborador);
                System.out.println("Cargo: Vendedor");
                reajuste = 0.07f;
                reajusteSalario = salario + (salario * reajuste);
                System.out.printf("Salário: R$ %.2f",reajusteSalario);
                break;
            case 3:
                System.out.println("Nome do colaborador: " + colaborador);
                System.out.println("Cargo: Supervisor");
                reajuste = 0.09f;
                reajusteSalario = salario + (salario * reajuste);
                System.out.printf("Salário: R$ %.2f",reajusteSalario);
                break;
            case 4:
                System.out.println("Nome do colaborador: " + colaborador);
                System.out.println("Cargo: Motorista");
                reajuste = 0.06f;
                reajusteSalario = salario + (salario * reajuste);
                System.out.printf("Salário: R$ %.2f",reajusteSalario);
                break;
            case 5:
                System.out.println("Nome do colaborador: " + colaborador);
                System.out.println("Cargo: Estoquista");
                reajuste = 0.05f;
                reajusteSalario = salario + (salario * reajuste);
                System.out.printf("Salário: R$ %.2f",reajusteSalario);
                break;
            case 6:
                System.out.println("Nome do colaborador: " + colaborador);
                System.out.println("Cargo: Técnico de TI");
                reajuste = 0.08f;
                reajusteSalario = salario + (salario * reajuste);
                System.out.printf("Salário: R$ %.2f",reajusteSalario);
                break;
            default:
                System.out.println("Código inválido!");
        }
    }
}