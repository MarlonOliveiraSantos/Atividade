package Javinha.estudoCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections_lista01_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int n;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numeros.add(ler.nextInt());
        }
        System.out.println("Digite o número que você deseja encontrar: ");
        n = ler.nextInt();

        int indice = numeros.indexOf(n);

        System.out.println("O número " + n + " está localizado na posição: " + indice);
    }
}
