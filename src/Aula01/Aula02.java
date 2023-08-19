package Aula01;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[4][5]; // Matriz de prateleiras por armários

        boolean encerrar = false;

        while (!encerrar) {
            System.out.println("Digite o número do armário (0-4) e o número da prateleira (0-3):");
            int armario = scanner.nextInt();
            int prateleira = scanner.nextInt();

            if (armario >= 0 && armario < 5 && prateleira >= 0 && prateleira < 4) {
                if (estoque[prateleira][armario] < 10) {
                    estoque[prateleira][armario]++;
                    System.out.println("Caixa adicionada com sucesso!");
                } else {
                    System.out.println("Espaço insuficiente na prateleira.");
                }
            } else {
                System.out.println("Armário ou prateleira inválidos.");
            }

            System.out.println("Deseja encerrar? (s/n)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("s")) {
                encerrar = true;
            }
        }

        // Mostrar a quantidade de caixas em cada prateleira/armário
        System.out.println("Quantidade de caixas em cada prateleira/armário:");
        for (int prateleira = 0; prateleira < 4; prateleira++) {
            for (int armario = 0; armario < 5; armario++) {
                System.out.print(estoque[prateleira][armario] + "\t");
            }
            System.out.println();
        }
    }
}
