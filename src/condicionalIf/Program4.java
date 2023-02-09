package condicionalIf;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String caracteristica1 = sc.next();
        String caracteristica2 = sc.next();
        String caracteristica3 = sc.next();

       /*
       if (caracteristica1.contains("vertebrado") & caracteristica2.contains("ave") & caracteristica3.contains("carnivoro")) {
            System.out.print("Águia");
        } else if (caracteristica1.contains("vertebrado") & caracteristica2.contains("ave") & caracteristica3.contains("onivoro")) {
            System.out.print("Pomba");
        } else if (caracteristica1.contains("vertebrado") & caracteristica2.contains("mamifero") & caracteristica3.contains("onivoro")) {
            System.out.print("Homem");
        } else if (caracteristica1.contains("vertebrado") & caracteristica2.contains("mamifero") & caracteristica3.contains("herbivoro")) {
            System.out.print("Vaca");
        } else if (caracteristica1.contains("invertebrado") & caracteristica2.contains("inseto") & caracteristica3.contains("hematofago")) {
            System.out.print("Pulga");
        } else if (caracteristica1.contains("invertebrado") & caracteristica2.contains("inseto") & caracteristica3.contains("herbivoro")) {
            System.out.print("Lagarta");
        } else if (caracteristica1.contains("invertebrado") & caracteristica2.contains("anelideo") & caracteristica3.contains("hematofago")) {
            System.out.print("Sanguessuga");
        } else if (caracteristica1.contains("invertebrado") & caracteristica2.contains("anelideo") & caracteristica3.contains("onivoro")) {
            System.out.print("Minhoca");
        }
        */

        if (caracteristica1.equalsIgnoreCase("vertebrado")) {
            if (caracteristica2.equalsIgnoreCase("ave")) {
                if (caracteristica3.equalsIgnoreCase("carnivoro")) {
                    System.out.print("Águia");
                } else {
                    System.out.print("Pomba");
                }
            } else {
                if (caracteristica3.equalsIgnoreCase("onivoro")) {
                    System.out.print("Homem");
                } else {
                    System.out.print("Vaca");
                }
            }
        } else {
            if (caracteristica2.equalsIgnoreCase("inseto")) {
                if (caracteristica3.equalsIgnoreCase("hematofago")) {
                    System.out.print("Pulga");
                } else {
                    System.out.print("Lagarta");
                }
            } else {
                if (caracteristica3.equalsIgnoreCase("hematofago")) {
                    System.out.print("Sanguessuga");
                } else {
                    System.out.print("Minhoca");
                }
            }
        }
    }
}