package exercicio3;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();

            soma = soma + notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\nNotas cadastradas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Média final: " + media);

        scanner.close();
    }
}