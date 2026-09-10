package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros cadastrados:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}

