package Javinha.POO_heranca;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean loop = true;
        int opcao;
        String[] clientesAntigos = new String[10];

        Optional<String> checaNulo = Optional.ofNullable(clientesAntigos[5]);

        if (checaNulo.isPresent()) {
            String clientesAntigo = clientesAntigos[5].toLowerCase();
            System.out.print(clientesAntigo);
        } else
            System.out.println("A palavra é nula!");

        do {
            System.out.println("Digite a opção 1 para continuar, caso não digite 2");
            opcao = ler.nextInt();

            if (opcao == 1) {
                try {
                    PessoaFisica c1 = new PessoaFisica("Marlon", "SaoPaulo", 23, 80, 1.85, "555555666");
                    PessoaFisica c2 = new PessoaFisica("Katarina", "SaoPaulo", 55, 67, 1.75, "444333777");

                    PessoaJuridica c3 = new PessoaJuridica("Ltda", "SaoPaulo", 55, 67, 1.75, "12345678912345");
                    PessoaJuridica c4 = new PessoaJuridica("Ltda", "SaoPaulo", 55, 67, 1.75, "12345678915050");

                    c1.visualizar();
                    c2.visualizar();
                    c3.visualizar();
                    c4.visualizar();


                    ClienteMaximo c5 = new ClienteMaximo("Katarina", "SaoPaulo", 55, 67, 1.75);

                    c5.resgatarBeneficios();
                    c5.comprar();

                    loop = false;
                } catch (InputMismatchException e) {
                    System.err.println("\nExceção: " + e);
                    ler.nextLine();
                    System.out.println("\nDigite uma opção válida!");
                } finally {
                    System.out.println("\nSempre serei executada!\n");
                }
            } else if (opcao == 2) {
                System.exit(0);
            } else {
                throw new RuntimeException("Digite uma opção válida!");
            }
        } while (loop);
    }
}
