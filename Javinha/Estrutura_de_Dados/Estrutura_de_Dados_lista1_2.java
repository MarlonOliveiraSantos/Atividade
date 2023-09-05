package Javinha.Estrutura_de_Dados;

import java.util.Scanner;
import java.util.Stack;

public class Estrutura_de_Dados_lista1_2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        int opcao;

        System.out.println("1: Adicionar um novo Cliente na fila");
        System.out.println("2: Listar todos os Clientes");
        System.out.println("3: Retirar Cliente da fila");
        System.out.println("0: Sair");
        System.out.println("###########################");

        do {
            System.out.println("Digite uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um nome: ");
                    ler.nextLine();
                    String nome = ler.nextLine();
                    pilha.add(nome);

                    System.out.println("Pilha: \n");
                    for (String listaNome : pilha) {
                        System.out.println(listaNome );
                    }
                    System.out.println("\nLivro adicionado");

                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        System.out.println("Lista de Livros na Pilha:\n");
                        for (String listaNome : pilha) {
                            System.out.println(listaNome);
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.println("Pilha: \n");
                        pilha.pop();
                        for (String listaNome : pilha) {
                            System.out.println(listaNome);
                        }
                        System.out.println("\nUm Livro foi retirado da pilha!");
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
