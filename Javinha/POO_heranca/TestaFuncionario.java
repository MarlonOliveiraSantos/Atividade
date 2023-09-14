package Javinha.POO_heranca;

import Javinha.POO.Funcionario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean loop = true;
        int escolha = 0;

        do {
            System.out.println("Digite a opção 1 para continuar, caso não digite 2");
            escolha = ler.nextInt();

            if (escolha == 1) {
                try {
                    Gerente d1 = new Gerente("Marlon", "Gerente", 23, 80, 1.500, "4");
                    Gerente d2 = new Gerente("Katarina", "Gerente", 55, 67, 3.000, "9");

                    Vendedor d3 = new Vendedor("Rosivaldo", "Vendedor", 55, 67, 3.000, "60");
                    Vendedor d4 = new Vendedor("Edmarildo", "Vendedor", 55, 67, 3.000, "34");

                    d1.visualizar();
                    d2.visualizar();
                    d3.visualizar();
                    d4.visualizar();


                    FuncionarioGeral d5 = new FuncionarioGeral("Katarina", "Gerente", 55, 67, 3.000);

                    d5.receberSalario();
                    d5.descontarFerias();

                    loop = false;
                } catch (InputMismatchException e) {
                    System.err.println("\nExceção: " + e);
                    ler.nextLine();
                    System.out.println("\nDigite uma opção válida!");
                } finally {
                    System.out.println("\nSempre serei executada!\n");
                }

                } else if (escolha == 2) {
                    System.exit(0);
                } else {
                throw new RuntimeException("Digite uma opção válida!");
            }
        } while (loop);
    }
}
