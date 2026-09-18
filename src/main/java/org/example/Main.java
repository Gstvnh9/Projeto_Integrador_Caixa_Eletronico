package org.example;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    static void main() {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);

        int menu = 0;
        double saldo = 0.0;
        double deposito = 0;
        double saque = 0;

        do {

            System.out.println("== MENU INTERATIVO ==");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair");
            System.out.println("=====================");
            menu = entrada.nextInt();

            while (menu > 4) {

                System.out.println("Insira uma opção válida, por favor!");
                menu = entrada.nextInt();

            }

            if (menu == 1) {

                System.out.println("Seu saldo atual se encontra no valor de R$ " + saldo + ".");

                System.out.println("Pressione enter para voltar ao menu interativo...");
                entrada.nextLine();
                entrada.nextLine();

            } else if (menu == 2) {

                System.out.println("Insira o valor para depósito:");
                deposito = entrada.nextDouble();

                while (deposito <= 0) {

                    System.out.println("Insira um valor adequado para depósito:");
                    deposito = entrada.nextDouble();

                }

                    System.out.println("Depósito Realizado!");
                    saldo = saldo + deposito;

                    System.out.println("Pressione enter para voltar ao menu interativo...");
                    entrada.nextLine();
                    entrada.nextLine();

            } else if (menu == 3) {

                    System.out.println("Insira o valor que você deseja sacar:");
                    saque = entrada.nextDouble();

                while (saque > saldo) {

                    System.out.println("Você não tem este valor disponível. Insira uma quantidade adequada ao seu saldo:");
                    saque = entrada.nextDouble();

                }

                    System.out.println("Saque Realizado!");
                    saldo = saldo - saque;

                    System.out.println("Pressione enter para voltar ao menu interativo...");
                    entrada.nextLine();
                    entrada.nextLine();

            }

        } while (menu == 1 || menu == 2 || menu == 3);

        if (menu == 4) {

            System.out.println("Obrigado por usar nosso sistema!");
            System.out.println("Até Logo!");

        }

    }
}
