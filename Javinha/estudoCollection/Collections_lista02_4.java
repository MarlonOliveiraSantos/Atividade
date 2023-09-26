package Javinha.estudoCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collections_lista02_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Set<Integer> lista = new HashSet<>();
        int n;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            lista.add(ler.nextInt());
        }
        System.out.println("Digite o número que você deseja encontrar: ");
        n = ler.nextInt();

        if (lista.contains(n)) {
            System.out.println("O número " + n + " foi encontrado!");
        } else {
            System.out.println("O número " + n + " não foi encontrado!");
        }
    }
}
