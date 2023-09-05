package Javinha.Estrutura_de_Dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Estrutura_de_Dados_lista1_1 {
    public static void main(String[] args) {
//Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//2: Listar todos os Clientes na fila
//3: Chamar (retirar) uma pessoa da fila
//0: O programa deve ser finalizado.
//Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..


        Scanner ler = new Scanner(System.in);
        Queue<String> fila = new LinkedList<String>();
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
                    String nome = ler.next();
                    fila.add(nome);

                    System.out.println("Fila: \n");
                    for (String listaNome : fila) {
                        System.out.println(listaNome );
                    }
                    System.out.println("\nCliente Adicionado!");

                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        for (String listaNome : fila) {
                            System.out.println(listaNome);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.println("Fila: ");
                        fila.remove();
                        for (String listaNome : fila) {
                            System.out.println(listaNome);
                        }
                        System.out.println("O Cliente foi Chamado!");
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
