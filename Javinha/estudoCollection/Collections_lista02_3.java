package Javinha.estudoCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collections_lista02_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Set<Integer> lista = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            lista.add(ler.nextInt());
        }

        System.out.println("Listar dados do Set: ");
        for (int i : lista) {
            System.out.println(i);
        }


    }
}
