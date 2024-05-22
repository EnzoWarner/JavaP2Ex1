package Exercicio1;

import java.util.Scanner;

public class JavaP2Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de elementos nos vetores X e Y:");
        int p = scanner.nextInt();

        int[] X = new int[p];
        int[] Y = new int[p];
        double[] Z = new double[p];

        System.out.println("Insira os elementos do vetor X:");
        for (int i = 0; i < p; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.println("Insira os elementos do vetor Y:");
        for (int i = 0; i < p; i++) {
            Y[i] = scanner.nextInt();
        }

        for (int i = 0; i < p; i++) {
            try {
                Z[i] = (double) X[i] / Y[i];
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero. Definindo Z[" + i + "] como 0.");
                Z[i] = 0.0;
            }
        }

        System.out.println("O vetor Z, resultado da divisão, é:");
        for (int i = 0; i < p; i++) {
            System.out.println(Z[i]);
        }
    }
}
